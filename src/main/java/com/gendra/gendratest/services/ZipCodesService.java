package com.gendra.gendratest.services;

import com.gendra.gendratest.dbModels.ZipCodes;
import com.gendra.gendratest.models.responses.Settlement;
import com.gendra.gendratest.models.responses.ZipCodesResponse;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * This class define the service functionality where is executed the search process
 * @author Mario Santana
 * @version 18/02/2021
 */
@Service
public class ZipCodesService {

    /**
     * Method that do the query to database and send the response to controller
     * @param zipCode This param is the request zip code
     * @param entityManager This param is the entity Manager injected to the connection to database
     * @return Object type ZipCodesResponse to return to controller
     */
    public ZipCodesResponse getData(String zipCode, EntityManager entityManager) {

        ZipCodesResponse response = new ZipCodesResponse();
        // Declaration of Query object to prepare the query to database
        Query zipCodesQuery = entityManager.createQuery("FROM ZipCodes WHERE d_codigo = ?1");
        // Set the first param to query
        zipCodesQuery.setParameter(1, zipCode);
        // Is obtained the query response and assigned to list of type ZipCodes to it can be manipulate
        List<ZipCodes> zipCodes = zipCodesQuery.getResultList();
        List<Settlement> settlements = new ArrayList<>();
        // If the response is success and contain someone, the response will be filled
        if (zipCodes != null) {
            if (zipCodes.size() > 0) {
                for (ZipCodes o : zipCodes) {
                    Settlement settlement = new Settlement(o.getD_asenta(), o.getD_zona(), o.getD_tipo_asenta());
                    settlements.add(settlement);
                }
                response.setZip_code(zipCodes.get(0).getD_codigo());
                response.setLocality(zipCodes.get(0).getD_estado());
                response.setFederal_entity(zipCodes.get(0).getD_ciudad());
                response.setSettlements(settlements);
                response.setMunicipality(zipCodes.get(0).getD_mnpio());
            }
        }
        return response;
    }
}