package com.cas.intelamp.model;

import java.util.Date;

public class RPlans {
    private Integer id;

    private String name;

    private Date startDate;

    private Date endDate;

    private Date playBegin;

    private Date playEnd;

    private Byte typ;

    private Byte iscycle;

    private String notes;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getPlayBegin() {
        return playBegin;
    }

    public void setPlayBegin(Date playBegin) {
        this.playBegin = playBegin;
    }

    public Date getPlayEnd() {
        return playEnd;
    }

    public void setPlayEnd(Date playEnd) {
        this.playEnd = playEnd;
    }

    public Byte getTyp() {
        return typ;
    }

    public void setTyp(Byte typ) {
        this.typ = typ;
    }

    public Byte getIscycle() {
        return iscycle;
    }

    public void setIscycle(Byte iscycle) {
        this.iscycle = iscycle;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}