package user.api;

import ad.Ad;
import businesslogic.Engine;
import businesslogic.filters.Filter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class EngineAPI {

    public static String getAds(String input) {
        Type filterListType = new TypeToken<List<Filter<Ad>>>() {}.getType();
        List<Filter<Ad>> filters = new Gson().fromJson(input, filterListType);
        List<Ad> ads = filter(filters);
        Type stringfilter = new TypeToken<List<Filter<Ad>>>() {}.getType();
        return new Gson().toJson(stringfilter);
    }

    private static List<Ad> filter(List<Filter<Ad>> filters) {
        return Engine.getFiltered(StorageAPI.getAds(), filters);
    }
}
