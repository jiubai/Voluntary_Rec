package com.Jiubai.pojo.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RecResult {
    private Integer volId;

    private String recList;

    public Integer getVolId() {
        return volId;
    }

    public void setVolId(Integer volId) {
        this.volId = volId;
    }

    public String getRecList() {
        return recList;
    }

    public void setRecList(String recList) {
        this.recList = recList == null ? null : recList.trim();
    }
}