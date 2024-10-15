package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author gustavo
 */
public enum RoomType {
    FAMILY,
    SINGLE,
    DOUBLE,
    TRIPLE,
    QUADRUPLE,
    QUINTUPLE,
    SEXTUPLE,
    SEPTUPLE,
    ADDITIONAL,
    EXTRA_NIGHT,
    UNDEFINED;

    public static RoomType getEnum(String enumerator) {

        switch (enumerator) {
            case "FAM":
                return RoomType.FAMILY;
            case "SGL":
                return RoomType.SINGLE;
            case "DPL":
                return RoomType.DOUBLE;
            case "TPL":
                return RoomType.TRIPLE;
            case "QUA":
                return RoomType.QUADRUPLE;
            case "QUI":
                return RoomType.QUINTUPLE;
            case "SEX":
                return RoomType.SEXTUPLE;
            case "SET":
                return RoomType.SEPTUPLE;
            case "ADC":
                return RoomType.ADDITIONAL;
            case "NTE":
                return RoomType.EXTRA_NIGHT;
            default:
                return RoomType.UNDEFINED;
        }
    }
}
