package org.quarkus.samples.petclinic.system;

import jakarta.inject.Inject;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import org.jboss.logging.Logger;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;

public class ErrorExceptionMapper implements ExceptionMapper<Throwable> {

    private static final Logger LOG = Logger.getLogger(ErrorExceptionMapper.class);
    public static final String ERROR_HEADER = "x-error";

    @Inject
    TemplatesLocale templates;
    @Override
    public Response toResponse(Throwable throwable) {
        return Response.ok(templates.error(throwable.getMessage())).header(ERROR_HEADER, true).build();
    }
}
