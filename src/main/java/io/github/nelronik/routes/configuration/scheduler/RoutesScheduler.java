package io.github.nelronik.routes.configuration.scheduler;

import io.github.nelronik.routes.Route;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class RoutesScheduler {

    private final Route route;

    public RoutesScheduler(Route route) {
        this.route = route;
    }

    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
    public void scheduleFixedRateWithInitialDelayTask() {
        route.start();
    }
}
