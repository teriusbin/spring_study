package com.netmarble.springstudy.exception;

import com.netmarble.springstudy.constant.ResultStatus;

/**
 * Created by mydus on 2016-08-17.
 */
public class BoardException extends RuntimeException{
    ResultStatus resultStatus;
    public BoardException(ResultStatus status){
        this.resultStatus = status;
    }

    public ResultStatus getResultStatus() {
        return resultStatus;
    }
}
