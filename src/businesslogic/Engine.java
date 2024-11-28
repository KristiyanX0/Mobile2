package businesslogic;

import ad.Ad;
import businesslogic.filters.Filter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Engine {
    public static List<Ad> getFiltered(List<Ad> ads, List<Filter<Ad>> filters) {
        Predicate<Ad> combinedPredicate = combineFilters(filters);

        return ads.stream()
                .filter(combinedPredicate)
                .collect(Collectors.toList());
    }

    private static Predicate<Ad> combineFilters(List<Filter<Ad>> filters) {
        Predicate<Ad> combinedPredicate = ad -> true;

        for (Filter<Ad> filter : filters) {
            combinedPredicate = combinedPredicate.and(filter.getPredicate());
        }

        return combinedPredicate;
    }
}
