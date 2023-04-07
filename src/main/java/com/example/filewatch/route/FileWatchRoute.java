package com.example.filewatch.route;

import org.apache.camel.builder.RouteBuilder;

public class FileWatchRoute extends RouteBuilder {

	private String path = "C:\\Users\\ruank\\Documents\\apache-camel\\";
	
	@Override
	public void configure() throws Exception {
		from("file-watch:" + path + "?recursive=false")
				.log("Evento: ${header.CamelFileEventType} Arquivo: ${header.CamelFileName}");
	}

}
