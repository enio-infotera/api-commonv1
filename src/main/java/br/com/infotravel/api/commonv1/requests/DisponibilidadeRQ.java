/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.requests;

import br.com.infotravel.api.commonv1.enumerators.LanguageType;
import br.com.infotravel.api.commonv1.enumerators.CurrencyType;
import java.util.List;

/**
 *
 * @author Arquimedes
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisponibilidadeRQ {

    private String dtEntrada;
    private String dtSaida;
    private CurrencyType moeda;
    private LanguageType idioma;
    private String ocupacao;
    private List<String> hotelidList;

    public DisponibilidadeRQ(String dtEntrada, String dtSaida, CurrencyType moeda, LanguageType idioma, String ocupacao, List<String> hotelidList) {
        this.dtEntrada = dtEntrada;
        this.dtSaida = dtSaida;
        this.moeda = moeda;
        this.idioma = idioma;
        this.ocupacao = ocupacao;
        this.hotelidList = hotelidList;
    }

    public String getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public CurrencyType getMoeda() {
        return moeda;
    }

    public void setMoeda(CurrencyType moeda) {
        this.moeda = moeda;
    }

    public LanguageType getIdioma() {
        return idioma;
    }

    public void setIdioma(LanguageType idioma) {
        this.idioma = idioma;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public List<String> getHotelidList() {
        return hotelidList;
    }

    public void setHotelidList(List<String> hotelidList) {
        this.hotelidList = hotelidList;
    }

}
