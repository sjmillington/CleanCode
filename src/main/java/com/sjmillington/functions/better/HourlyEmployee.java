package com.sjmillington.functions.better;

import com.sjmillington.functions.Money;

public class HourlyEmployee extends Employee {

    private EmployeeRecord r;

    public HourlyEmployee(EmployeeRecord r) {
        this.r = r;
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay() {

    }
}
