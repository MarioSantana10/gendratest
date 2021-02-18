package com.gendra.gendratest.controllers;

import com.gendra.gendratest.models.responses.ZipCodesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gendra.gendratest.repo.ZipCodesInterface;
import com.gendra.gendratest.webServices.WebServices;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * This class define the methods that they will be exposed
 * @author Mario Santana
 * @version 18/02/2021
 */
@RestController
public class WsController {

    //Injection of dependencies that it will use the controller
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private ZipCodesInterface zipCodesInterface;

    @Autowired
    private WebServices webServices;

    /**
     * Method that use the interface WebServices to get the zip codes data
     * @param zipCode This value is the zip code to looking for
     * @return Object type ZipCodesResponse that return contain all information of a zip code
     */
    @GetMapping(value = "/zip-codes/{zipCode}")
    public ZipCodesResponse getZipCode(@PathVariable("zipCode") String zipCode) {
        return webServices.getZipCodes(zipCode, entityManager);
    }
}