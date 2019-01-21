package com.openmtrapi.api;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloWorldAppConfig extends Application{
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(com.openmtrapi.api.HelloWorldResource.class);
        return classes;
    }
}
