package user.api;

import ad.Ad;
import storage.Row;
import storage.Storage;

import java.util.List;

public class StorageAPI {
    public static List<Ad> getAds() {
        return Storage.getInstance().get().stream().map(x -> x.ad).toList();
    }
}
