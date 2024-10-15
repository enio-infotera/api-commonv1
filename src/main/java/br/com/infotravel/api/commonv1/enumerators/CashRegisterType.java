package br.com.infotravel.api.commonv1.enumerators;

public enum CashRegisterType {

    OPENED,
    CLOSED,
    CANCELED;


    public static CashRegisterType getEnum(Integer id) {
        switch (id) {
            case 1:
                return OPENED;
            case 2:
                return CLOSED;
            default:
                return CANCELED;
        }
    }

    public static Integer getId(CashRegisterType type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case OPENED:
                return 1;
            case CLOSED:
                return 2;
            default:
                return 3;
        }
    }
}
