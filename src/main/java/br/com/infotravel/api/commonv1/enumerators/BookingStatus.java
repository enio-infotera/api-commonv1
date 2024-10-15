/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 * @author Arquimedes
 */
public enum BookingStatus {

    RESERVED,
    CONFIRMED,
    CANCELED,
    WAITING_LIST, // LISTA DE ESPERA
    ORDER,//SOLICITACAO
    INCONSISTENT,
    DENIED,//NEGACO
    QUOTATION, //ORCAMENTO
    EXPIRED,
    PROCESSING,
    BLOCKED,
    IN_PAYMENT_PROCESS,
    ON_REQUEST,
    IN_CANCELLATION_PROCESS,
    MODIFIED,
    CREATION,
    EMPTY,
    NOT_INTEGRATED,
    ANALYSIS,
    EDITION;

    public static BookingStatus getEnumCommon(String enumerator) {

        switch (enumerator) {
            case "1":
                return BookingStatus.RESERVED;
            case "2":
                return BookingStatus.CONFIRMED;
            case "3":
                return BookingStatus.CANCELED;
            case "4":
                return BookingStatus.WAITING_LIST;
            case "5":
                return BookingStatus.ORDER;
            case "6":
                return BookingStatus.INCONSISTENT;
            case "7":
                return BookingStatus.DENIED;
            case "8":
                return BookingStatus.QUOTATION;
            case "9":
                return BookingStatus.EXPIRED;
            case "10":
                return BookingStatus.PROCESSING;
            case "11":
                return BookingStatus.BLOCKED;
            case "12":
                return BookingStatus.IN_PAYMENT_PROCESS;
            case "13":
                return BookingStatus.ON_REQUEST;
            case "14":
                return BookingStatus.IN_CANCELLATION_PROCESS;
            case "15":
                return BookingStatus.MODIFIED;
            case "16":
                return BookingStatus.CREATION;
            case "17":
                return BookingStatus.EMPTY;
            default:
                return null;
        }
    }

    public static BookingStatus getEnumEntity(Integer id) {
        switch (id) {
            case 1:
                return BookingStatus.RESERVED;
            case 2:
                return BookingStatus.CONFIRMED;
            case 3:
                return BookingStatus.CANCELED;
            case 4:
                return BookingStatus.QUOTATION;
            case 5:
                return BookingStatus.EXPIRED;
            case 6:
                return BookingStatus.WAITING_LIST;
            case 7:
                return BookingStatus.IN_PAYMENT_PROCESS;
            case 8:
                return BookingStatus.ORDER;
            case 9:
                return BookingStatus.INCONSISTENT;
            case 10:
                return BookingStatus.DENIED;
            case 11:
                return BookingStatus.NOT_INTEGRATED;
            case 12:
                return BookingStatus.CREATION;
            case 13:
                return BookingStatus.ANALYSIS;
            case 14:
                return BookingStatus.EDITION;
            case 15:
                return BookingStatus.BLOCKED;
            case 16:
                return BookingStatus.ON_REQUEST;
            case 17:
                return BookingStatus.IN_CANCELLATION_PROCESS;
            case 18:
                return BookingStatus.EMPTY;
            case 19:
                return BookingStatus.PROCESSING;
            case 20:
                return BookingStatus.MODIFIED;
            default:
                return null;
        }

    }

    public static BookingStatus getEnumEntityOnRequest(Integer id) {
        switch (id) {
            case 1:
            case 16:
                return BookingStatus.ON_REQUEST;
            case 2:
                return BookingStatus.CONFIRMED;
            case 3:
                return BookingStatus.CANCELED;
            case 8:
                return BookingStatus.ORDER;
            case 20:
                return BookingStatus.MODIFIED;
            default:
                return null;
        }
    }

    public static BookingStatus getEnumCommonOnRequest(Integer id) {
        switch (id) {
            case 1:
            case 13:
                return BookingStatus.ON_REQUEST;
            case 2:
                return BookingStatus.CONFIRMED;
            case 6:
            case 7:
                return BookingStatus.DENIED;
            case 3:
                return BookingStatus.CANCELED;
            case 5:
                return BookingStatus.ORDER;
            case 15:
                return BookingStatus.MODIFIED;
            default:
                return null;
        }
    }

    //baseado no br.com.infotravel.entity.ReservaStatus
    public static Integer getIdReservaStatus(BookingStatus bookingStatus) {
        if (bookingStatus == null) {
            return null;
        }
        switch (bookingStatus) {
            case RESERVED:
                return 1;
            case CONFIRMED:
                return 2;
            case CANCELED:
                return 3;
            case QUOTATION:
                return 4;
            case EXPIRED:
                return 5;
            case WAITING_LIST:
                return 6;
            case IN_PAYMENT_PROCESS:
                return 7;
            case ORDER:
                return 8;
            case INCONSISTENT:
                return 9;
            case DENIED:
                return 10;
            case NOT_INTEGRATED:
                return 11;
            case CREATION:
                return 12;
            case ANALYSIS:
                return 13;
            case EDITION:
                return 14;
            case BLOCKED:
                return 15;
            case ON_REQUEST:
                return 16;
            case IN_CANCELLATION_PROCESS:
                return 17;
            case EMPTY:
                return 18;
            case PROCESSING:
                return 19;
            case MODIFIED:
                return 20;
            default:
                return null;
        }

    }

}
