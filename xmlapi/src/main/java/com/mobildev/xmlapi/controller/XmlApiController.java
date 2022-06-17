package com.mobildev.xmlapi.controller;

import com.mobildev.xmlapi.integration.RestTemplateIntegration;
import com.mobildev.xmlapi.integration.XmlCallableApi;
import com.mobildev.xmlapi.xmlBody.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/getUser")
public class XmlApiController {

    @Autowired
    RestTemplateIntegration restTemplateIntegration;
    @Autowired
    XmlCallableApi xmlCallableApi;

    @RequestMapping(value = "/restTemplate", method = RequestMethod.POST,consumes=MediaType.APPLICATION_XML_VALUE,produces=MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody String getUser(@RequestBody User user) {
        return  restTemplateIntegration.getUser(user);

    }
    @RequestMapping( value = "/feign" , method = RequestMethod.POST,consumes=MediaType.APPLICATION_XML_VALUE,produces=MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody String getUserForFeign(@RequestBody User user) {
        return  xmlCallableApi.getUserData(user);

    }
}
