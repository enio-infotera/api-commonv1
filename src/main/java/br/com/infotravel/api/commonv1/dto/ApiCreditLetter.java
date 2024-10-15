package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.utils.CustomDateNoHourDeserializer;
import br.com.infotravel.api.commonv1.utils.CustomDateNoHourSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCreditLetter {

    private Integer id;
    private String externalCode;
    private String observation;
    private ApiPrice value;
    private ApiClient client;
    private ApiClient user;
    private String status;

    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date expirationDate;

    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date usageDate;

    @JsonSerialize(using = CustomDateNoHourSerializer.class)
    @JsonDeserialize(using = CustomDateNoHourDeserializer.class)
    private Date includeDate;

    private Integer bookingCreationId;
    private Integer bookingUsageId;

    public ApiCreditLetter() {
    }

    public ApiCreditLetter(Integer id, String externalCode, String observation, ApiPrice value, ApiClient client, Date expirationDate) {
        this.id = id;
        this.externalCode = externalCode;
        this.observation = observation;
        this.value = value;
        this.client = client;
        this.expirationDate = expirationDate;
    }

    public ApiCreditLetter(Integer id, String externalCode, ApiPrice value, Date expirationDate, String observation, ApiClient client, ApiClient user, String status, Date usageDate, Date includeDate, Integer bookingCreationId, Integer bookingUsageId) {
        this.id = id;
        this.externalCode = externalCode;
        this.value = value;
        this.expirationDate = expirationDate;
        this.observation = observation;
        this.client = client;
        this.user = user;
        this.status = status;
        this.usageDate = usageDate;
        this.includeDate = includeDate;
        this.bookingCreationId = bookingCreationId;
        this.bookingUsageId = bookingUsageId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public ApiPrice getValue() {
        return value;
    }

    public void setValue(ApiPrice value) {
        this.value = value;
    }

    public ApiClient getClient() {
        return client;
    }

    public void setClient(ApiClient client) {
        this.client = client;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ApiClient getUser() {
        return user;
    }

    public void setUser(ApiClient user) {
        this.user = user;
    }

    public Date getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(Date usageDate) {
        this.usageDate = usageDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getIncludeDate() {
        return includeDate;
    }

    public void setIncludeDate(Date includeDate) {
        this.includeDate = includeDate;
    }

    public Integer getBookingUsageId() {
        return bookingUsageId;
    }

    public void setBookingUsageId(Integer bookingUsageId) {
        this.bookingUsageId = bookingUsageId;
    }

    public Integer getBookingCreationId() {
        return bookingCreationId;
    }

    public void setBookingCreationId(Integer bookingCreationId) {
        this.bookingCreationId = bookingCreationId;
    }

}
