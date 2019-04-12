package com.sjmillington.functions.better;

import com.sjmillington.functions.InvalidEmployeeTypeException;

public class EmployeeFactoryImpl implements EmployeeFactory {
    @Override
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeTypeException {
        switch (r.getType()){
            case COMMISIONED:
                return new CommissionedEmployee(r);
            case HOURLY:
                return new HourlyEmployee(r);
            default:
                throw new InvalidEmployeeTypeException("WRONG");

        }
    }
}
