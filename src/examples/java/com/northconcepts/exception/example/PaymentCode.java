package com.northconcepts.exception.example;

import com.northconcepts.exception.ErrorCode;

public enum PaymentCode implements ErrorCode {

    SERVICE_TIMEOUT(101), 
    CREDIT_CARD_EXPIRED(102), 
    AMOUNT_TOO_HIGH(103), 
    INSUFFICIENT_FUNDS(104);

    private final int number;

    private PaymentCode(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }

}
