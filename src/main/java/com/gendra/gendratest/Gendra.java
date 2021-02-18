package com.gendra.gendratest;

import com.gendra.gendratest.models.responses.ZipCodesResponse;
import org.springframework.stereotype.Component;
import com.gendra.gendratest.services.ZipCodesService;
import com.gendra.gendratest.webServices.WebServices;
import javax.persistence.EntityManager;

/**
 * This class implement the interface WebService and connect the controller
 * @author Mario Santana
 * @version 18/02/2021
 */
@Component
public class Gendra implements WebServices {

    /**
     * Method that give functionality to controller and the interface
     * @param zipCode This param is request zip code that it will send the controller
     * @param entityManager This param is entity manager that it will send the controller
     * @return
     */
    @Override
    public ZipCodesResponse getZipCodes(String zipCode, EntityManager entityManager) {
        ZipCodesService service = new ZipCodesService();
        ZipCodesResponse response = service.getData(zipCode, entityManager);
        return  response;
    }
}
