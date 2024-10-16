package br.com.infotravel.api.commonv1.exceptions;

/**
 * @author enioj
 */
public class ApiException extends RuntimeException {
    private final int status;
    private final String description;
    private final String code;

    public ApiException(int status, String message, String description, String code) {
        super(message);
        this.status = status;
        this.description = description;
        this.code = code;
    }

    public ApiException(int status, String message, String description, String code, Throwable cause) {
        super(message, cause);
        this.status = status;
        this.description = description;
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "status=" + status +
                ", message='" + getMessage() + '\'' +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}