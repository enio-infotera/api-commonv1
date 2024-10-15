package br.com.infotravel.api.commonv1.enumerators;

public enum ServiceIncludedType {
    INCLUDED,
    ADDITIONAL,
    OPTIONAL;

    public static ServiceIncludedType getEnum(Integer id) {
        switch (id) {
            case 1:
                return INCLUDED;
            case 2:
                return ADDITIONAL;
            case 3:
                return OPTIONAL;
            default:
                return null;
        }
    }

    public static Integer getId(ServiceIncludedType serviceIncludedType) {
        if (serviceIncludedType.equals(INCLUDED)) {
            return 1;
        } else if (serviceIncludedType.equals(ADDITIONAL)) {
            return 2;
        }else if (serviceIncludedType.equals(OPTIONAL)) {
            return 3;
        }else {
            return null;
        }
    }

}
