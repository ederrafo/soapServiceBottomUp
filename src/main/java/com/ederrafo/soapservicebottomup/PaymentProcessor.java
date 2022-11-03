package com.ederrafo.soapservicebottomup;


import com.ederrafo.soapservicebottomup.bean.PaymentProcessorRequest;
import com.ederrafo.soapservicebottomup.bean.PaymentProcessorResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "PaymentProcessor")
public interface PaymentProcessor {
    @WebMethod
    public @WebResult(name = "response") PaymentProcessorResponse processPayment(
            @WebParam(name = "paymentProcessorRequest") PaymentProcessorRequest paymentProcessorRequest);
}
