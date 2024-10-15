/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author ederp
 */
public enum TransferType {
    ROUND_TRIP,
    ONE_WAY,
    AIRPORT_HOTEL,
    HOTEL_AIRPORT,
    HOTEL_HOTEL,
    HOTEL_STATION,
    HOTEL_HARBOR,
    AIRPORT_AIRPORT,
    AIRPORT_STATION,
    AIRPORT_HARBOR,
    STATION_STATION,
    STATION_HARBOR,
    STATION_AIRPORT,
    STATION_HOTEL,
    HARBOR_HARBOR,
    HARBOR_STATION,
    HARBOR_HOTEL,
    HARBOR_AIRPORT,;

    public static TransferType getEnum(String enumerator) {

        if (enumerator.equals("ROUND_TRIP")) {
            return TransferType.ROUND_TRIP;
        } else if (enumerator.equals("ONE_WAY")) {
            return TransferType.ONE_WAY;
        }
        if (enumerator.equals("TRANSFER")) {
            return TransferType.ROUND_TRIP;
        } else if (enumerator.equals("TRANSFER_TRECHO")) {
            return TransferType.ONE_WAY;
        } else if (enumerator.equals("AIRPORT_HOTEL")) {
            return TransferType.AIRPORT_HOTEL;
        } else if (enumerator.equals("HOTEL_AIRPORT")) {
            return TransferType.HOTEL_AIRPORT;
        } else if (enumerator.equals("AEROPORTO_HOTEL")) {
            return TransferType.AIRPORT_HOTEL;
        } else if (enumerator.equals("HOTEL_AEROPORTO")) {
            return TransferType.HOTEL_AIRPORT;
        } else if (enumerator.equals("HOTEL_HOTEL")) {
            return TransferType.HOTEL_HOTEL;
        } else if (enumerator.equals("HOTEL_ESTACAO")) {
            return TransferType.HOTEL_STATION;
        } else if (enumerator.equals("HOTEL_PORTO")) {
            return TransferType.HOTEL_HARBOR;
        } else if (enumerator.equals("AEROPORTO_AEROPORTO")) {
            return TransferType.AIRPORT_AIRPORT;
        } else if (enumerator.equals("AEROPORTO_ESTACAO")) {
            return TransferType.AIRPORT_STATION;
        } else if (enumerator.equals("AEROPORTO_PORTO")) {
            return TransferType.AIRPORT_HARBOR;
        } else if (enumerator.equals("ESTACAO_ESTACAO")) {
            return TransferType.STATION_STATION;
        } else if (enumerator.equals("ESTACAO_PORTO")) {
            return TransferType.STATION_HARBOR;
        } else if (enumerator.equals("ESTACAO_HOTEL")) {
            return TransferType.STATION_HOTEL;
        } else if (enumerator.equals("ESTACAO_AEROPORTO")) {
            return TransferType.STATION_AIRPORT;
        } else if (enumerator.equals("PORTO_PORTO")) {
            return TransferType.HARBOR_HARBOR;
        } else if (enumerator.equals("PORTO_ESTACAO")) {
            return TransferType.HARBOR_STATION;
        } else if (enumerator.equals("PORTO_HOTEL")) {
            return TransferType.HARBOR_HOTEL;
        } else if (enumerator.equals("PORTO_AEROPORTO")) {
            return TransferType.HARBOR_AIRPORT;
        }
        return null;
    }

    public boolean isTpRoundTrip() {
        return ROUND_TRIP.equals(this);
    }

    public boolean isTpOneWay() {
        return ONE_WAY.equals(this);
    }

}
