package br.com.infotravel.api.commonv1.dto;

import br.com.infotravel.api.commonv1.enumerators.AttachmentType;

public class ApiAttachment {

    private AttachmentType type;
    private String url;


    public ApiAttachment() {
    }

    public ApiAttachment(AttachmentType type, String url) {
        this.type = type;
        this.url = url;
    }

    public AttachmentType getType() {
        return type;
    }

    public void setType(AttachmentType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
