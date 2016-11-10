package org.cyxl.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeff on 16/11/10.
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${mysqldb.datasource.password}")
    private String password;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getConfigFromServer(){
        return password;
    }
}
