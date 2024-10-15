/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author Arquimedes
 */
public enum CurrencyType {

    BRL,
    EUR,
    USD,
    GBP,
    CLP,
    COP,
    CHF,
    CAD,
    NZD,
    ARS,
    MXN,
    IDR,
    AUD,
    JPY,
    ZAR,
    AED,
    CNY,
    NOK,
    FJD,
    SEK,
    SGD,
    HKD,
    MZN,
    ILS,
    SAR;

    public static CurrencyType getEnum(String enumeration) {

        for (CurrencyType n : CurrencyType.values()) {
            if (n.name().equals(enumeration)) {
                return n;
            }
        }
        return null;
    }

}
