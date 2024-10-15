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
public enum NameType {
    ADT,
    CHD,
    INF,
    SNR;

    public static NameType getEnum(String enumeration) {

        for (NameType n : NameType.values()) {
            if (n.name().equals(enumeration)) {
                return n;
            }
        }
        return null;
    }
}
