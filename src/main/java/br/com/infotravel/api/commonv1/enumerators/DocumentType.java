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
public enum DocumentType {
    CPF,
    RG,
    PASSPORT,
    CNPJ,
    TAX_ID,
    DRIVER_LICENSE;

    public static DocumentType getEnum(String enumerator) {

        if (enumerator.equals("CNPJ")) {
            return DocumentType.CNPJ;
        } else if (enumerator.equals("CPF")) {
            return DocumentType.CPF;
        } else if (enumerator.equals("RG")) {
            return DocumentType.RG;
        } else if (enumerator.equals("PASSAPORTE")) {
            return DocumentType.PASSPORT;
        } else if (enumerator.equals("CNH")) {
            return DocumentType.DRIVER_LICENSE;
        }
        return null;
    }

    public static DocumentType getEnumApi(String enumerator) {

        if (enumerator.equals("CNPJ")) {
            return DocumentType.CNPJ;
        } else if (enumerator.equals("CPF")) {
            return DocumentType.CPF;
        } else if (enumerator.equals("RG")) {
            return DocumentType.RG;
        } else if (enumerator.equals("PASSPORT")) {
            return DocumentType.PASSPORT;
        } else if (enumerator.equals("DRIVER_LICENSE")) {
            return DocumentType.DRIVER_LICENSE;
        }
        return null;
    }

    public static Integer getDocumentType(String tipo) {

        if ("CPF".equals(tipo)) {
            return 1;
        } else if ("RG".equals(tipo)) {
            return 2;
        } else if ("PASSPORT".equals(tipo)) {
            return 3;
        } else if ("CNPJ".equals(tipo)) {
            return 5;
        } else {
            return "CNH".equals(tipo) ? 4 : null;
        }
    }

}
