package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.enumerators.CashRegisterType;
import br.com.infotravel.api.commonv1.utils.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

public class ApiCashRegister {
    private Integer id;
    private Integer bookingId;
    private CashRegisterType status;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date createdAt;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date closedDate;
    private ApiPrice paymentReceived;
    private ApiPrice cashRegisterAmount;
    private ApiPrice bookingPriceTotal;
    private ApiPrice commissionReceived;
    private ApiPrice commissionAmount;


    public ApiCashRegister() {
    }

    public ApiCashRegister(Integer id, Integer bookingId, CashRegisterType status, Date createdAt, Date closedDate, ApiPrice paymentReceived, ApiPrice cashRegisterAmount, ApiPrice bookingPriceTotal,  ApiPrice commissionReceived, ApiPrice commissionAmount) {
        this.id = id;
        this.bookingId = bookingId;
        this.status = status;
        this.createdAt = createdAt;
        this.closedDate = closedDate;
        this.paymentReceived = paymentReceived;
        this.cashRegisterAmount = cashRegisterAmount;
        this.bookingPriceTotal = bookingPriceTotal;
        this.commissionReceived = commissionReceived;
        this.commissionAmount = commissionAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public CashRegisterType getStatus() {
        return status;
    }

    public void setStatus(CashRegisterType status) {
        this.status = status;
    }

    public ApiPrice getPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(ApiPrice paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    public ApiPrice getCashRegisterAmount() {
        return cashRegisterAmount;
    }

    public void setCashRegisterAmount(ApiPrice cashRegisterAmount) {
        this.cashRegisterAmount = cashRegisterAmount;
    }

    public ApiPrice getBookingPriceTotal() {
        return bookingPriceTotal;
    }

    public void setBookingPriceTotal(ApiPrice bookingPriceTotal) {
        this.bookingPriceTotal = bookingPriceTotal;
    }


    public ApiPrice getCommissionReceived() {
        return commissionReceived;
    }

    public void setCommissionReceived(ApiPrice commissionReceived) {
        this.commissionReceived = commissionReceived;
    }


    public ApiPrice getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(ApiPrice commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }
}
