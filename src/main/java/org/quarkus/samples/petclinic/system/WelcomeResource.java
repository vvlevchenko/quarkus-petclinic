package org.quarkus.samples.petclinic.system;

import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class WelcomeResource {
    
    @Inject
    TemplatesLocale templates;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return templates.welcome();
    }

}
