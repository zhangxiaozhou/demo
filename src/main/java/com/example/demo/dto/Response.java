package com.example.demo.dto;

import java.io.Serializable;

public class Response<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String state;
    private String messgae;
    private String bankCode;
    private String txCode;
    private String txId;
    private T resultContent;

    public Response(){}

    public Response(String bankCode, String txCode, String txId){
        this.bankCode = bankCode;
        this.txCode = txCode;
        this.txId = txId;
    }

    public Response(String bankCode, String txCode, String txId, String state, String message){
        this(bankCode, txCode, txId);
        this.state = state;
        this.messgae = message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getTxCode() {
        return txCode;
    }

    public void setTxCode(String txCode) {
        this.txCode = txCode;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public T getResultContent() {
        return resultContent;
    }

    public void setResultContent(T resultContent) {
        this.resultContent = resultContent;
    }
}
