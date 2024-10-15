package br.com.infotravel.api.commonv1.enumerators;

public enum VehicleTransferType {

    PRIVATE("Privado"),
    REGULAR("Regular"),
    SHARED("Compartilhado"),
    SEMI_PRIVATIVO("Semi privativo");

    private String tipo;

    private VehicleTransferType(String tipo) {
        this.tipo = tipo;
    }

}
