package br.com.infotravel.api.commonv1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiParBilhete {

    private String a0;
    private String a1;
    private String a2;
    private String a3;
    private String a4;

    public ApiParBilhete() {
    }

    public ApiParBilhete(String a0, String a1, String a2, String a3, String a4) {
        this.a0 = a0;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public String getA0() {
        return this.a0;
    }

    public void setA0(String a0) {
        this.a0 = a0;
    }

    public String getA1() {
        return this.a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return this.a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return this.a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return this.a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }
}
