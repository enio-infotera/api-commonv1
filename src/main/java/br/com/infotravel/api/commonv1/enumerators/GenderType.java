package br.com.infotravel.api.commonv1.enumerators;

public enum GenderType {
    MALE,
    FEMALE;

    public static String getTypeGender(String enumeration) {
        if (enumeration == null || "".equals(enumeration)) {
            return null;
        }

        if (enumeration.equals(MALE.name())) {
            return "M";
        } else if (enumeration.equals(FEMALE.name())) {
            return "F";
        } else {
            return null;
        }
    }

    public static GenderType getEnum(String enumeration) {
        if (enumeration == null || "".equals(enumeration)) {
            return null;
        }

        switch (enumeration) {
            case "F":
                return FEMALE;
            case "M":
                return MALE;
            default:
                return null;
        }
    }

}
