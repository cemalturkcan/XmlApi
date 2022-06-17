package com.mobildev.xmlapi.integration;

import org.springframework.cloud.openfeign.FeignClient;



@FeignClient(value = "asd" , url = "https://xmlapi.mobildev.com", decode404 = true)

public interface XmlCallableApi  extends XmlFeignClient{

}
