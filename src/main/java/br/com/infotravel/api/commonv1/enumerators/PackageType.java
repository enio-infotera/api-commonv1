/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 * @author enioj
 */
public enum PackageType {

    HOTEL_PACKAGE,
    HOTEL_BUS_PACKAGE,
    HOTEL_FLIGHT_PACKAGE,
    SERVICE_BUS_PACKAGE,
    MULTIDESTINATION_PACKAGE,
    CIRCUIT_PACKAGE;

    public static PackageType getEnum(String enumerator) {

        if (enumerator.equals("1")) {
            return PackageType.HOTEL_PACKAGE;
        } else if (enumerator.equals("2")) {
            return PackageType.HOTEL_BUS_PACKAGE;
        } else if (enumerator.equals("3")) {
            return PackageType.HOTEL_FLIGHT_PACKAGE;
        } else if (enumerator.equals("4")) {
            return PackageType.SERVICE_BUS_PACKAGE;
        } else if (enumerator.equals("5")) {
            return PackageType.MULTIDESTINATION_PACKAGE;
        } else if (enumerator.equals("7")) {
            return PackageType.CIRCUIT_PACKAGE;
        }

        return null;
    }


    public static Integer getId(String enumerator) {
        if (enumerator.equals("HOTEL_PACKAGE")) {
            return 1;
        } else if (enumerator.equals("HOTEL_BUS_PACKAGE")) {
            return 2;
        } else if (enumerator.equals("HOTEL_FLIGHT_PACKAGE")) {
            return 3;
        } else if (enumerator.equals("SERVICE_BUS_PACKAGE")) {
            return 4;
        } else if (enumerator.equals("MULTIDESTINATION_PACKAGE")) {
            return 5;
        } else {
            return enumerator.equals("CIRCUIT_PACKAGE") ? 7 : null;
        }
    }

}
