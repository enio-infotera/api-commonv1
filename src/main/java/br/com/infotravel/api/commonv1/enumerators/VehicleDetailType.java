package br.com.infotravel.api.commonv1.enumerators;

public enum VehicleDetailType {
    AIR_CONDITIONING,
    FUEL,
    CATEGORY,
    NR_PASSENGER,
    NR_LUGGAGE,
    NR_DOORS,
    TRANSMISSION,
    MILEAGE,
    IMAGE,
    MODEL;

    public static VehicleDetailType getEnum(Integer id) {
        switch (id) {
            case 0:
                return AIR_CONDITIONING;
            case 1:
                return FUEL;
            case 2:
                return CATEGORY;
            case 3:
                return NR_PASSENGER;
            case 4:
                return NR_LUGGAGE;
            case 5:
                return NR_DOORS;
            case 6:
                return TRANSMISSION;
            case 7:
                return MILEAGE;
            case 8:
                return IMAGE;
            case 9:
                return MODEL;
            default:
                return null;
        }
    }
}
