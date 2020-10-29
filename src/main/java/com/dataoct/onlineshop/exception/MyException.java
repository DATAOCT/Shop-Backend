package com.dataoct.onlineshop.exception;


import com.dataoct.onlineshop.enums.ResultEnum;

/**
 * Created By Dataoct Team on 3/10/2018.
 */
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
