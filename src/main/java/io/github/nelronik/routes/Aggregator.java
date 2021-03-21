package io.github.nelronik.routes;

import java.util.stream.Stream;

public interface Aggregator<T> {
    T aggreagate(Stream<T> input);
    
    interface Method<T, U, V> {
        V execute(T t, U u);
    }
}
