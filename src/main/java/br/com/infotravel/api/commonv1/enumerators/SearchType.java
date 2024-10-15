/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author gustavo
 */
public enum SearchType {
    CLOSING,
    CREATION;

    public static SearchType getEnum(String enumerator) {

        if (enumerator.equals("CLOSING")) {
            return SearchType.CLOSING;
        } else if (enumerator.equals("CREATION")) {
            return SearchType.CREATION;
        }
        return null;
    }
}
