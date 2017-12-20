package ru.ituniverse.simplerestapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.ituniverse.simplerestapi.model.Claim;
import ru.ituniverse.simplerestapi.model.Service;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/api")
public class ClaimController {

    private List<Claim> claimList = new ArrayList<>();

    private List<Service> serviceList = generateServices();

    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(path = "/claims", method = RequestMethod.POST)
    @ResponseBody
    public void createClaimEcho(@RequestBody Claim claim) {
        this.claimList.add(claim);
    }

    @RequestMapping(path = "/claims", method = RequestMethod.GET)
    @ResponseBody
    public List<Claim> getClaim() {
        return claimList;
    }

    private List<Service> generateServices() {
        List<Service> serviceList = new ArrayList<>();
        serviceList.add(new Service(1L,"Безлимитный интернет"));
        serviceList.add(new Service(2L,"Кабельное телевидение"));
        serviceList.add(new Service(3L,"Смарт TV"));
        serviceList.add(new Service(4L,"Домашний телефон"));

        return serviceList;
    }
}
