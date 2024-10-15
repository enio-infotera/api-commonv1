package br.com.infotravel.api.commonv1.enumerators;

public enum TourServiceType {
    TRANSFER,
    ROOM,
    OUTROS;

    public static TourServiceType getEnum(String test) {

        for (TourServiceType n : TourServiceType.values()) {
            if (n.name().equals(test)) {
                return n;
            }
        }
        return null;
    }
}
