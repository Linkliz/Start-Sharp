package com.co.choucair.reto_seis.star_sharp.model;

public class BussinesUnitData {
    private String name;
    private String parentUnit;


    public BussinesUnitData(String name, String parentUnit) {
        this.name = name;
        this.parentUnit = parentUnit;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentUnit() {
        return parentUnit;
    }

    public void setParentUnit(String parentUnit) {
        this.parentUnit = parentUnit;
    }
}
