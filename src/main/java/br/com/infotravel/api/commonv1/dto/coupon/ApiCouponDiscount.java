package br.com.infotravel.api.commonv1.dto.coupon;

import br.com.infotravel.api.commonv1.enumerators.CouponApplicationType;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCouponDiscount {

    private Double amount;
    private Double percent;
    private CouponApplicationType applicationType;
    private boolean roundValue;
    private boolean applyInTax;
    private boolean show;
    private int minimumValue;
    private Integer maximumValue;

    public ApiCouponDiscount() {
    }

    public ApiCouponDiscount(CouponApplicationType applicationType, boolean roundValue, boolean applyInTax, boolean show, int minimumValue, Integer maximumValue) {
        this.applicationType = applicationType;
        this.roundValue = roundValue;
        this.applyInTax = applyInTax;
        this.show = show;
        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public CouponApplicationType getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(CouponApplicationType applicationType) {
        this.applicationType = applicationType;
    }

    public boolean isRoundValue() {
        return roundValue;
    }

    public void setRoundValue(boolean roundValue) {
        this.roundValue = roundValue;
    }

    public boolean isApplyInTax() {
        return applyInTax;
    }

    public void setApplyInTax(boolean applyInTax) {
        this.applyInTax = applyInTax;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public int getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(int minimumValue) {
        this.minimumValue = minimumValue;
    }

    public Integer getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Integer maximumValue) {
        this.maximumValue = maximumValue;
    }
}
