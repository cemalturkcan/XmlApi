package com.mobildev.xmlapi.xmlBody;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MainReportRoot")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    @XmlElement(name="UserName")
    private String apikey;
    @XmlElement(name="PassWord")
    private String apiSecret;
    @XmlElement(name="Action")
    private int Action = 4;

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public int getAction() {
        return Action;
    }

    public void setAction(int action) {
        Action = action;
    }
}