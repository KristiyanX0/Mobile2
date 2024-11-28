package businesslogic.filters;

import java.util.function.Predicate;

public class Filter<T> {
    private Predicate<T> predicate;

    public Filter(Predicate<T> predicate) {
        this.predicate = predicate;
    }

    public Predicate<T> getPredicate() {
        return predicate;
    }

    public Filter<T> and(Filter<T> other) {
        return new Filter<>(this.predicate.and(other.getPredicate()));
    }

    public Filter<T> or(Filter<T> other) {
        return new Filter<>(this.predicate.or(other.getPredicate()));
    }

    public Filter<T> negate() {
        return new Filter<>(this.predicate.negate());
    }

    @Override
    public String toString() {
        return "Filter{" +
                "predicate=" + predicate +
                '}';
    }
}
