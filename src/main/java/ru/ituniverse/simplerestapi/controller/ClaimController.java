package ru.ituniverse.simplerestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
@RequestMapping("/api")
public class ClaimController {

    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(path = "/claims", method = RequestMethod.POST)
    public String createClaimEcho(@RequestBody String requestBody) {
        return requestBody;
    }

    @RequestMapping(path = "/claims", method = RequestMethod.GET)
    public String getClaim() {
        return "Hello";
    }
}
