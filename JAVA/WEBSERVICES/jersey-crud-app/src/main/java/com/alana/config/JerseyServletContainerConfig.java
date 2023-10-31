package com.alana.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class JerseyServletContainerConfig extends ResourceConfig {
		public JerseyServletContainerConfig() {
			packages("com.alana.jersey.resources");
		}
		}

