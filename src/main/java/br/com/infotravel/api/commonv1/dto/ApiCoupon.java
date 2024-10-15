package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.dto.coupon.ApiCouponDiscount;
import br.com.infotravel.api.commonv1.enumerators.BookingType;
import br.com.infotravel.api.commonv1.enumerators.ProductType;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCoupon {

    private Integer id;
    private String name;
    private String description;
    private Boolean isValid;
    private String message;
    private String ruleName;
    private Integer quantity;
    private Integer ruleId;
    private ApiCouponDiscount discount;
    private List<ProductType> productTypes;
    private List<BookingType> bookingTypes;
    private List<ApiActivePeriod> activePeriods;
    private List<ApiActivePeriod> salesPeriods;

    public ApiCoupon() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public ApiCouponDiscount getDiscount() {
        return discount;
    }

    public void setDiscount(ApiCouponDiscount discount) {
        this.discount = discount;
    }

    public Boolean getValid() {
        return isValid;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }

    public List<BookingType> getBookingTypes() {
        return bookingTypes;
    }

    public void setBookingTypes(List<BookingType> bookingTypes) {
        this.bookingTypes = bookingTypes;
    }

    public List<ApiActivePeriod> getActivePeriods() {
        return activePeriods;
    }

    public void setActivePeriods(List<ApiActivePeriod> activePeriods) {
        this.activePeriods = activePeriods;
    }

    public List<ApiActivePeriod> getSalesPeriods() {
        return salesPeriods;
    }

    public void setSalesPeriods(List<ApiActivePeriod> salesPeriods) {
        this.salesPeriods = salesPeriods;
    }

}
