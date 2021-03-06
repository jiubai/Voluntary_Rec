package com.Jiubai.pojo.entity;

import java.util.Date;

public class Organization {
    private Integer id;

    private Integer orgId;

    private Integer orgParentId;

    private String orgName;

    private String orgManagerUnit;

    private Date orgBuildDate;

    private Integer orgProvince;

    private Integer orgDistrict;

    private Integer orgStreet;

    private Integer orgCommittee;

    private String orgAddress;

    private Double orgHour;

    private Integer orgMember;

    private String orgIntroduce;

    private Integer manageDistrict;

    private Integer manageUniversity;

    private Integer orgMembers;

    private Integer orgHits;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(Integer orgParentId) {
        this.orgParentId = orgParentId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgManagerUnit() {
        return orgManagerUnit;
    }

    public void setOrgManagerUnit(String orgManagerUnit) {
        this.orgManagerUnit = orgManagerUnit == null ? null : orgManagerUnit.trim();
    }

    public Date getOrgBuildDate() {
        return orgBuildDate;
    }

    public void setOrgBuildDate(Date orgBuildDate) {
        this.orgBuildDate = orgBuildDate;
    }

    public Integer getOrgProvince() {
        return orgProvince;
    }

    public void setOrgProvince(Integer orgProvince) {
        this.orgProvince = orgProvince;
    }

    public Integer getOrgDistrict() {
        return orgDistrict;
    }

    public void setOrgDistrict(Integer orgDistrict) {
        this.orgDistrict = orgDistrict;
    }

    public Integer getOrgStreet() {
        return orgStreet;
    }

    public void setOrgStreet(Integer orgStreet) {
        this.orgStreet = orgStreet;
    }

    public Integer getOrgCommittee() {
        return orgCommittee;
    }

    public void setOrgCommittee(Integer orgCommittee) {
        this.orgCommittee = orgCommittee;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    public Double getOrgHour() {
        return orgHour;
    }

    public void setOrgHour(Double orgHour) {
        this.orgHour = orgHour;
    }

    public Integer getOrgMember() {
        return orgMember;
    }

    public void setOrgMember(Integer orgMember) {
        this.orgMember = orgMember;
    }

    public String getOrgIntroduce() {
        return orgIntroduce;
    }

    public void setOrgIntroduce(String orgIntroduce) {
        this.orgIntroduce = orgIntroduce == null ? null : orgIntroduce.trim();
    }

    public Integer getManageDistrict() {
        return manageDistrict;
    }

    public void setManageDistrict(Integer manageDistrict) {
        this.manageDistrict = manageDistrict;
    }

    public Integer getManageUniversity() {
        return manageUniversity;
    }

    public void setManageUniversity(Integer manageUniversity) {
        this.manageUniversity = manageUniversity;
    }

    public Integer getOrgMembers() {
        return orgMembers;
    }

    public void setOrgMembers(Integer orgMembers) {
        this.orgMembers = orgMembers;
    }

    public Integer getOrgHits() {
        return orgHits;
    }

    public void setOrgHits(Integer orgHits) {
        this.orgHits = orgHits;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}