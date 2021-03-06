package com.Jiubai.pojo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andOrgParentIdIsNull() {
            addCriterion("org_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIsNotNull() {
            addCriterion("org_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdEqualTo(Integer value) {
            addCriterion("org_parent_id =", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotEqualTo(Integer value) {
            addCriterion("org_parent_id <>", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdGreaterThan(Integer value) {
            addCriterion("org_parent_id >", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_parent_id >=", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLessThan(Integer value) {
            addCriterion("org_parent_id <", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_parent_id <=", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIn(List<Integer> values) {
            addCriterion("org_parent_id in", values, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotIn(List<Integer> values) {
            addCriterion("org_parent_id not in", values, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdBetween(Integer value1, Integer value2) {
            addCriterion("org_parent_id between", value1, value2, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_parent_id not between", value1, value2, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitIsNull() {
            addCriterion("org_manager_unit is null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitIsNotNull() {
            addCriterion("org_manager_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitEqualTo(String value) {
            addCriterion("org_manager_unit =", value, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitNotEqualTo(String value) {
            addCriterion("org_manager_unit <>", value, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitGreaterThan(String value) {
            addCriterion("org_manager_unit >", value, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitGreaterThanOrEqualTo(String value) {
            addCriterion("org_manager_unit >=", value, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitLessThan(String value) {
            addCriterion("org_manager_unit <", value, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitLessThanOrEqualTo(String value) {
            addCriterion("org_manager_unit <=", value, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitLike(String value) {
            addCriterion("org_manager_unit like", value, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitNotLike(String value) {
            addCriterion("org_manager_unit not like", value, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitIn(List<String> values) {
            addCriterion("org_manager_unit in", values, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitNotIn(List<String> values) {
            addCriterion("org_manager_unit not in", values, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitBetween(String value1, String value2) {
            addCriterion("org_manager_unit between", value1, value2, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUnitNotBetween(String value1, String value2) {
            addCriterion("org_manager_unit not between", value1, value2, "orgManagerUnit");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateIsNull() {
            addCriterion("org_build_date is null");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateIsNotNull() {
            addCriterion("org_build_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateEqualTo(Date value) {
            addCriterion("org_build_date =", value, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateNotEqualTo(Date value) {
            addCriterion("org_build_date <>", value, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateGreaterThan(Date value) {
            addCriterion("org_build_date >", value, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateGreaterThanOrEqualTo(Date value) {
            addCriterion("org_build_date >=", value, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateLessThan(Date value) {
            addCriterion("org_build_date <", value, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateLessThanOrEqualTo(Date value) {
            addCriterion("org_build_date <=", value, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateIn(List<Date> values) {
            addCriterion("org_build_date in", values, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateNotIn(List<Date> values) {
            addCriterion("org_build_date not in", values, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateBetween(Date value1, Date value2) {
            addCriterion("org_build_date between", value1, value2, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgBuildDateNotBetween(Date value1, Date value2) {
            addCriterion("org_build_date not between", value1, value2, "orgBuildDate");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIsNull() {
            addCriterion("org_province is null");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIsNotNull() {
            addCriterion("org_province is not null");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceEqualTo(Integer value) {
            addCriterion("org_province =", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotEqualTo(Integer value) {
            addCriterion("org_province <>", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceGreaterThan(Integer value) {
            addCriterion("org_province >", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_province >=", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceLessThan(Integer value) {
            addCriterion("org_province <", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("org_province <=", value, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceIn(List<Integer> values) {
            addCriterion("org_province in", values, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotIn(List<Integer> values) {
            addCriterion("org_province not in", values, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceBetween(Integer value1, Integer value2) {
            addCriterion("org_province between", value1, value2, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("org_province not between", value1, value2, "orgProvince");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictIsNull() {
            addCriterion("org_district is null");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictIsNotNull() {
            addCriterion("org_district is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictEqualTo(Integer value) {
            addCriterion("org_district =", value, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictNotEqualTo(Integer value) {
            addCriterion("org_district <>", value, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictGreaterThan(Integer value) {
            addCriterion("org_district >", value, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_district >=", value, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictLessThan(Integer value) {
            addCriterion("org_district <", value, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("org_district <=", value, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictIn(List<Integer> values) {
            addCriterion("org_district in", values, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictNotIn(List<Integer> values) {
            addCriterion("org_district not in", values, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictBetween(Integer value1, Integer value2) {
            addCriterion("org_district between", value1, value2, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("org_district not between", value1, value2, "orgDistrict");
            return (Criteria) this;
        }

        public Criteria andOrgStreetIsNull() {
            addCriterion("org_street is null");
            return (Criteria) this;
        }

        public Criteria andOrgStreetIsNotNull() {
            addCriterion("org_street is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStreetEqualTo(Integer value) {
            addCriterion("org_street =", value, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetNotEqualTo(Integer value) {
            addCriterion("org_street <>", value, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetGreaterThan(Integer value) {
            addCriterion("org_street >", value, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_street >=", value, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetLessThan(Integer value) {
            addCriterion("org_street <", value, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetLessThanOrEqualTo(Integer value) {
            addCriterion("org_street <=", value, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetIn(List<Integer> values) {
            addCriterion("org_street in", values, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetNotIn(List<Integer> values) {
            addCriterion("org_street not in", values, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetBetween(Integer value1, Integer value2) {
            addCriterion("org_street between", value1, value2, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgStreetNotBetween(Integer value1, Integer value2) {
            addCriterion("org_street not between", value1, value2, "orgStreet");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeIsNull() {
            addCriterion("org_committee is null");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeIsNotNull() {
            addCriterion("org_committee is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeEqualTo(Integer value) {
            addCriterion("org_committee =", value, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeNotEqualTo(Integer value) {
            addCriterion("org_committee <>", value, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeGreaterThan(Integer value) {
            addCriterion("org_committee >", value, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_committee >=", value, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeLessThan(Integer value) {
            addCriterion("org_committee <", value, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeLessThanOrEqualTo(Integer value) {
            addCriterion("org_committee <=", value, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeIn(List<Integer> values) {
            addCriterion("org_committee in", values, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeNotIn(List<Integer> values) {
            addCriterion("org_committee not in", values, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeBetween(Integer value1, Integer value2) {
            addCriterion("org_committee between", value1, value2, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgCommitteeNotBetween(Integer value1, Integer value2) {
            addCriterion("org_committee not between", value1, value2, "orgCommittee");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNull() {
            addCriterion("org_address is null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNotNull() {
            addCriterion("org_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressEqualTo(String value) {
            addCriterion("org_address =", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotEqualTo(String value) {
            addCriterion("org_address <>", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThan(String value) {
            addCriterion("org_address >", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("org_address >=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThan(String value) {
            addCriterion("org_address <", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThanOrEqualTo(String value) {
            addCriterion("org_address <=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLike(String value) {
            addCriterion("org_address like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotLike(String value) {
            addCriterion("org_address not like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIn(List<String> values) {
            addCriterion("org_address in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotIn(List<String> values) {
            addCriterion("org_address not in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressBetween(String value1, String value2) {
            addCriterion("org_address between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotBetween(String value1, String value2) {
            addCriterion("org_address not between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgHourIsNull() {
            addCriterion("org_hour is null");
            return (Criteria) this;
        }

        public Criteria andOrgHourIsNotNull() {
            addCriterion("org_hour is not null");
            return (Criteria) this;
        }

        public Criteria andOrgHourEqualTo(Double value) {
            addCriterion("org_hour =", value, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourNotEqualTo(Double value) {
            addCriterion("org_hour <>", value, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourGreaterThan(Double value) {
            addCriterion("org_hour >", value, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourGreaterThanOrEqualTo(Double value) {
            addCriterion("org_hour >=", value, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourLessThan(Double value) {
            addCriterion("org_hour <", value, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourLessThanOrEqualTo(Double value) {
            addCriterion("org_hour <=", value, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourIn(List<Double> values) {
            addCriterion("org_hour in", values, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourNotIn(List<Double> values) {
            addCriterion("org_hour not in", values, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourBetween(Double value1, Double value2) {
            addCriterion("org_hour between", value1, value2, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgHourNotBetween(Double value1, Double value2) {
            addCriterion("org_hour not between", value1, value2, "orgHour");
            return (Criteria) this;
        }

        public Criteria andOrgMemberIsNull() {
            addCriterion("org_member is null");
            return (Criteria) this;
        }

        public Criteria andOrgMemberIsNotNull() {
            addCriterion("org_member is not null");
            return (Criteria) this;
        }

        public Criteria andOrgMemberEqualTo(Integer value) {
            addCriterion("org_member =", value, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberNotEqualTo(Integer value) {
            addCriterion("org_member <>", value, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberGreaterThan(Integer value) {
            addCriterion("org_member >", value, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_member >=", value, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberLessThan(Integer value) {
            addCriterion("org_member <", value, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberLessThanOrEqualTo(Integer value) {
            addCriterion("org_member <=", value, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberIn(List<Integer> values) {
            addCriterion("org_member in", values, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberNotIn(List<Integer> values) {
            addCriterion("org_member not in", values, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberBetween(Integer value1, Integer value2) {
            addCriterion("org_member between", value1, value2, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("org_member not between", value1, value2, "orgMember");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceIsNull() {
            addCriterion("org_introduce is null");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceIsNotNull() {
            addCriterion("org_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceEqualTo(String value) {
            addCriterion("org_introduce =", value, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceNotEqualTo(String value) {
            addCriterion("org_introduce <>", value, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceGreaterThan(String value) {
            addCriterion("org_introduce >", value, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("org_introduce >=", value, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceLessThan(String value) {
            addCriterion("org_introduce <", value, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceLessThanOrEqualTo(String value) {
            addCriterion("org_introduce <=", value, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceLike(String value) {
            addCriterion("org_introduce like", value, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceNotLike(String value) {
            addCriterion("org_introduce not like", value, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceIn(List<String> values) {
            addCriterion("org_introduce in", values, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceNotIn(List<String> values) {
            addCriterion("org_introduce not in", values, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceBetween(String value1, String value2) {
            addCriterion("org_introduce between", value1, value2, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andOrgIntroduceNotBetween(String value1, String value2) {
            addCriterion("org_introduce not between", value1, value2, "orgIntroduce");
            return (Criteria) this;
        }

        public Criteria andManageDistrictIsNull() {
            addCriterion("manage_district is null");
            return (Criteria) this;
        }

        public Criteria andManageDistrictIsNotNull() {
            addCriterion("manage_district is not null");
            return (Criteria) this;
        }

        public Criteria andManageDistrictEqualTo(Integer value) {
            addCriterion("manage_district =", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictNotEqualTo(Integer value) {
            addCriterion("manage_district <>", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictGreaterThan(Integer value) {
            addCriterion("manage_district >", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("manage_district >=", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictLessThan(Integer value) {
            addCriterion("manage_district <", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("manage_district <=", value, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictIn(List<Integer> values) {
            addCriterion("manage_district in", values, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictNotIn(List<Integer> values) {
            addCriterion("manage_district not in", values, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictBetween(Integer value1, Integer value2) {
            addCriterion("manage_district between", value1, value2, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("manage_district not between", value1, value2, "manageDistrict");
            return (Criteria) this;
        }

        public Criteria andManageUniversityIsNull() {
            addCriterion("manage_university is null");
            return (Criteria) this;
        }

        public Criteria andManageUniversityIsNotNull() {
            addCriterion("manage_university is not null");
            return (Criteria) this;
        }

        public Criteria andManageUniversityEqualTo(Integer value) {
            addCriterion("manage_university =", value, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityNotEqualTo(Integer value) {
            addCriterion("manage_university <>", value, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityGreaterThan(Integer value) {
            addCriterion("manage_university >", value, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityGreaterThanOrEqualTo(Integer value) {
            addCriterion("manage_university >=", value, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityLessThan(Integer value) {
            addCriterion("manage_university <", value, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityLessThanOrEqualTo(Integer value) {
            addCriterion("manage_university <=", value, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityIn(List<Integer> values) {
            addCriterion("manage_university in", values, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityNotIn(List<Integer> values) {
            addCriterion("manage_university not in", values, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityBetween(Integer value1, Integer value2) {
            addCriterion("manage_university between", value1, value2, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andManageUniversityNotBetween(Integer value1, Integer value2) {
            addCriterion("manage_university not between", value1, value2, "manageUniversity");
            return (Criteria) this;
        }

        public Criteria andOrgMembersIsNull() {
            addCriterion("org_members is null");
            return (Criteria) this;
        }

        public Criteria andOrgMembersIsNotNull() {
            addCriterion("org_members is not null");
            return (Criteria) this;
        }

        public Criteria andOrgMembersEqualTo(Integer value) {
            addCriterion("org_members =", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersNotEqualTo(Integer value) {
            addCriterion("org_members <>", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersGreaterThan(Integer value) {
            addCriterion("org_members >", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_members >=", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersLessThan(Integer value) {
            addCriterion("org_members <", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersLessThanOrEqualTo(Integer value) {
            addCriterion("org_members <=", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersIn(List<Integer> values) {
            addCriterion("org_members in", values, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersNotIn(List<Integer> values) {
            addCriterion("org_members not in", values, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersBetween(Integer value1, Integer value2) {
            addCriterion("org_members between", value1, value2, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersNotBetween(Integer value1, Integer value2) {
            addCriterion("org_members not between", value1, value2, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgHitsIsNull() {
            addCriterion("org_hits is null");
            return (Criteria) this;
        }

        public Criteria andOrgHitsIsNotNull() {
            addCriterion("org_hits is not null");
            return (Criteria) this;
        }

        public Criteria andOrgHitsEqualTo(Integer value) {
            addCriterion("org_hits =", value, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsNotEqualTo(Integer value) {
            addCriterion("org_hits <>", value, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsGreaterThan(Integer value) {
            addCriterion("org_hits >", value, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_hits >=", value, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsLessThan(Integer value) {
            addCriterion("org_hits <", value, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsLessThanOrEqualTo(Integer value) {
            addCriterion("org_hits <=", value, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsIn(List<Integer> values) {
            addCriterion("org_hits in", values, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsNotIn(List<Integer> values) {
            addCriterion("org_hits not in", values, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsBetween(Integer value1, Integer value2) {
            addCriterion("org_hits between", value1, value2, "orgHits");
            return (Criteria) this;
        }

        public Criteria andOrgHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("org_hits not between", value1, value2, "orgHits");
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