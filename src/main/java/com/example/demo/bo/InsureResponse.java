package com.example.demo.bo;

import java.io.Serializable;

/**
 * 新契约投保返回结果
 */
public class InsureResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String polNo;
    private String appNo;

    private String prem;

    public String getPolNo() {
        return polNo;
    }

    public void setPolNo(String polNo) {
        this.polNo = polNo;
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public String getPrem() {
        return prem;
    }

    public void setPrem(String prem) {
        this.prem = prem;
    }
}
