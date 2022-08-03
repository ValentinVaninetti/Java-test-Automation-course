package com.solvd.entities.university;

import java.util.List;

public class PrivateUniversity extends University {
    private int monthlyFee;
    private String coinType = "USD";

    public PrivateUniversity(String name, String location, List<Department> departmentList, int fee, String coinType) {
        super(name, location, departmentList);
        this.monthlyFee = fee;
        this.coinType = coinType;
    }

    public PrivateUniversity(String name, String location, List<Department> departmentList, int fee) {
        super(name, location, departmentList);
        this.monthlyFee = fee;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }
}
