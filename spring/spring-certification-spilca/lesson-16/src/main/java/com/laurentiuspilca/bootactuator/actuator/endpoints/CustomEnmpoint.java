package com.laurentiuspilca.bootactuator.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class CustomEnmpoint {
    @ReadOperation
    public String test() {
        return "Custom :)";
    }
}
