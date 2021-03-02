package com.vinlen.cloudStore.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "cloudstore.cors")
public class CORSProperties {
	private List<String> allowedOrigins;
	private Boolean allowCredentials;
	private List<String> allowedMethods;
	private List<String> allowedHeaders;
	private Long maxAge;
	private String filterPath;
}
