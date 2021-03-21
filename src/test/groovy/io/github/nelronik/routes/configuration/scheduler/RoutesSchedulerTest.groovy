package io.github.nelronik.routes.configuration.scheduler

import io.github.nelronik.routes.Route
import spock.lang.Specification

class RoutesSchedulerTest extends Specification {

    def route = Mock(Route)

    def testedInstance = new RoutesScheduler(route)

    def "ScheduleFixedRateWithInitialDelayTask should start route"() {
        given:

        when:
        testedInstance.scheduleFixedRateWithInitialDelayTask()

        then:
        1 * route.start()
    }
}
