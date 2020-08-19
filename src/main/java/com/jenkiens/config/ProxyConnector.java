package com.jenkiens.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Configuration
public class ProxyConnector implements RestTemplateCustomizer {

//    @Override
//    public void customize(RestTemplate restTemplate) {
//        final String proxyUrl = "proxy.example.com";
//        final int port = 3128;
//
//        HttpHost proxy = new HttpHost(proxyUrl, port);
//        org.apache.http.client.HttpClient httpClient = HttpClientBuilder.create().setRoutePlanner(new DefaultProxyRoutePlanner(proxy) {
//            protected HttpHost determineProxy(HttpHost target, HttpRequest request, HttpContext context)
//                    throws HttpException {
//                /*if (target.getHostName().equals("gturnquist-quoters.cfapps.io")) {
//                    
//                }*/
//                return super.determineProxy(target, request, context);
//            }
//        }).build();
//        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory(httpClient));
//
//    }
//    
	@SuppressWarnings("unchecked")
	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder rest) {
    	  
    	// RestTemplate restTemplate = new RestTemplate();

//    	SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
//
//    	    Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
//    	    requestFactory.setProxy(proxy);
//
//    	    restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(requestFactory));
    	    
    	   return rest.basicAuthentication("admin","admin").build();
    	
    }

	@Override
	public void customize(RestTemplate restTemplate) {
		// TODO Auto-generated method stub
		
	}
}