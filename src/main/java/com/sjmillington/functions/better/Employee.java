package com.sjmillington.functions.better;

import com.sjmillington.functions.Money;

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay();
}
