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
public enum DiscountType {

    AGE,
    PROMOTION,
    ADJUSTMENT,
    ANTICIPATION,
    PAYMENT,
    INSTALLMENT,
    COUPON,
    BUY_AND_RECEIVE,
    MANAGER,
    CLIENT_B2C,
    COMMISSION_ADJUSTMENT,
    MARKUP_ADJUSTMENT;

    public static DiscountType getEnumWS(String enumerator) {

        switch (enumerator) {
            case "AJUSTE":
                return DiscountType.ADJUSTMENT;
            case "AJUSTE_COMISSAO":
                return DiscountType.COMMISSION_ADJUSTMENT;
            case "AJUSTE_MARKUP":
                return DiscountType.MARKUP_ADJUSTMENT;
            case "ANTECIPACAO":
                return DiscountType.ANTICIPATION;
            case "CLIENTE_B2C":
                return DiscountType.CLIENT_B2C;
            case "COMPRE_GANHE":
                return DiscountType.BUY_AND_RECEIVE;
            case "CUPOM":
                return DiscountType.COUPON;
            case "GERENCIAL":
                return DiscountType.MANAGER;
            case "IDADE":
                return DiscountType.AGE;
            case "PAGTO":
                return DiscountType.PAYMENT;
            case "PARCELADO":
                return DiscountType.INSTALLMENT;
            case "PROMOCAO":
                return DiscountType.PROMOTION;
            default:
                break;
        }

        return null;
    }

}
