package com.mobildev.xmlapi.integration;



import com.mobildev.xmlapi.xmlBody.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RestTemplateIntegration {


        public String getUser(User user) {
            RestTemplate restTemplate = new RestTemplate();
            final String url = "https://xmlapi.mobildev.com";
            String response = restTemplate.postForObject(url, user, String.class);
            return response;
        }
}


