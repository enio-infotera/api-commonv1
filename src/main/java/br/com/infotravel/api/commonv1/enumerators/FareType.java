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
public enum FareType {

    /**
     * ValorTipo Entity
     */
    FARE("TARIFA"),
    TAX_PAYMENT("TAXA_PAGAMENTO"),
    COMMISSION_INCENTIVE("INCENTIVO_COMISSAO"),
    COUPON("CUPOM"),
    CHECKOUT_DISCOUNT("CAIXA_DESCONTO"),
    COURTESY_LETTER("CARTA_CORTESIA"),
    MEAL("REFEICAO"),
    CHANGE_RESERVATION("ALTERACAO_RESERVA"),
    COMMISSION_ADJUSTMENT("DESCONTO_COMISSAO"),
    RETURN_FEE("TAXA_DEVOLUCAO"),
    RAV_COMMISSION("RAV_COMISSAO"),
    OVER_RATE("OVER_TARIFA"),
    BOOKING_TAX("TAXA_RESERVA"),
    FARE_DIFFERENCE("DIFERENCA_TARIFA"),
    TAXES_AND_DUTIES("TAXAS_E_IMPOSTOS"),
    REFUND_COMMISSION_DEDUCTED("ESTORNO_COMISSAO_DEDUZIDA"),
    /**
     * WSTarifaAdicionalTipoEnum
     */
    BOARDING_RATE("TAXA EMBARQUE"),
    DISCOUNT("DESCONTO"),
    SERVICE_CHARGE("TAXA SERVIÇO"),
    TAX_DU("TAXA DU"),
    TAX_ISS("TAXA ISS"),
    TAX_IRRF("TAXA IRRF"),
    TAX_ADM("TAXA ADM"),
    OTHERS("OUTROS"),
    PENALTY("MULTA"),
    SEA_HARBOR_RATE("TAXA PORTUARIA"),
    BREAKFAST_RATE("CAFE"),
    PENSION_RATE("PENSÃO"),
    MEAL_RATE("REFEIÇÃO"),
    /**
     * WSDescontoTipoEnum
     */
    AGE_DISCOUNT("IDADE"),
    PROMOTION_DISCOUNT("PROMOCAO"),
    ADJUSTMENT_DISCOUNT("AJUSTE"),
    ANTICIPATION_DISCOUNT("ANTECIPACAO"),
    PAYMENT_DISCOUNT("PAGTO"),
    INSTALLMENT_DISCOUNT("PARCELADO"),
    COUPON_DISCOUNT("CUPOM"),
    BUY_WIN_DISCOUNT("COMPRE_GANHE"),
    MANAGER_DISCOUNT("GERENCIAL"),
    CUSTOMER_DISCOUNT_DISCOUNT("CLIENTE_B2C"),
    ADJUST_COMMISSION_DISCOUNT("AJUSTE_COMISSAO"),
    ADJUST_MARKUP_DISCOUNT("AJUSTE_MARKUP"),
    POINTS("PONTO"),
    TAX_PORT("TAXA_PORTUARIA"),
    TAX_OTHERS("TAXA_OUTRAS"),

    NOITE_EXTRA("NOITE_EXTRA"),
    REISSUE_FEE("TAXA REEMISSÃO");


    private FareType(String id) {
        this.id = id;
    }

    private final String id;

    public String getId() {
        return id;
    }

