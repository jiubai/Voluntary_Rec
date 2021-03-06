package com.Jiubai.pojo.entity;

import java.util.Date;

public class Volunteer {
    private Integer id;

    private Integer volId;

    private Integer volCertStatus;

    private Integer volProvince;

    private Integer volDistrict;

    private Integer volCommittee;

    private String loginName;

    private String loginPass;

    private Integer loginStatus;

    private Date createTime;

    private Integer volNumber;

    private String volTrueName;

    private Integer volGender;

    private Date volBirthDate;

    private Integer volEthnicity;

    private Integer volStudentFlag;

    private Integer volUniversity;

    private Integer volEduDegree;

    private Integer volPolitical;

    private Integer volHour;

    private String volSkill;

    private String volServiceTag;

    private Integer volActiveFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVolId() {
        return volId;
    }

    public void setVolId(Integer volId) {
        this.volId = volId;
    }

    public Integer getVolCertStatus() {
        return volCertStatus;
    }

    public void setVolCertStatus(Integer volCertStatus) {
        this.volCertStatus = volCertStatus;
    }

    public Integer getVolProvince() {
        return volProvince;
    }

    public void setVolProvince(Integer volProvince) {
        this.volProvince = volProvince;
    }

    public Integer getVolDistrict() {
        return volDistrict;
    }

    public void setVolDistrict(Integer volDistrict) {
        this.volDistrict = volDistrict;
    }

    public Integer getVolCommittee() {
        return volCommittee;
    }

    public void setVolCommittee(Integer volCommittee) {
        this.volCommittee = volCommittee;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass == null ? null : loginPass.trim();
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getVolNumber() {
        return volNumber;
    }

    public void setVolNumber(Integer volNumber) {
        this.volNumber = volNumber;
    }

    public String getVolTrueName() {
        return volTrueName;
    }

    public void setVolTrueName(String volTrueName) {
        this.volTrueName = volTrueName == null ? null : volTrueName.trim();
    }

    public Integer getVolGender() {
        return volGender;
    }

    public void setVolGender(Integer volGender) {
        this.volGender = volGender;
    }

    public Date getVolBirthDate() {
        return volBirthDate;
    }

    public void setVolBirthDate(Date volBirthDate) {
        this.volBirthDate = volBirthDate;
    }

    public Integer getVolEthnicity() {
        return volEthnicity;
    }

    public void setVolEthnicity(Integer volEthnicity) {
        this.volEthnicity = volEthnicity;
    }

    public Integer getVolStudentFlag() {
        return volStudentFlag;
    }

    public void setVolStudentFlag(Integer volStudentFlag) {
        this.volStudentFlag = volStudentFlag;
    }

    public Integer getVolUniversity() {
        return volUniversity;
    }

    public void setVolUniversity(Integer volUniversity) {
        this.volUniversity = volUniversity;
    }

    public Integer getVolEduDegree() {
        return volEduDegree;
    }

    public void setVolEduDegree(Integer volEduDegree) {
        this.volEduDegree = volEduDegree;
    }

    public Integer getVolPolitical() {
        return volPolitical;
    }

    public void setVolPolitical(Integer volPolitical) {
        this.volPolitical = volPolitical;
    }

    public Integer getVolHour() {
        return volHour;
    }

    public void setVolHour(Integer volHour) {
        this.volHour = volHour;
    }

    public String getVolSkill() {
        return volSkill;
    }

    public void setVolSkill(String volSkill) {
        this.volSkill = volSkill == null ? null : volSkill.trim();
    }

    public String getVolServiceTag() {
        return volServiceTag;
    }

    public void setVolServiceTag(String volServiceTag) {
        this.volServiceTag = volServiceTag == null ? null : volServiceTag.trim();
    }

    public Integer getVolActiveFlag() {
        return volActiveFlag;
    }

    public void setVolActiveFlag(Integer volActiveFlag) {
        this.volActiveFlag = volActiveFlag;
    }
}