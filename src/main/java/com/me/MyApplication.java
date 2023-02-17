package com.me;


import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title = "FastaDb",
                version = "Overriden by quarkus.smallrye-openapi.info-version property."
        )
)
@SuppressWarnings("unused")
public class MyApplication extends Application {
}
