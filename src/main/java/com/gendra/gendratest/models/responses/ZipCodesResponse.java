package com.gendra.gendratest.models.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * This class define the response model service
 * @author Mario Santana
 * @version 18/02/2021
 */
public class ZipCodesResponse {

    private String zip_code;
    private String locality;
    private String federal_entity;
    private List<Settlement> settlements;
    private String municipality;

    public ZipCodesResponse() {
    }

    /**
     *
     * @param zip_code This param is the response zip code
     * @param locality This param is the response locality
     * @param federal_entity This param is the response federal entity
     * @param settlements This param is a list of settlements
     * @param municipality This param is the response municipality
     */
    public ZipCodesResponse(String zip_code, String locality, String federal_entity, List<Settlement> settlements, String municipality) {
        this.zip_code = zip_code;
        this.locality = locality;
        this.federal_entity = federal_entity;
        this.settlements = settlements;
        this.municipality = municipality;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFederal_entity() {
        return federal_entity;
    }

    public void setFederal_entity(String federal_entity) {
        this.federal_entity = federal_entity;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Settlement> getSettlements() {
        return settlements;
    }

    public void setSettlements(List<Settlement> settlements) {
        this.settlements = settlements;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }
}