package com.example.demo.dto;

import java.io.Serializable;

public class Request<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bankCode;
    private String txCode;
    private String txId;
    private T requestContent;

    public Request(){}

    public Request(String bankCode, String txCode, String txId){
        this.bankCode = bankCode;
        this.txCode = txCode;
        this.txId = txId;
    }

    public Request(String bankCode, String txCode, String txId, T requestContent){
        this(bankCode, txCode, txId);
        this.requestContent = requestContent;
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

    public T getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(T requestContent) {
        this.requestContent = requestContent;
    }
}
