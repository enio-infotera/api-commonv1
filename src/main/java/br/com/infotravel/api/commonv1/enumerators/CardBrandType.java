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
public enum CardBrandType {

    VISA,
    MASTERCARD,
    AMEX,
    DINERS,
    HIPERCARD,
    ELO,
    AURA,
    VISA_ELETRON,
    MASTERCARD_MAESTRO,
    JCB,
    DISCOVER;

    public static CardBrandType getEnum(String enumerator) {

        if ("VISA".equals(enumerator)) {
            return CardBrandType.VISA;
        } else if ("MASTERCARD".equals(enumerator)) {
            return CardBrandType.MASTERCARD;
        } else if ("AMERICAN EXPRESS".equals(enumerator)) {
            return CardBrandType.AMEX;
        } else if ("DINERS".equals(enumerator)) {
            return CardBrandType.DINERS;
        } else if ("HIPERCARD".equals(enumerator)) {
            return CardBrandType.HIPERCARD;
        } else if ("ELO".equals(enumerator)) {
            return CardBrandType.ELO;
        } else if ("AURA".equals(enumerator)) {
            return CardBrandType.AURA;
        } else if ("VISA ELETRON".equals(enumerator)) {
            return CardBrandType.VISA_ELETRON;
        } else if ("MASTERCARD MAESTRO".equals(enumerator)) {
            return CardBrandType.MASTERCARD_MAESTRO;
        } else if ("JCB".equals(enumerator)) {
            return CardBrandType.JCB;
        } else if ("DISCOVER".equals(enumerator)) {
            return CardBrandType.DISCOVER;
        }

        return null;
    }
}
