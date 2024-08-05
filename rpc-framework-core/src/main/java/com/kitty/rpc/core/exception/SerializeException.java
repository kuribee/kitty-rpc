package com.kitty.rpc.core.exception;

public class SerializeException extends RuntimeException{
    private static final long serialVersionUID=3365624081242234232L;

    public SerializeException() {
        super();
    }

    public SerializeException(String msg) {
        super(msg);
    }

    public SerializeException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public SerializeException(Throwable cause) {
        super(cause);
    }
}
