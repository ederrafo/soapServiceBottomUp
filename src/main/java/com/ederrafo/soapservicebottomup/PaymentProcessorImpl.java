package com.ederrafo.soapservicebottomup;

import com.ederrafo.soapservicebottomup.bean.PaymentProcessorRequest;
import com.ederrafo.soapservicebottomup.bean.PaymentProcessorResponse;

public class PaymentProcessorImpl implements PaymentProcessor {

    @Override
    public PaymentProcessorResponse processPayment(PaymentProcessorRequest paymentProcessorRequest) {
        PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
        // Business Logic or a call to a Business Logic Class Goes Here.
        paymentProcessorResponse.setResult(true);
        return paymentProcessorResponse;
    }
}
