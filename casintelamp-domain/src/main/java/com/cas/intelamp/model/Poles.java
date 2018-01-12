package com.cas.intelamp.model;

public class Poles {
    private Integer id;

    private Integer streetid;

    private String poleSn;

    private String ctrlSn;

    private String name;

    private Byte typ;

    private String latitude;

    private String longitude;

    private Byte status;

    private String airSn;

    private String radioSn;

    private String cameraSn;

    private String chargerSn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStreetid() {
        return streetid;
    }

    public void setStreetid(Integer streetid) {
        this.streetid = streetid;
    }

    public String getPoleSn() {
        return poleSn;
    }

    public void setPoleSn(String poleSn) {
        this.poleSn = poleSn == null ? null : poleSn.trim();
    }

    public String getCtrlSn() {
        return ctrlSn;
    }

    public void setCtrlSn(String ctrlSn) {
        this.ctrlSn = ctrlSn == null ? null : ctrlSn.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getTyp() {
        return typ;
    }

    public void setTyp(Byte typ) {
        this.typ = typ;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getAirSn() {
        return airSn;
    }

    public void setAirSn(String airSn) {
        this.airSn = airSn == null ? null : airSn.trim();
    }

    public String getRadioSn() {
        return radioSn;
    }

    public void setRadioSn(String radioSn) {
        this.radioSn = radioSn == null ? null : radioSn.trim();
    }

    public String getCameraSn() {
        return cameraSn;
    }

    public void setCameraSn(String cameraSn) {
        this.cameraSn = cameraSn == null ? null : cameraSn.trim();
    }

    public String getChargerSn() {
        return chargerSn;
    }

    public void setChargerSn(String chargerSn) {
        this.chargerSn = chargerSn == null ? null : chargerSn.trim();
    }
}