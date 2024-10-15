/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author enioj
 */
public enum ContractType {

    BOOKING,
    BUSINESS_UNIT,
    TERMS_AND_CONDITIONS,
    PRIVACY_POLICIES;

    public static ContractType getEnum(String enumeratorId) {

        if (enumeratorId.equals("1")) {
            return ContractType.BOOKING;
        } else if (enumeratorId.equals("2")) {
            return ContractType.BUSINESS_UNIT;
        } else if (enumeratorId.equals("3")) {
            return ContractType.TERMS_AND_CONDITIONS;
        } else if (enumeratorId.equals("4")) {
            return ContractType.PRIVACY_POLICIES;
        }

        return null;
    }
}
