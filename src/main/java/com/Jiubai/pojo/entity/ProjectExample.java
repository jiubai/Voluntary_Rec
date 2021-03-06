package com.Jiubai.pojo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOppIdIsNull() {
            addCriterion("opp_id is null");
            return (Criteria) this;
        }

        public Criteria andOppIdIsNotNull() {
            addCriterion("opp_id is not null");
            return (Criteria) this;
        }

        public Criteria andOppIdEqualTo(Integer value) {
            addCriterion("opp_id =", value, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdNotEqualTo(Integer value) {
            addCriterion("opp_id <>", value, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdGreaterThan(Integer value) {
            addCriterion("opp_id >", value, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_id >=", value, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdLessThan(Integer value) {
            addCriterion("opp_id <", value, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdLessThanOrEqualTo(Integer value) {
            addCriterion("opp_id <=", value, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdIn(List<Integer> values) {
            addCriterion("opp_id in", values, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdNotIn(List<Integer> values) {
            addCriterion("opp_id not in", values, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdBetween(Integer value1, Integer value2) {
            addCriterion("opp_id between", value1, value2, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_id not between", value1, value2, "oppId");
            return (Criteria) this;
        }

        public Criteria andOppNameIsNull() {
            addCriterion("opp_name is null");
            return (Criteria) this;
        }

        public Criteria andOppNameIsNotNull() {
            addCriterion("opp_name is not null");
            return (Criteria) this;
        }

        public Criteria andOppNameEqualTo(String value) {
            addCriterion("opp_name =", value, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameNotEqualTo(String value) {
            addCriterion("opp_name <>", value, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameGreaterThan(String value) {
            addCriterion("opp_name >", value, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameGreaterThanOrEqualTo(String value) {
            addCriterion("opp_name >=", value, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameLessThan(String value) {
            addCriterion("opp_name <", value, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameLessThanOrEqualTo(String value) {
            addCriterion("opp_name <=", value, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameLike(String value) {
            addCriterion("opp_name like", value, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameNotLike(String value) {
            addCriterion("opp_name not like", value, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameIn(List<String> values) {
            addCriterion("opp_name in", values, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameNotIn(List<String> values) {
            addCriterion("opp_name not in", values, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameBetween(String value1, String value2) {
            addCriterion("opp_name between", value1, value2, "oppName");
            return (Criteria) this;
        }

        public Criteria andOppNameNotBetween(String value1, String value2) {
            addCriterion("opp_name not between", value1, value2, "oppName");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOppStartDateIsNull() {
            addCriterion("opp_start_date is null");
            return (Criteria) this;
        }

        public Criteria andOppStartDateIsNotNull() {
            addCriterion("opp_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andOppStartDateEqualTo(Date value) {
            addCriterion("opp_start_date =", value, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateNotEqualTo(Date value) {
            addCriterion("opp_start_date <>", value, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateGreaterThan(Date value) {
            addCriterion("opp_start_date >", value, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("opp_start_date >=", value, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateLessThan(Date value) {
            addCriterion("opp_start_date <", value, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateLessThanOrEqualTo(Date value) {
            addCriterion("opp_start_date <=", value, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateIn(List<Date> values) {
            addCriterion("opp_start_date in", values, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateNotIn(List<Date> values) {
            addCriterion("opp_start_date not in", values, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateBetween(Date value1, Date value2) {
            addCriterion("opp_start_date between", value1, value2, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppStartDateNotBetween(Date value1, Date value2) {
            addCriterion("opp_start_date not between", value1, value2, "oppStartDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateIsNull() {
            addCriterion("opp_end_date is null");
            return (Criteria) this;
        }

        public Criteria andOppEndDateIsNotNull() {
            addCriterion("opp_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andOppEndDateEqualTo(Date value) {
            addCriterion("opp_end_date =", value, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateNotEqualTo(Date value) {
            addCriterion("opp_end_date <>", value, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateGreaterThan(Date value) {
            addCriterion("opp_end_date >", value, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("opp_end_date >=", value, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateLessThan(Date value) {
            addCriterion("opp_end_date <", value, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateLessThanOrEqualTo(Date value) {
            addCriterion("opp_end_date <=", value, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateIn(List<Date> values) {
            addCriterion("opp_end_date in", values, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateNotIn(List<Date> values) {
            addCriterion("opp_end_date not in", values, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateBetween(Date value1, Date value2) {
            addCriterion("opp_end_date between", value1, value2, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppEndDateNotBetween(Date value1, Date value2) {
            addCriterion("opp_end_date not between", value1, value2, "oppEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateIsNull() {
            addCriterion("opp_recruit_start_date is null");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateIsNotNull() {
            addCriterion("opp_recruit_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateEqualTo(Date value) {
            addCriterion("opp_recruit_start_date =", value, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateNotEqualTo(Date value) {
            addCriterion("opp_recruit_start_date <>", value, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateGreaterThan(Date value) {
            addCriterion("opp_recruit_start_date >", value, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("opp_recruit_start_date >=", value, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateLessThan(Date value) {
            addCriterion("opp_recruit_start_date <", value, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateLessThanOrEqualTo(Date value) {
            addCriterion("opp_recruit_start_date <=", value, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateIn(List<Date> values) {
            addCriterion("opp_recruit_start_date in", values, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateNotIn(List<Date> values) {
            addCriterion("opp_recruit_start_date not in", values, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateBetween(Date value1, Date value2) {
            addCriterion("opp_recruit_start_date between", value1, value2, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitStartDateNotBetween(Date value1, Date value2) {
            addCriterion("opp_recruit_start_date not between", value1, value2, "oppRecruitStartDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateIsNull() {
            addCriterion("opp_recruit_end_date is null");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateIsNotNull() {
            addCriterion("opp_recruit_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateEqualTo(Date value) {
            addCriterion("opp_recruit_end_date =", value, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateNotEqualTo(Date value) {
            addCriterion("opp_recruit_end_date <>", value, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateGreaterThan(Date value) {
            addCriterion("opp_recruit_end_date >", value, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("opp_recruit_end_date >=", value, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateLessThan(Date value) {
            addCriterion("opp_recruit_end_date <", value, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateLessThanOrEqualTo(Date value) {
            addCriterion("opp_recruit_end_date <=", value, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateIn(List<Date> values) {
            addCriterion("opp_recruit_end_date in", values, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateNotIn(List<Date> values) {
            addCriterion("opp_recruit_end_date not in", values, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateBetween(Date value1, Date value2) {
            addCriterion("opp_recruit_end_date between", value1, value2, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppRecruitEndDateNotBetween(Date value1, Date value2) {
            addCriterion("opp_recruit_end_date not between", value1, value2, "oppRecruitEndDate");
            return (Criteria) this;
        }

        public Criteria andOppProvinceIsNull() {
            addCriterion("opp_province is null");
            return (Criteria) this;
        }

        public Criteria andOppProvinceIsNotNull() {
            addCriterion("opp_province is not null");
            return (Criteria) this;
        }

        public Criteria andOppProvinceEqualTo(Integer value) {
            addCriterion("opp_province =", value, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceNotEqualTo(Integer value) {
            addCriterion("opp_province <>", value, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceGreaterThan(Integer value) {
            addCriterion("opp_province >", value, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_province >=", value, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceLessThan(Integer value) {
            addCriterion("opp_province <", value, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("opp_province <=", value, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceIn(List<Integer> values) {
            addCriterion("opp_province in", values, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceNotIn(List<Integer> values) {
            addCriterion("opp_province not in", values, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceBetween(Integer value1, Integer value2) {
            addCriterion("opp_province between", value1, value2, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_province not between", value1, value2, "oppProvince");
            return (Criteria) this;
        }

        public Criteria andOppDistrictIsNull() {
            addCriterion("opp_district is null");
            return (Criteria) this;
        }

        public Criteria andOppDistrictIsNotNull() {
            addCriterion("opp_district is not null");
            return (Criteria) this;
        }

        public Criteria andOppDistrictEqualTo(Integer value) {
            addCriterion("opp_district =", value, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictNotEqualTo(Integer value) {
            addCriterion("opp_district <>", value, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictGreaterThan(Integer value) {
            addCriterion("opp_district >", value, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_district >=", value, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictLessThan(Integer value) {
            addCriterion("opp_district <", value, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("opp_district <=", value, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictIn(List<Integer> values) {
            addCriterion("opp_district in", values, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictNotIn(List<Integer> values) {
            addCriterion("opp_district not in", values, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictBetween(Integer value1, Integer value2) {
            addCriterion("opp_district between", value1, value2, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_district not between", value1, value2, "oppDistrict");
            return (Criteria) this;
        }

        public Criteria andOppStreetIsNull() {
            addCriterion("opp_street is null");
            return (Criteria) this;
        }

        public Criteria andOppStreetIsNotNull() {
            addCriterion("opp_street is not null");
            return (Criteria) this;
        }

        public Criteria andOppStreetEqualTo(Integer value) {
            addCriterion("opp_street =", value, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetNotEqualTo(Integer value) {
            addCriterion("opp_street <>", value, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetGreaterThan(Integer value) {
            addCriterion("opp_street >", value, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_street >=", value, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetLessThan(Integer value) {
            addCriterion("opp_street <", value, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetLessThanOrEqualTo(Integer value) {
            addCriterion("opp_street <=", value, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetIn(List<Integer> values) {
            addCriterion("opp_street in", values, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetNotIn(List<Integer> values) {
            addCriterion("opp_street not in", values, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetBetween(Integer value1, Integer value2) {
            addCriterion("opp_street between", value1, value2, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppStreetNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_street not between", value1, value2, "oppStreet");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeIsNull() {
            addCriterion("opp_committee is null");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeIsNotNull() {
            addCriterion("opp_committee is not null");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeEqualTo(Integer value) {
            addCriterion("opp_committee =", value, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeNotEqualTo(Integer value) {
            addCriterion("opp_committee <>", value, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeGreaterThan(Integer value) {
            addCriterion("opp_committee >", value, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_committee >=", value, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeLessThan(Integer value) {
            addCriterion("opp_committee <", value, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeLessThanOrEqualTo(Integer value) {
            addCriterion("opp_committee <=", value, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeIn(List<Integer> values) {
            addCriterion("opp_committee in", values, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeNotIn(List<Integer> values) {
            addCriterion("opp_committee not in", values, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeBetween(Integer value1, Integer value2) {
            addCriterion("opp_committee between", value1, value2, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppCommitteeNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_committee not between", value1, value2, "oppCommittee");
            return (Criteria) this;
        }

        public Criteria andOppAddressIsNull() {
            addCriterion("opp_address is null");
            return (Criteria) this;
        }

        public Criteria andOppAddressIsNotNull() {
            addCriterion("opp_address is not null");
            return (Criteria) this;
        }

        public Criteria andOppAddressEqualTo(String value) {
            addCriterion("opp_address =", value, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressNotEqualTo(String value) {
            addCriterion("opp_address <>", value, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressGreaterThan(String value) {
            addCriterion("opp_address >", value, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressGreaterThanOrEqualTo(String value) {
            addCriterion("opp_address >=", value, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressLessThan(String value) {
            addCriterion("opp_address <", value, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressLessThanOrEqualTo(String value) {
            addCriterion("opp_address <=", value, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressLike(String value) {
            addCriterion("opp_address like", value, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressNotLike(String value) {
            addCriterion("opp_address not like", value, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressIn(List<String> values) {
            addCriterion("opp_address in", values, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressNotIn(List<String> values) {
            addCriterion("opp_address not in", values, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressBetween(String value1, String value2) {
            addCriterion("opp_address between", value1, value2, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppAddressNotBetween(String value1, String value2) {
            addCriterion("opp_address not between", value1, value2, "oppAddress");
            return (Criteria) this;
        }

        public Criteria andOppDateDescIsNull() {
            addCriterion("opp_date_desc is null");
            return (Criteria) this;
        }

        public Criteria andOppDateDescIsNotNull() {
            addCriterion("opp_date_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOppDateDescEqualTo(String value) {
            addCriterion("opp_date_desc =", value, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescNotEqualTo(String value) {
            addCriterion("opp_date_desc <>", value, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescGreaterThan(String value) {
            addCriterion("opp_date_desc >", value, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescGreaterThanOrEqualTo(String value) {
            addCriterion("opp_date_desc >=", value, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescLessThan(String value) {
            addCriterion("opp_date_desc <", value, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescLessThanOrEqualTo(String value) {
            addCriterion("opp_date_desc <=", value, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescLike(String value) {
            addCriterion("opp_date_desc like", value, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescNotLike(String value) {
            addCriterion("opp_date_desc not like", value, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescIn(List<String> values) {
            addCriterion("opp_date_desc in", values, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescNotIn(List<String> values) {
            addCriterion("opp_date_desc not in", values, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescBetween(String value1, String value2) {
            addCriterion("opp_date_desc between", value1, value2, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppDateDescNotBetween(String value1, String value2) {
            addCriterion("opp_date_desc not between", value1, value2, "oppDateDesc");
            return (Criteria) this;
        }

        public Criteria andOppSupportIsNull() {
            addCriterion("opp_support is null");
            return (Criteria) this;
        }

        public Criteria andOppSupportIsNotNull() {
            addCriterion("opp_support is not null");
            return (Criteria) this;
        }

        public Criteria andOppSupportEqualTo(String value) {
            addCriterion("opp_support =", value, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportNotEqualTo(String value) {
            addCriterion("opp_support <>", value, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportGreaterThan(String value) {
            addCriterion("opp_support >", value, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportGreaterThanOrEqualTo(String value) {
            addCriterion("opp_support >=", value, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportLessThan(String value) {
            addCriterion("opp_support <", value, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportLessThanOrEqualTo(String value) {
            addCriterion("opp_support <=", value, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportLike(String value) {
            addCriterion("opp_support like", value, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportNotLike(String value) {
            addCriterion("opp_support not like", value, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportIn(List<String> values) {
            addCriterion("opp_support in", values, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportNotIn(List<String> values) {
            addCriterion("opp_support not in", values, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportBetween(String value1, String value2) {
            addCriterion("opp_support between", value1, value2, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppSupportNotBetween(String value1, String value2) {
            addCriterion("opp_support not between", value1, value2, "oppSupport");
            return (Criteria) this;
        }

        public Criteria andOppObjectIsNull() {
            addCriterion("opp_object is null");
            return (Criteria) this;
        }

        public Criteria andOppObjectIsNotNull() {
            addCriterion("opp_object is not null");
            return (Criteria) this;
        }

        public Criteria andOppObjectEqualTo(String value) {
            addCriterion("opp_object =", value, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectNotEqualTo(String value) {
            addCriterion("opp_object <>", value, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectGreaterThan(String value) {
            addCriterion("opp_object >", value, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectGreaterThanOrEqualTo(String value) {
            addCriterion("opp_object >=", value, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectLessThan(String value) {
            addCriterion("opp_object <", value, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectLessThanOrEqualTo(String value) {
            addCriterion("opp_object <=", value, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectLike(String value) {
            addCriterion("opp_object like", value, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectNotLike(String value) {
            addCriterion("opp_object not like", value, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectIn(List<String> values) {
            addCriterion("opp_object in", values, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectNotIn(List<String> values) {
            addCriterion("opp_object not in", values, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectBetween(String value1, String value2) {
            addCriterion("opp_object between", value1, value2, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppObjectNotBetween(String value1, String value2) {
            addCriterion("opp_object not between", value1, value2, "oppObject");
            return (Criteria) this;
        }

        public Criteria andOppMemoIsNull() {
            addCriterion("opp_memo is null");
            return (Criteria) this;
        }

        public Criteria andOppMemoIsNotNull() {
            addCriterion("opp_memo is not null");
            return (Criteria) this;
        }

        public Criteria andOppMemoEqualTo(String value) {
            addCriterion("opp_memo =", value, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoNotEqualTo(String value) {
            addCriterion("opp_memo <>", value, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoGreaterThan(String value) {
            addCriterion("opp_memo >", value, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoGreaterThanOrEqualTo(String value) {
            addCriterion("opp_memo >=", value, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoLessThan(String value) {
            addCriterion("opp_memo <", value, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoLessThanOrEqualTo(String value) {
            addCriterion("opp_memo <=", value, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoLike(String value) {
            addCriterion("opp_memo like", value, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoNotLike(String value) {
            addCriterion("opp_memo not like", value, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoIn(List<String> values) {
            addCriterion("opp_memo in", values, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoNotIn(List<String> values) {
            addCriterion("opp_memo not in", values, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoBetween(String value1, String value2) {
            addCriterion("opp_memo between", value1, value2, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppMemoNotBetween(String value1, String value2) {
            addCriterion("opp_memo not between", value1, value2, "oppMemo");
            return (Criteria) this;
        }

        public Criteria andOppHourIsNull() {
            addCriterion("opp_hour is null");
            return (Criteria) this;
        }

        public Criteria andOppHourIsNotNull() {
            addCriterion("opp_hour is not null");
            return (Criteria) this;
        }

        public Criteria andOppHourEqualTo(Double value) {
            addCriterion("opp_hour =", value, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourNotEqualTo(Double value) {
            addCriterion("opp_hour <>", value, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourGreaterThan(Double value) {
            addCriterion("opp_hour >", value, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourGreaterThanOrEqualTo(Double value) {
            addCriterion("opp_hour >=", value, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourLessThan(Double value) {
            addCriterion("opp_hour <", value, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourLessThanOrEqualTo(Double value) {
            addCriterion("opp_hour <=", value, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourIn(List<Double> values) {
            addCriterion("opp_hour in", values, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourNotIn(List<Double> values) {
            addCriterion("opp_hour not in", values, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourBetween(Double value1, Double value2) {
            addCriterion("opp_hour between", value1, value2, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHourNotBetween(Double value1, Double value2) {
            addCriterion("opp_hour not between", value1, value2, "oppHour");
            return (Criteria) this;
        }

        public Criteria andOppHitsIsNull() {
            addCriterion("opp_hits is null");
            return (Criteria) this;
        }

        public Criteria andOppHitsIsNotNull() {
            addCriterion("opp_hits is not null");
            return (Criteria) this;
        }

        public Criteria andOppHitsEqualTo(Integer value) {
            addCriterion("opp_hits =", value, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsNotEqualTo(Integer value) {
            addCriterion("opp_hits <>", value, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsGreaterThan(Integer value) {
            addCriterion("opp_hits >", value, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_hits >=", value, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsLessThan(Integer value) {
            addCriterion("opp_hits <", value, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsLessThanOrEqualTo(Integer value) {
            addCriterion("opp_hits <=", value, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsIn(List<Integer> values) {
            addCriterion("opp_hits in", values, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsNotIn(List<Integer> values) {
            addCriterion("opp_hits not in", values, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsBetween(Integer value1, Integer value2) {
            addCriterion("opp_hits between", value1, value2, "oppHits");
            return (Criteria) this;
        }

        public Criteria andOppHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_hits not between", value1, value2, "oppHits");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOppMembersIsNull() {
            addCriterion("opp_members is null");
            return (Criteria) this;
        }

        public Criteria andOppMembersIsNotNull() {
            addCriterion("opp_members is not null");
            return (Criteria) this;
        }

        public Criteria andOppMembersEqualTo(Integer value) {
            addCriterion("opp_members =", value, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersNotEqualTo(Integer value) {
            addCriterion("opp_members <>", value, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersGreaterThan(Integer value) {
            addCriterion("opp_members >", value, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersGreaterThanOrEqualTo(Integer value) {
            addCriterion("opp_members >=", value, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersLessThan(Integer value) {
            addCriterion("opp_members <", value, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersLessThanOrEqualTo(Integer value) {
            addCriterion("opp_members <=", value, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersIn(List<Integer> values) {
            addCriterion("opp_members in", values, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersNotIn(List<Integer> values) {
            addCriterion("opp_members not in", values, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersBetween(Integer value1, Integer value2) {
            addCriterion("opp_members between", value1, value2, "oppMembers");
            return (Criteria) this;
        }

        public Criteria andOppMembersNotBetween(Integer value1, Integer value2) {
            addCriterion("opp_members not between", value1, value2, "oppMembers");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}