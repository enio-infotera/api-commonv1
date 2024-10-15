/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infotravel.api.commonv1.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author gustavo
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingRQ {

    @JsonProperty(value = "imageContent")
    private byte[] btConteudo;
    @JsonProperty(value = "imageName")
    private String nmImagem;
    @JsonProperty(value = "credentialID")
    private Integer idIntegradorCredencial;

    public BillingRQ() {
    }

    public byte[] getBtConteudo() {
        return btConteudo;
    }

    public void setBtConteudo(byte[] btConteudo) {
        this.btConteudo = btConteudo;
    }

    public String getNmImagem() {
        return nmImagem;
    }

    public void setNmImagem(String nmImagem) {
        this.nmImagem = nmImagem;
    }

    public Integer getIdIntegradorCredencial() {
        return idIntegradorCredencial;
    }

    public void setIdIntegradorCredencial(Integer idIntegradorCredencial) {
        this.idIntegradorCredencial = idIntegradorCredencial;
    }

}
