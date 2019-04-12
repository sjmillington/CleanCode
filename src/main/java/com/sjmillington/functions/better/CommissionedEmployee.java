package com.sjmillington.functions.better;

import com.sjmillington.functions.Money;

public class CommissionedEmployee extends Employee {

    private EmployeeRecord record;

    public CommissionedEmployee(EmployeeRecord record) {
        this.record = record;
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
