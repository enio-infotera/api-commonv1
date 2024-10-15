/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author William Dias
 */
public enum PagtoStatus {

    NAO_INFORMADO(1),
    AGPAG(2),
    PAGO(3),
    REEMBOLSADO(4),
    ANALISE(7),
    CANCELADO(8),
    ANALISE_NEGADO(9),
    ANALISE_PAGAMENTO(10);

    private final Integer id;

    PagtoStatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean equals(Integer id) {
        return this.id.equals(id);
    }

    public static PagtoStatus valueOf(Integer id) {
        if (id == null) {
            return null;
        }
        for (PagtoStatus v : PagtoStatus.values()) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public static String getValue(PagtoStatus status) {
        return status.name();
    }
}
