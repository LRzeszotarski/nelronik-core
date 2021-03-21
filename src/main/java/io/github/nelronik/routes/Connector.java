package io.github.nelronik.routes;

import java.util.stream.Stream;

public interface Connector<T> {
    Stream<T> fetch();
}
