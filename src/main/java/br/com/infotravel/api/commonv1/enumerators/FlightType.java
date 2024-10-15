/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author gustavo
 */
public enum FlightType {

    CHARTER,
    ALLOTMENT,
    REGULAR;

    public static FlightType getEnum(Integer enumeratorId) {

        if (enumeratorId.equals(3)) {
            return FlightType.CHARTER;
        } else if (enumeratorId.equals(5)) {
            return FlightType.ALLOTMENT;
        } else if (enumeratorId.equals(4)) {
            return FlightType.REGULAR;
        }
        return null;
    }
}
