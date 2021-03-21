package io.github.nelronik.routes;

public interface Dispatcher<T> {
    void dispatch(T value);
}
