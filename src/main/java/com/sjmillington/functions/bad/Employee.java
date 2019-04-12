package com.sjmillington.functions.bad;

import com.sjmillington.functions.EmployeeType;

public class Employee {

    private EmployeeType type;

    public Employee(EmployeeType type) {
        this.type = type;
    }

    public EmployeeType getType() {
        return type;
    }


}
