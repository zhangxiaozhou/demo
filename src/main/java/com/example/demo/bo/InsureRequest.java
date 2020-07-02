package com.example.demo.bo;

import java.io.Serializable;

/**
 * 契约投保接口对象
 */
public class InsureRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    //保单号
    private String polNo;

    //投保单号
    private String appNo;

    //生效日期
    private String valiDate;

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

    public String getValiDate() {
        return valiDate;
    }

    public void setValiDate(String valiDate) {
        this.valiDate = valiDate;
    }

    @Override
    public String toString() {
        return "Insure{" +
                "polNo='" + polNo + '\'' +
                ", appNo='" + appNo + '\'' +
                ", valiDate='" + valiDate + '\'' +
                '}';
    }
}
