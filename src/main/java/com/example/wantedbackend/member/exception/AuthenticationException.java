package com.example.wantedbackend.member.exception;

import com.example.wantedbackend.support.exception.CustomException;
import com.example.wantedbackend.support.exception.ErrorCode;

public class AuthenticationException extends CustomException {
    public AuthenticationException() {
        super();
    }

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthenticationException(ErrorCode errorCode) {
        super(errorCode);
    }

    public AuthenticationException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }
}
