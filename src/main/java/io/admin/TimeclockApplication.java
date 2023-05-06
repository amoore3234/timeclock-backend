package io.admin;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class TimeclockApplication extends Application<TimeclockConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TimeclockApplication().run(args);
    }

    @Override
    public String getName() {
        return "Timeclock";
    }

    @Override
    public void initialize(final Bootstrap<TimeclockConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TimeclockConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
