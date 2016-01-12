package uhrzeit.controller;

/**
 * Created by asztrik on 1/12/16.
 *
 * Kontrollerklasse, die die für /uhrzeit ankommende Abfragen
 * behandelt
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uhrzeit.Uhrzeit;
import uhrzeit.service.UhrzeitMicroService;

@RestController
public class UhrzeitController {

    @Autowired
    private UhrzeitMicroService ums;

    @RequestMapping("/uhrzeit")
    public Uhrzeit uhrzeit() {
        return new Uhrzeit(ums.uhrzeit(), ums.name());
    }
}
