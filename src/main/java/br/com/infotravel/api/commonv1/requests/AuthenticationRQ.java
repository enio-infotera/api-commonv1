package br.com.infotravel.api.commonv1.requests;

/**
 *
 * @author laerc
 */
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationRQ {

    private static final long serialVersionUID = 5926468583005150707L;

    private String username;
    private String password;
    private String agency;
    private String client;
    private String category;

    private String nrIp;
    private String language;

    //need default constructor for JSON Parsing
    public AuthenticationRQ() {

    }

    public AuthenticationRQ(String username, String password, String agency, String client) {
        this.username = username;
        this.password = password;
        this.agency = agency;
        this.client = client;
    }

    public AuthenticationRQ(String username, String password, String agency, String client, String language) {
        this.username = username;
        this.password = password;
        this.agency = agency;
        this.client = client;
        this.language=language;
    }

    public AuthenticationRQ(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getNrIp() {
        return nrIp;
    }

    public void setNrIp(String nrIp) {
        this.nrIp = nrIp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
