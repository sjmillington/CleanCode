package com.sjmillington.functions.better;

import com.sjmillington.functions.InvalidEmployeeTypeException;

public interface EmployeeFactory {

    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeTypeException;
}
