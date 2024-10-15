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
public enum PaymentType {
    CREDIT_CARD("CARTAO_DE_CREDITO"),
    INVOICE("FATURADO"),
    PAYMENT_HOTEL("PAGAMENTO_NO_HOTEL"),
    BANK_SLIP("BOLETO"),
    PAYPAL("PAYPAL"),
    BANK_DEPOSIT("DEPOSITO"),
    CASH("DINHEIRO"),
    DEBIT_CARD("CARTAO_DE_DEBITO"),
    LETTER_CREDIT("CARTA_DE_CREDITO"),
    CHECK("CHEQUE"),
    FINANCED("FINANCIAMENTO"),
    CARD_MACHINE("MAQUINETA"),
    REDIRECTED("REDIRECIONADO"),
    PIX("PIX"),
    PAYMENT_PROVIDER("PAGAMENTO_AO_FORNECEDOR"),
    DEVOLUTION("DEVOLUCAO"),
    COMMISSION("COMISSAO"),
    PRE_PAYMENT("PRE_PAGAMENTO");

    private final String type;

    private PaymentType(String type) {
        this.type = type;
    }

    public boolean isInvoice() {
        return this == INVOICE;
    }

    public boolean isPix() {
        return this == PIX;
    }

    public boolean isPaymentInHotel() {
        return this == PAYMENT_HOTEL;
    }

    public boolean isBankSlip() {
        return this == BANK_SLIP;
    }

    public boolean isCreditCard() {
        return this == CREDIT_CARD;
    }

    public String getType() {
        return type;
    }

    public static PaymentType getProviderType(String type) {
        for (PaymentType provider : PaymentType.values()) {
            if (provider.getType().equals(type.toUpperCase())) {
                return provider;
            }
        }
        return null;
    }
}
