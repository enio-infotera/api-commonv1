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
public enum PhoneType {

    COMMERCIAL,//("COMERCIAL"),
    HOME,//("RESIDENCIAL"),
    CELL,//("CELULAR"),
    OTHER;//("OUTRO");//("OUTRO");

    public static PhoneType getEnum(String enumerator) {

        if (enumerator.equals("COMERCIAL")) {
            return PhoneType.COMMERCIAL;
        } else if (enumerator.equals("RESIDENCIAL")) {
            return PhoneType.HOME;
        } else if (enumerator.equals("CELULAR")) {
            return PhoneType.CELL;
        } else if (enumerator.equals("OUTRO")) {
            return PhoneType.OTHER;
        }
        return null;
    }

}
