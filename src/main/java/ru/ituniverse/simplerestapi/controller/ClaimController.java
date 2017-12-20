package ru.ituniverse.simplerestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api")
public class ClaimController {

    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(path = "/claims", method = RequestMethod.POST)
    @ResponseBody
    public String createClaimEcho(@RequestBody String requestBody) {
        return requestBody;
    }

    @RequestMapping(path = "/claims", method = RequestMethod.GET)
    @ResponseBody
    public String getClaim() {
        return "Hello";
    }
}
