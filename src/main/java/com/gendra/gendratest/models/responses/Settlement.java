package com.gendra.gendratest.models.responses;

/**
 * This class define the table model where are storage the zip codes
 * @author Mario Santana
 * @version 18/02/2021
 */
public class Settlement {

    private String name;
    private String zone_type;
    private String settlement_type;

    public Settlement() {
    }

    /**
     * Constructor to create a object type Settlement with params initialized
     * @param name This param is the colony name
     * @param zone_type This param is el zone type
     * @param settlement_type This param is the settlement type
     */
    public Settlement(String name, String zone_type, String settlement_type) {
        this.name = name;
        this.zone_type = zone_type;
        this.settlement_type = settlement_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZone_type() {
        return zone_type;
    }

    public void setZone_type(String zone_type) {
        this.zone_type = zone_type;
    }

    public String getSettlement_type() {
        return settlement_type;
    }

    public void setSettlement_type(String settlement_type) {
        this.settlement_type = settlement_type;
    }
}