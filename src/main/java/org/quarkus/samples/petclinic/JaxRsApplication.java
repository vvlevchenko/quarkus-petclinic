package org.quarkus.samples.petclinic;

import io.smallrye.common.annotation.Blocking;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;


/**
 * Used to ensure that all endpoints are blocking by default
 */
@ApplicationPath("/")
@Blocking
public class JaxRsApplication extends Application {
}
