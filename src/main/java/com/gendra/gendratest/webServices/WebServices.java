package com.gendra.gendratest.webServices;

import com.gendra.gendratest.models.responses.ZipCodesResponse;
import javax.persistence.EntityManager;

/**
 * This interface define a layer to web service functionality where are all functional methods
 * @author Mario Santana
 * @version 18/02/2021
 */
public interface WebServices {

    /**
     * This method is the intermediate layer to the service
     * @param zipCode This param is request zip code that it will send the controller
     * @param entityManager This param is entity manager that it will send the controller
     * @return
     */
    ZipCodesResponse getZipCodes(String zipCode, EntityManager entityManager);
}