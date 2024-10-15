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
public enum CardPaymentStatus {
    CAPTURED,
    DENIED,
    AUTHORIZED,
    ANALYZING,
    PENDING,
    RECURRENT,
    CANCELED;

    public static CardPaymentStatus getEnum(String enumeration) {

        if ("C".equals(enumeration)) {
            return CardPaymentStatus.CAPTURED;
        } else if ("N".equals(enumeration)) {
            return CardPaymentStatus.DENIED;
        } else if ("Z".equals(enumeration)) {
            return CardPaymentStatus.AUTHORIZED;
        } else if ("A".equals(enumeration)) {
            return CardPaymentStatus.ANALYZING;
        } else if ("P".equals(enumeration)) {
            return CardPaymentStatus.PENDING;
        } else if ("RE".equals(enumeration)) {
            return CardPaymentStatus.RECURRENT;
        } else if ("X".equals(enumeration)) {
            return CardPaymentStatus.CANCELED;
        }
        return null;
    }

}
