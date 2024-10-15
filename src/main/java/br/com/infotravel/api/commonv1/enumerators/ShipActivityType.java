package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author enioj
 */
public enum ShipActivityType {

    BOARDING,//EMBARQUE,
    ANCHORED,//ANCORADO,
    NAVIGATING,//NAVEGANDO,
    LANDING;//DESEMBARQUE;//DESEMBARQUE;

    public static ShipActivityType getEnum(String dsTipo) {
        if (null != dsTipo) {
            switch (dsTipo) {
                case "EMBARQUE":
                    return BOARDING;
                case "ANCORADO":
                    return ANCHORED;
                case "NAVEGANDO":
                    return NAVIGATING;
                case "DESEMBARQUE":
                    return LANDING;
                default:
                    break;
            }
        }

        return null;
    }

    public static ShipActivityType getEnum(Integer idTipo) {
        if (idTipo != null) {
            switch (idTipo) {
                case 1:
                    return BOARDING;
                case 2:
                    return ANCHORED;
                case 3:
                    return NAVIGATING;
                case 4:
                    return LANDING;
                default:
                    break;
            }
        }

        return null;
    }

}
