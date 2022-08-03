package com.solvd.entities.university;

import java.util.List;

public class PublicUniversity extends University {
    private static final int MONTHLY_STATE_SUBSIDY = 30000;
    private static final String COIN_TYPE = "USD";
    private List<String> benefits;

    public PublicUniversity(String name, String location, List<Department> departmentList, List<String> benefits) {
        super(name, location, departmentList);
        this.benefits = benefits;
    }

    public List<String> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<String> benefits) {
        this.benefits = benefits;
    }

}
