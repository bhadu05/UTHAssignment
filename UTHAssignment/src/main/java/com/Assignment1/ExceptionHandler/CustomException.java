package com.Assignment1.ExceptionHandler;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class CustomException extends RuntimeException {
   private static final long serialVersionUID=1L;
   private String errorCode;
   private String errorMessage;


   public String getErrorCode()
   {
       return errorCode;
   }
   public void setErrorCode(String errorCode)
   {
       this.errorCode=errorCode;
   }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public CustomException(String errorCode,String errorMessage)
    {
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }
    public CustomException()
    {

    }
}
