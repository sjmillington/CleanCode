package com.sjmillington.functions.bad;

import com.sjmillington.functions.InvalidEmployeeTypeException;
import com.sjmillington.functions.Money;

//BAD EXAMPLE
public class Payroll {

    //1st. too large, and will grow as more employee types are added.
    //2nd. It does more than one thing.
    //3rd. Violates SRP as it has more than one reason to change.
    //4th. Violates Open/Closed as it needs to change as more employee types are added.
    //5th. Many other functions will need to use this switch/case structure when deciding what to do with each type.
    public Money calculatePay(Employee e) throws InvalidEmployeeTypeException {
        switch (e.getType()){
            case COMMISIONED:
              return calculateCommissionedPay(e);
            case HOURLY:
              return calculateHourlyPay(e);
            case SALARIED:
              return calculateSalariedPay(e);
            default:
              throw new InvalidEmployeeTypeException("Invalid employee type " + e.getType());
        }

    }

    private Money calculateSalariedPay(Employee e) {
        return null;

    }

    private Money calculateHourlyPay(Employee e) {
        return null;
    }

    private Money calculateCommissionedPay(Employee e) {
        return null;
    }
}
