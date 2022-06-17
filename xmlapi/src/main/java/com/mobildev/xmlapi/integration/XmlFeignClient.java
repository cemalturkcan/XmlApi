package com.mobildev.xmlapi.integration;

import com.mobildev.xmlapi.xmlBody.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;


public interface XmlFeignClient {
    @PostMapping( value = "" , consumes = MediaType.APPLICATION_XML_VALUE)
    String getUserData(User user);

}
