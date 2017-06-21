package com.epam.javacc.microservices.two;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface TwoServiceAPI {

    @RequestMapping(value = "/getSomething/{id}", method = RequestMethod.GET, produces = "application/json")
    String getSomething(@PathVariable("id") String customerId);

    @RequestMapping(value = "/getSomething2/{id}", method = RequestMethod.GET, produces = "application/json")
    String getSomething2(@PathVariable("id") String customerId);

}
