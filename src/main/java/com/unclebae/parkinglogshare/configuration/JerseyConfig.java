package com.unclebae.parkinglogshare.configuration;

import com.unclebae.parkinglogshare.controller.MyResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

/**
 * Created by KIDO on 2017. 1. 21..
 */
@Configuration
@ApplicationPath("/jersey")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(MyResource.class);
    }
}
