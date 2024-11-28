package user;


import com.google.gson.Gson;
import user.api.EngineAPI;

public class RequestAPI {
    // create AD
    public static void POST()
    {

    }

    // deletes my add
    public static void DELETE()
    {

    }

    // gets ads filtered
    public static String GET(String json)
    {
        return EngineAPI.getAds(json);
    }

    // updates
    public static void PUT()
    {

    }
}

