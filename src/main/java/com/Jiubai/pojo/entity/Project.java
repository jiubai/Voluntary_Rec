package com.Jiubai.pojo.entity;

import java.util.Date;

public class Project {
    private Integer id;

    private Integer oppId;

    private String oppName;

    private Integer orgId;

    private Date oppStartDate;

    private Date oppEndDate;

    private Date oppRecruitStartDate;

    private Date oppRecruitEndDate;

    private Integer oppProvince;

    private Integer oppDistrict;

    private Integer oppStreet;

    private Integer oppCommittee;

    private String oppAddress;

    private String oppDateDesc;

    private String oppSupport;

    private String oppObject;

    private String oppMemo;

    private Double oppHour;

    private Integer oppHits;

    private Date createTime;

    private Integer oppMembers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOppId() {
        return oppId;
    }

    public void setOppId(Integer oppId) {
        this.oppId = oppId;
    }

    public String getOppName() {
        return oppName;
    }

    public void setOppName(String oppName) {
        this.oppName = oppName == null ? null : oppName.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Date getOppStartDate() {
        return oppStartDate;
    }

    public void setOppStartDate(Date oppStartDate) {
        this.oppStartDate = oppStartDate;
    }

    public Date getOppEndDate() {
        return oppEndDate;
    }

    public void setOppEndDate(Date oppEndDate) {
        this.oppEndDate = oppEndDate;
    }

    public Date getOppRecruitStartDate() {
        return oppRecruitStartDate;
    }

    public void setOppRecruitStartDate(Date oppRecruitStartDate) {
        this.oppRecruitStartDate = oppRecruitStartDate;
    }

    public Date getOppRecruitEndDate() {
        return oppRecruitEndDate;
    }

    public void setOppRecruitEndDate(Date oppRecruitEndDate) {
        this.oppRecruitEndDate = oppRecruitEndDate;
    }

    public Integer getOppProvince() {
        return oppProvince;
    }

    public void setOppProvince(Integer oppProvince) {
        this.oppProvince = oppProvince;
    }

    public Integer getOppDistrict() {
        return oppDistrict;
    }

    public void setOppDistrict(Integer oppDistrict) {
        this.oppDistrict = oppDistrict;
    }

    public Integer getOppStreet() {
        return oppStreet;
    }

    public void setOppStreet(Integer oppStreet) {
        this.oppStreet = oppStreet;
    }

    public Integer getOppCommittee() {
        return oppCommittee;
    }

    public void setOppCommittee(Integer oppCommittee) {
        this.oppCommittee = oppCommittee;
    }

    public String getOppAddress() {
        return oppAddress;
    }

    public void setOppAddress(String oppAddress) {
        this.oppAddress = oppAddress == null ? null : oppAddress.trim();
    }

    public String getOppDateDesc() {
        return oppDateDesc;
    }

    public void setOppDateDesc(String oppDateDesc) {
        this.oppDateDesc = oppDateDesc == null ? null : oppDateDesc.trim();
    }

    public String getOppSupport() {
        return oppSupport;
    }

    public void setOppSupport(String oppSupport) {
        this.oppSupport = oppSupport == null ? null : oppSupport.trim();
    }

    public String getOppObject() {
        return oppObject;
    }

    public void setOppObject(String oppObject) {
        this.oppObject = oppObject == null ? null : oppObject.trim();
    }

    public String getOppMemo() {
        return oppMemo;
    }

    public void setOppMemo(String oppMemo) {
        this.oppMemo = oppMemo == null ? null : oppMemo.trim();
    }

    public Double getOppHour() {
        return oppHour;
    }

    public void setOppHour(Double oppHour) {
        this.oppHour = oppHour;
    }

    public Integer getOppHits() {
        return oppHits;
    }

    public void setOppHits(Integer oppHits) {
        this.oppHits = oppHits;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getOppMembers() {
        return oppMembers;
    }

    public void setOppMembers(Integer oppMembers) {
        this.oppMembers = oppMembers;
    }
}