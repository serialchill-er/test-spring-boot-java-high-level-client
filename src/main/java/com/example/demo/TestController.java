package com.example.demo;

import java.io.IOException;

import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private RestHighLevelClient client;
	
	@GetMapping("/test")
	public String getDoc() throws IOException {
		
		GetRequest getRequest = new GetRequest("users", "_doc", "2");

        GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
        
        System.out.println(getResponse.toString());
		
		return "Hello World!";
	}

}
