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
public enum TransferInOut {

    IN("IN"),
    OUT("OUT");

    private final String tipo;

    private TransferInOut(String tipo) {
        this.tipo = tipo;
    }

    public static TransferInOut getEnum(String dsTipo) {
        if ("IN".equals(dsTipo)) {
            return IN;
        } else if ("OUT".equals(dsTipo)) {
            return OUT;
        }
        return null;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isIN() {
        return IN.equals(this);
    }

    public boolean isOUT() {
        return OUT.equals(this);
    }
}
