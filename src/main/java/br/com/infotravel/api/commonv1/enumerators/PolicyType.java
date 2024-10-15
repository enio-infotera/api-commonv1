/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author arquimedes
 */
public enum PolicyType {

    CANCELLATION,
    GENERAL_CONDITIONS,
    RATE_RULE,
    CHECK_INOUT,
    VOUCHER;

    public static PolicyType getEnum(String enumerator) {

        if (enumerator.equals("CANCELAMENTO")) {
            return PolicyType.CANCELLATION;
        } else if (enumerator.equals("CONDICOES_GERAIS")) {
            return PolicyType.GENERAL_CONDITIONS;
        }
        if (enumerator.equals("REGRA_TARIFARIA")) {
            return PolicyType.RATE_RULE;
        }
        if (enumerator.equals("CHECK_INOUT")) {
            return PolicyType.CHECK_INOUT;
        }
        if (enumerator.equals("VOUCHER")) {
            return PolicyType.VOUCHER;
        }
        return null;
    }
}
