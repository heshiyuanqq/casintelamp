package com.cas.intelamp.model;

import java.util.Date;

public class Messages {
    private Integer id;

    private Byte typ;

    private Date time;

    private Integer streetId;

    private Integer poleId;

    private Byte deviceTyp;

    private String deviceSn;

    private String content;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getTyp() {
        return typ;
    }

    public void setTyp(Byte typ) {
        this.typ = typ;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStreetId() {
        return streetId;
    }

    public void setStreetId(Integer streetId) {
        this.streetId = streetId;
    }

    public Integer getPoleId() {
        return poleId;
    }

    public void setPoleId(Integer poleId) {
        this.poleId = poleId;
    }

    public Byte getDeviceTyp() {
        return deviceTyp;
    }

    public void setDeviceTyp(Byte deviceTyp) {
        this.deviceTyp = deviceTyp;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn == null ? null : deviceSn.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}