package br.com.infotravel.api.commonv1.enumerators;

public enum BookingType {
    HOTEL_PACKAGE,
    HOTEL_FLIGHT_PACKAGE,
    HOTEL,
    SERVICE,
    FLIGHT,
    HOTEL_BUS_PACKAGE,
    SERVICE_BUS_PACKAGE,
    CRUISE,
    TOUR,
    MULTI_DESTINATION,
    BUS,
    TRAIN,
    EMPTY;

    public static BookingType getEnum(String enumerator) {
        if (enumerator.equals("-1")) {
            return BookingType.EMPTY;
        } else if (enumerator.equals("1")) {
            return BookingType.HOTEL_PACKAGE;
        } else if (enumerator.equals("3")) {
            return BookingType.HOTEL_FLIGHT_PACKAGE;
        } else if (enumerator.equals("4")) {
            return BookingType.HOTEL;
        } else if (enumerator.equals("5")) {
            return BookingType.SERVICE;
        } else if (enumerator.equals("7")) {
            return BookingType.FLIGHT;
        } else if (enumerator.equals("8")) {
            return BookingType.HOTEL_BUS_PACKAGE;
        } else if (enumerator.equals("9")) {
            return BookingType.SERVICE_BUS_PACKAGE;
        } else if (enumerator.equals("10")) {
            return BookingType.CRUISE;
        } else if (enumerator.equals("12")) {
            return BookingType.TOUR;
        } else if (enumerator.equals("13")) {
            return BookingType.MULTI_DESTINATION;
        } else if (enumerator.equals("14")) {
            return BookingType.BUS;
        } else if (enumerator.equals("15")) {
            return BookingType.TRAIN;
        }

        return null;
    }

}
