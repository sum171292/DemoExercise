package com.anf.core.error;


public class AppException extends RuntimeException {

    private static final long serialVersionUID = -5790688893785545325L;

    private final ErrorCode errorCode;

    public AppException(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode;
    }

    /**
     * Gets the error code.
     * 
     * @return the errorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
