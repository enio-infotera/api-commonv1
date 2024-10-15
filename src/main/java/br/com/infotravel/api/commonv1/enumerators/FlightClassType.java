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
public enum FlightClassType {

    ECONOMIC,
    ECONOMIC_PREMIUM,
    EXECUTIVE,
    FIRST_CLASS,
    EXECUTIVE_PREMIUM,
    FIRST_CLASS_PREMIUM,
    PREMIUM,
    UNDEFINED,
    ECONOMIC_FULL;

    public static FlightClassType getEnum(Integer enumerator) {

        if (enumerator.equals(1)) {
            return FlightClassType.ECONOMIC;
        } else if (enumerator.equals(2)) {
            return FlightClassType.ECONOMIC_PREMIUM;
        } else if (enumerator.equals(3)) {
            return FlightClassType.EXECUTIVE;
        } else if (enumerator.equals(4)) {
            return FlightClassType.FIRST_CLASS;
        } else if (enumerator.equals(5)) {
            return FlightClassType.EXECUTIVE_PREMIUM;
        } else if (enumerator.equals(6)) {
            return FlightClassType.FIRST_CLASS_PREMIUM;
        } else if (enumerator.equals(7)) {
            return FlightClassType.PREMIUM;
        } else if (enumerator.equals(8)) {
            return FlightClassType.UNDEFINED;
        } else if (enumerator.equals(9)) {
            return FlightClassType.ECONOMIC_FULL;
        }
        return null;
    }
}
