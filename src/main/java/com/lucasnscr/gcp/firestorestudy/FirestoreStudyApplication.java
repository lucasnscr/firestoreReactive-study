package com.lucasnscr.gcp.firestorestudy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class FirestoreStudyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FirestoreStudyApplication.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> indexRouter(
			@Value("classpath:/static/index.html") final Resource indexHtml) {

		return route(
				GET("/"),
				request -> ok().contentType(MediaType.TEXT_HTML).bodyValue(indexHtml));
	}

}
