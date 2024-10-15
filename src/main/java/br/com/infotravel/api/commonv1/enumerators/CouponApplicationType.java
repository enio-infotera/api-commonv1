package br.com.infotravel.api.commonv1.enumerators;

public enum CouponApplicationType {
    NET,
    SALE,
    ALL;

    public static CouponApplicationType getEnum(String tpAplicacao) {
        switch (tpAplicacao) {
            case "N":
                return NET;
            case "V":
                return SALE;
            case "T":
                return ALL;
            default:
                return null;
        }
    }
}
