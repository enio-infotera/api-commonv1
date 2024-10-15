/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.dto;

import java.util.List;

/**
 *
 * @author enioj
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiCancellationPolicy {

    private boolean refundable;
    private boolean immediateFine;
    private List<ApiCancellationPenalty> penalties;

    public ApiCancellationPolicy() {
    }

    public ApiCancellationPolicy(boolean refundable, List<ApiCancellationPenalty> penalties) {
        this.refundable = refundable;
        this.penalties = penalties;
    }

    public boolean isImmediateFine() {
        return immediateFine;
    }

    public void setImmediateFine(boolean immediateFine) {
        this.immediateFine = immediateFine;
    }

    public boolean isRefundable() {
        return refundable;
    }

    public void setRefundable(boolean refundable) {
        this.refundable = refundable;
    }

    public List<ApiCancellationPenalty> getPenalties() {
        return penalties;
    }

    public void setPenalties(List<ApiCancellationPenalty> penalties) {
        this.penalties = penalties;
    }

}