    public static FareType getFareType(String id) {
        return getFareType(id, true);
    }

//    -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//                       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//
//                                CUIDADO AO MEXER NESSE ARQUIVO , PODE CAUSAR VARIOS PROBLEMAS NO INFO X INFO
//
//
//                       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//
//
//    -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static FareType getFareType(String id, boolean stUnidadePropria) {
        for (FareType type : FareType.values()) {

            if (type.getId().equals(id)) {
                return type;
            }
            if (id.equals("TAX_DU")) {
                return FareType.TAX_DU;
            }
            if (id.equals("TAX_ISS") || id.equals("TAXA_ISS")) {
                return FareType.TAX_ISS;
            }
            if (id.equals("TAXA_EMBARQUE")) {
                return FareType.BOARDING_RATE;
            }
            if (id.equals("AJUSTE MARKUP")) {
                return FareType.ADJUST_MARKUP_DISCOUNT;
            }
            if (id.equals("CLIENTE B2C")) {
                return FareType.CUSTOMER_DISCOUNT_DISCOUNT;
            }
            if (id.equals("COMPRE GANHE")) {
                return FareType.BUY_WIN_DISCOUNT;
            }
            if (id.equals("CAIXA_DESCONTO") || id.equals("DESCONTO CAIXA")) {
                return FareType.CHECKOUT_DISCOUNT;
            }
            if (id.equals("OVER COMISSAO")) {
                return FareType.OVER_RATE;
            }
            if (id.equals("TAXA_PAGAMENTO") || id.equals("TAXAS PAGAMENTO")) {
                return FareType.TAX_PAYMENT;
            }
            if (id.equals("RAV_COMISSÃO") || id.equals("RAV COMISSÃO") || id.equals("RAV COMISSAO")) {
                return FareType.RAV_COMMISSION;
            }
            if (id.equals("TAXA_SERVIÇO") || id.equals("TAXA_SERVICO") || id.equals("TAXA SERVICO")) {
                return FareType.SERVICE_CHARGE;
            }
            if (id.equals("TAXA_ADM") || id.equals("TAXA ADM")) {
                return FareType.TAX_ADM;
            }
            if (id.equals("TAXA_IRRF")) {
                return FareType.TAX_IRRF;
            }
            if (id.equals("INCENTIVO_COMISSÃO") || id.equals("INCENTIVO COMISSÃO") || id.equals("INCENTIVO COMISSAO")) {
                return FareType.COMMISSION_INCENTIVE;
            }
            if (id.equals("ALTERAÇÃO_RESERVA") || id.equals("ALTERAÇÃO RESERVA") || id.equals("ALTERACAO RESERVA")) {
                return FareType.CHANGE_RESERVATION;
            }
            if (id.equals("DESCONTO_COMISSÃO") || id.equals("DESCONTO COMISSÃO") || id.equals("DESCONTO COMISSAO")) {
                return FareType.COMMISSION_ADJUSTMENT;
            }
            if (id.equals("TAXA_DEVOLUÇÃO") || id.equals("TAXA DEVOLUÇÃO") || id.equals("TAXA DEVOLUCAO")) {
                return FareType.RETURN_FEE;
            }
            if (id.equals("AJUSTE COMISSÂO") || id.equals("AJUSTE COMISSÃO") || id.equals("AJUSTE_COMISSÂO")) {
                return FareType.ADJUST_COMMISSION_DISCOUNT;
            }
            if (id.equals("PONTO")) {
                return FareType.POINTS;
            }

            if (id.equals("NOITE_EXTRA")) {
                return FareType.NOITE_EXTRA;
            }

            if (id.equals("TAXA_RESERVA") || id.equals("TAXA RESERVA")) {
                return FareType.BOOKING_TAX;
            }
            if (id.equals("TAXA_PORTUARIA") || id.equals("TAXA PORTUÀRIA")) {
                return FareType.TAX_PORT;
            }
            if (id.equals("TAXA_OUTRAS")||id.equals("TAXA OUTRAS")) {
                return FareType.TAX_OTHERS;
            }
            if (id.equals("ESTORNO_COMISSAO_DEDUZIDA") || id.equals("ESTORNO COMISSÂO DEDUZIDA")) {
                return FareType.REFUND_COMMISSION_DEDUCTED;
            }
            if (id.equals("DIFERENCA_TARIFA") || id.equals("DIFERENÇA TARIFA")) {
                if (stUnidadePropria) {
                    return FareType.FARE_DIFFERENCE;
                } else {
                    return FareType.TAXES_AND_DUTIES;
                }
            }
            if (id.equals("TAXA_REEMISSAO")) {
                return FareType.REISSUE_FEE;
            }
        }

        return null;
    }

    //    -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//
//
//                       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//
//                                CUIDADO AO MEXER NESSE ARQUIVO , PODE CAUSAR VARIOS PROBLEMAS NO INFO X INFO
//
//
//                       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//
//
//    -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public boolean isRate() {
        return this.equals(BOARDING_RATE)
                || this.equals(DISCOUNT)
                || this.equals(SERVICE_CHARGE)
                || this.equals(TAX_DU)
                || this.equals(TAX_ISS)
                || this.equals(TAX_IRRF)
                || this.equals(OTHERS)
                || this.equals(PENALTY)
                || this.equals(SEA_HARBOR_RATE)
                || this.equals(BREAKFAST_RATE)
                || this.equals(PENSION_RATE)
                || this.equals(TAX_ADM)
                || this.equals(MEAL_RATE)
                || this.equals(NOITE_EXTRA);
    }

    public boolean isDiscount() {
        return this.equals(AGE_DISCOUNT)
                || this.equals(PROMOTION_DISCOUNT)
                || this.equals(ADJUSTMENT_DISCOUNT)
                || this.equals(ANTICIPATION_DISCOUNT)
                || this.equals(PAYMENT_DISCOUNT)
                || this.equals(INSTALLMENT_DISCOUNT)
                || this.equals(COUPON_DISCOUNT)
                || this.equals(COUPON)
                || this.equals(BUY_WIN_DISCOUNT)
                || this.equals(MANAGER_DISCOUNT)
                || this.equals(CUSTOMER_DISCOUNT_DISCOUNT)
                || this.equals(ADJUST_COMMISSION_DISCOUNT)
                || this.equals(ADJUST_MARKUP_DISCOUNT);
    }

}
