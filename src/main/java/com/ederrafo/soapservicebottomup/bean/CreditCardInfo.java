package com.ederrafo.soapservicebottomup.bean;


import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "CreditCardInfo")
public class CreditCardInfo {
    String cardNumber;
    private Date expirtyDate;
    String firstName;
    String lastName;
    String secCode;
    String Address;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirtyDate() {
        return expirtyDate;
    }

    public void setExpirtyDate(Date expirtyDate) {
        this.expirtyDate = expirtyDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
