package com.Jiubai.pojo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActiveVolunteerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiveVolunteerExample() {
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

        public Criteria andVolIdIsNull() {
            addCriterion("vol_id is null");
            return (Criteria) this;
        }

        public Criteria andVolIdIsNotNull() {
            addCriterion("vol_id is not null");
            return (Criteria) this;
        }

        public Criteria andVolIdEqualTo(Integer value) {
            addCriterion("vol_id =", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdNotEqualTo(Integer value) {
            addCriterion("vol_id <>", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdGreaterThan(Integer value) {
            addCriterion("vol_id >", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_id >=", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdLessThan(Integer value) {
            addCriterion("vol_id <", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdLessThanOrEqualTo(Integer value) {
            addCriterion("vol_id <=", value, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdIn(List<Integer> values) {
            addCriterion("vol_id in", values, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdNotIn(List<Integer> values) {
            addCriterion("vol_id not in", values, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdBetween(Integer value1, Integer value2) {
            addCriterion("vol_id between", value1, value2, "volId");
            return (Criteria) this;
        }

        public Criteria andVolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_id not between", value1, value2, "volId");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusIsNull() {
            addCriterion("vol_cert_status is null");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusIsNotNull() {
            addCriterion("vol_cert_status is not null");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusEqualTo(Integer value) {
            addCriterion("vol_cert_status =", value, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusNotEqualTo(Integer value) {
            addCriterion("vol_cert_status <>", value, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusGreaterThan(Integer value) {
            addCriterion("vol_cert_status >", value, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_cert_status >=", value, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusLessThan(Integer value) {
            addCriterion("vol_cert_status <", value, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusLessThanOrEqualTo(Integer value) {
            addCriterion("vol_cert_status <=", value, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusIn(List<Integer> values) {
            addCriterion("vol_cert_status in", values, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusNotIn(List<Integer> values) {
            addCriterion("vol_cert_status not in", values, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusBetween(Integer value1, Integer value2) {
            addCriterion("vol_cert_status between", value1, value2, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolCertStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_cert_status not between", value1, value2, "volCertStatus");
            return (Criteria) this;
        }

        public Criteria andVolProvinceIsNull() {
            addCriterion("vol_province is null");
            return (Criteria) this;
        }

        public Criteria andVolProvinceIsNotNull() {
            addCriterion("vol_province is not null");
            return (Criteria) this;
        }

        public Criteria andVolProvinceEqualTo(Integer value) {
            addCriterion("vol_province =", value, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceNotEqualTo(Integer value) {
            addCriterion("vol_province <>", value, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceGreaterThan(Integer value) {
            addCriterion("vol_province >", value, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_province >=", value, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceLessThan(Integer value) {
            addCriterion("vol_province <", value, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("vol_province <=", value, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceIn(List<Integer> values) {
            addCriterion("vol_province in", values, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceNotIn(List<Integer> values) {
            addCriterion("vol_province not in", values, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceBetween(Integer value1, Integer value2) {
            addCriterion("vol_province between", value1, value2, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_province not between", value1, value2, "volProvince");
            return (Criteria) this;
        }

        public Criteria andVolDistrictIsNull() {
            addCriterion("vol_district is null");
            return (Criteria) this;
        }

        public Criteria andVolDistrictIsNotNull() {
            addCriterion("vol_district is not null");
            return (Criteria) this;
        }

        public Criteria andVolDistrictEqualTo(Integer value) {
            addCriterion("vol_district =", value, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictNotEqualTo(Integer value) {
            addCriterion("vol_district <>", value, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictGreaterThan(Integer value) {
            addCriterion("vol_district >", value, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_district >=", value, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictLessThan(Integer value) {
            addCriterion("vol_district <", value, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("vol_district <=", value, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictIn(List<Integer> values) {
            addCriterion("vol_district in", values, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictNotIn(List<Integer> values) {
            addCriterion("vol_district not in", values, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictBetween(Integer value1, Integer value2) {
            addCriterion("vol_district between", value1, value2, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_district not between", value1, value2, "volDistrict");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeIsNull() {
            addCriterion("vol_committee is null");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeIsNotNull() {
            addCriterion("vol_committee is not null");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeEqualTo(Integer value) {
            addCriterion("vol_committee =", value, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeNotEqualTo(Integer value) {
            addCriterion("vol_committee <>", value, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeGreaterThan(Integer value) {
            addCriterion("vol_committee >", value, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_committee >=", value, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeLessThan(Integer value) {
            addCriterion("vol_committee <", value, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeLessThanOrEqualTo(Integer value) {
            addCriterion("vol_committee <=", value, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeIn(List<Integer> values) {
            addCriterion("vol_committee in", values, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeNotIn(List<Integer> values) {
            addCriterion("vol_committee not in", values, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeBetween(Integer value1, Integer value2) {
            addCriterion("vol_committee between", value1, value2, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andVolCommitteeNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_committee not between", value1, value2, "volCommittee");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPassIsNull() {
            addCriterion("login_pass is null");
            return (Criteria) this;
        }

        public Criteria andLoginPassIsNotNull() {
            addCriterion("login_pass is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPassEqualTo(String value) {
            addCriterion("login_pass =", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotEqualTo(String value) {
            addCriterion("login_pass <>", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassGreaterThan(String value) {
            addCriterion("login_pass >", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassGreaterThanOrEqualTo(String value) {
            addCriterion("login_pass >=", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLessThan(String value) {
            addCriterion("login_pass <", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLessThanOrEqualTo(String value) {
            addCriterion("login_pass <=", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassLike(String value) {
            addCriterion("login_pass like", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotLike(String value) {
            addCriterion("login_pass not like", value, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassIn(List<String> values) {
            addCriterion("login_pass in", values, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotIn(List<String> values) {
            addCriterion("login_pass not in", values, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassBetween(String value1, String value2) {
            addCriterion("login_pass between", value1, value2, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginPassNotBetween(String value1, String value2) {
            addCriterion("login_pass not between", value1, value2, "loginPass");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNull() {
            addCriterion("login_status is null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNotNull() {
            addCriterion("login_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusEqualTo(Integer value) {
            addCriterion("login_status =", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotEqualTo(Integer value) {
            addCriterion("login_status <>", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThan(Integer value) {
            addCriterion("login_status >", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_status >=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThan(Integer value) {
            addCriterion("login_status <", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThanOrEqualTo(Integer value) {
            addCriterion("login_status <=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIn(List<Integer> values) {
            addCriterion("login_status in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotIn(List<Integer> values) {
            addCriterion("login_status not in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusBetween(Integer value1, Integer value2) {
            addCriterion("login_status between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("login_status not between", value1, value2, "loginStatus");
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

        public Criteria andVolNumberIsNull() {
            addCriterion("vol_number is null");
            return (Criteria) this;
        }

        public Criteria andVolNumberIsNotNull() {
            addCriterion("vol_number is not null");
            return (Criteria) this;
        }

        public Criteria andVolNumberEqualTo(Integer value) {
            addCriterion("vol_number =", value, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberNotEqualTo(Integer value) {
            addCriterion("vol_number <>", value, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberGreaterThan(Integer value) {
            addCriterion("vol_number >", value, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_number >=", value, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberLessThan(Integer value) {
            addCriterion("vol_number <", value, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberLessThanOrEqualTo(Integer value) {
            addCriterion("vol_number <=", value, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberIn(List<Integer> values) {
            addCriterion("vol_number in", values, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberNotIn(List<Integer> values) {
            addCriterion("vol_number not in", values, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberBetween(Integer value1, Integer value2) {
            addCriterion("vol_number between", value1, value2, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_number not between", value1, value2, "volNumber");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameIsNull() {
            addCriterion("vol_true_name is null");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameIsNotNull() {
            addCriterion("vol_true_name is not null");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameEqualTo(String value) {
            addCriterion("vol_true_name =", value, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameNotEqualTo(String value) {
            addCriterion("vol_true_name <>", value, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameGreaterThan(String value) {
            addCriterion("vol_true_name >", value, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("vol_true_name >=", value, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameLessThan(String value) {
            addCriterion("vol_true_name <", value, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameLessThanOrEqualTo(String value) {
            addCriterion("vol_true_name <=", value, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameLike(String value) {
            addCriterion("vol_true_name like", value, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameNotLike(String value) {
            addCriterion("vol_true_name not like", value, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameIn(List<String> values) {
            addCriterion("vol_true_name in", values, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameNotIn(List<String> values) {
            addCriterion("vol_true_name not in", values, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameBetween(String value1, String value2) {
            addCriterion("vol_true_name between", value1, value2, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolTrueNameNotBetween(String value1, String value2) {
            addCriterion("vol_true_name not between", value1, value2, "volTrueName");
            return (Criteria) this;
        }

        public Criteria andVolGenderIsNull() {
            addCriterion("vol_gender is null");
            return (Criteria) this;
        }

        public Criteria andVolGenderIsNotNull() {
            addCriterion("vol_gender is not null");
            return (Criteria) this;
        }

        public Criteria andVolGenderEqualTo(Integer value) {
            addCriterion("vol_gender =", value, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderNotEqualTo(Integer value) {
            addCriterion("vol_gender <>", value, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderGreaterThan(Integer value) {
            addCriterion("vol_gender >", value, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_gender >=", value, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderLessThan(Integer value) {
            addCriterion("vol_gender <", value, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderLessThanOrEqualTo(Integer value) {
            addCriterion("vol_gender <=", value, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderIn(List<Integer> values) {
            addCriterion("vol_gender in", values, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderNotIn(List<Integer> values) {
            addCriterion("vol_gender not in", values, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderBetween(Integer value1, Integer value2) {
            addCriterion("vol_gender between", value1, value2, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_gender not between", value1, value2, "volGender");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateIsNull() {
            addCriterion("vol_birth_date is null");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateIsNotNull() {
            addCriterion("vol_birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateEqualTo(Date value) {
            addCriterion("vol_birth_date =", value, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateNotEqualTo(Date value) {
            addCriterion("vol_birth_date <>", value, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateGreaterThan(Date value) {
            addCriterion("vol_birth_date >", value, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("vol_birth_date >=", value, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateLessThan(Date value) {
            addCriterion("vol_birth_date <", value, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("vol_birth_date <=", value, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateIn(List<Date> values) {
            addCriterion("vol_birth_date in", values, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateNotIn(List<Date> values) {
            addCriterion("vol_birth_date not in", values, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateBetween(Date value1, Date value2) {
            addCriterion("vol_birth_date between", value1, value2, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("vol_birth_date not between", value1, value2, "volBirthDate");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityIsNull() {
            addCriterion("vol_ethnicity is null");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityIsNotNull() {
            addCriterion("vol_ethnicity is not null");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityEqualTo(Integer value) {
            addCriterion("vol_ethnicity =", value, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityNotEqualTo(Integer value) {
            addCriterion("vol_ethnicity <>", value, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityGreaterThan(Integer value) {
            addCriterion("vol_ethnicity >", value, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_ethnicity >=", value, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityLessThan(Integer value) {
            addCriterion("vol_ethnicity <", value, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityLessThanOrEqualTo(Integer value) {
            addCriterion("vol_ethnicity <=", value, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityIn(List<Integer> values) {
            addCriterion("vol_ethnicity in", values, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityNotIn(List<Integer> values) {
            addCriterion("vol_ethnicity not in", values, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityBetween(Integer value1, Integer value2) {
            addCriterion("vol_ethnicity between", value1, value2, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolEthnicityNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_ethnicity not between", value1, value2, "volEthnicity");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagIsNull() {
            addCriterion("vol_student_flag is null");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagIsNotNull() {
            addCriterion("vol_student_flag is not null");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagEqualTo(Integer value) {
            addCriterion("vol_student_flag =", value, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagNotEqualTo(Integer value) {
            addCriterion("vol_student_flag <>", value, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagGreaterThan(Integer value) {
            addCriterion("vol_student_flag >", value, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_student_flag >=", value, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagLessThan(Integer value) {
            addCriterion("vol_student_flag <", value, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagLessThanOrEqualTo(Integer value) {
            addCriterion("vol_student_flag <=", value, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagIn(List<Integer> values) {
            addCriterion("vol_student_flag in", values, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagNotIn(List<Integer> values) {
            addCriterion("vol_student_flag not in", values, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagBetween(Integer value1, Integer value2) {
            addCriterion("vol_student_flag between", value1, value2, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolStudentFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_student_flag not between", value1, value2, "volStudentFlag");
            return (Criteria) this;
        }

        public Criteria andVolUniversityIsNull() {
            addCriterion("vol_university is null");
            return (Criteria) this;
        }

        public Criteria andVolUniversityIsNotNull() {
            addCriterion("vol_university is not null");
            return (Criteria) this;
        }

        public Criteria andVolUniversityEqualTo(Integer value) {
            addCriterion("vol_university =", value, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityNotEqualTo(Integer value) {
            addCriterion("vol_university <>", value, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityGreaterThan(Integer value) {
            addCriterion("vol_university >", value, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_university >=", value, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityLessThan(Integer value) {
            addCriterion("vol_university <", value, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityLessThanOrEqualTo(Integer value) {
            addCriterion("vol_university <=", value, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityIn(List<Integer> values) {
            addCriterion("vol_university in", values, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityNotIn(List<Integer> values) {
            addCriterion("vol_university not in", values, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityBetween(Integer value1, Integer value2) {
            addCriterion("vol_university between", value1, value2, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolUniversityNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_university not between", value1, value2, "volUniversity");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeIsNull() {
            addCriterion("vol_edu_degree is null");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeIsNotNull() {
            addCriterion("vol_edu_degree is not null");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeEqualTo(Integer value) {
            addCriterion("vol_edu_degree =", value, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeNotEqualTo(Integer value) {
            addCriterion("vol_edu_degree <>", value, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeGreaterThan(Integer value) {
            addCriterion("vol_edu_degree >", value, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_edu_degree >=", value, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeLessThan(Integer value) {
            addCriterion("vol_edu_degree <", value, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("vol_edu_degree <=", value, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeIn(List<Integer> values) {
            addCriterion("vol_edu_degree in", values, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeNotIn(List<Integer> values) {
            addCriterion("vol_edu_degree not in", values, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeBetween(Integer value1, Integer value2) {
            addCriterion("vol_edu_degree between", value1, value2, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolEduDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_edu_degree not between", value1, value2, "volEduDegree");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalIsNull() {
            addCriterion("vol_political is null");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalIsNotNull() {
            addCriterion("vol_political is not null");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalEqualTo(Integer value) {
            addCriterion("vol_political =", value, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalNotEqualTo(Integer value) {
            addCriterion("vol_political <>", value, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalGreaterThan(Integer value) {
            addCriterion("vol_political >", value, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_political >=", value, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalLessThan(Integer value) {
            addCriterion("vol_political <", value, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalLessThanOrEqualTo(Integer value) {
            addCriterion("vol_political <=", value, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalIn(List<Integer> values) {
            addCriterion("vol_political in", values, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalNotIn(List<Integer> values) {
            addCriterion("vol_political not in", values, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalBetween(Integer value1, Integer value2) {
            addCriterion("vol_political between", value1, value2, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolPoliticalNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_political not between", value1, value2, "volPolitical");
            return (Criteria) this;
        }

        public Criteria andVolHourIsNull() {
            addCriterion("vol_hour is null");
            return (Criteria) this;
        }

        public Criteria andVolHourIsNotNull() {
            addCriterion("vol_hour is not null");
            return (Criteria) this;
        }

        public Criteria andVolHourEqualTo(Double value) {
            addCriterion("vol_hour =", value, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourNotEqualTo(Double value) {
            addCriterion("vol_hour <>", value, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourGreaterThan(Double value) {
            addCriterion("vol_hour >", value, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourGreaterThanOrEqualTo(Double value) {
            addCriterion("vol_hour >=", value, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourLessThan(Double value) {
            addCriterion("vol_hour <", value, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourLessThanOrEqualTo(Double value) {
            addCriterion("vol_hour <=", value, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourIn(List<Double> values) {
            addCriterion("vol_hour in", values, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourNotIn(List<Double> values) {
            addCriterion("vol_hour not in", values, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourBetween(Double value1, Double value2) {
            addCriterion("vol_hour between", value1, value2, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolHourNotBetween(Double value1, Double value2) {
            addCriterion("vol_hour not between", value1, value2, "volHour");
            return (Criteria) this;
        }

        public Criteria andVolSkillIsNull() {
            addCriterion("vol_skill is null");
            return (Criteria) this;
        }

        public Criteria andVolSkillIsNotNull() {
            addCriterion("vol_skill is not null");
            return (Criteria) this;
        }

        public Criteria andVolSkillEqualTo(String value) {
            addCriterion("vol_skill =", value, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillNotEqualTo(String value) {
            addCriterion("vol_skill <>", value, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillGreaterThan(String value) {
            addCriterion("vol_skill >", value, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillGreaterThanOrEqualTo(String value) {
            addCriterion("vol_skill >=", value, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillLessThan(String value) {
            addCriterion("vol_skill <", value, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillLessThanOrEqualTo(String value) {
            addCriterion("vol_skill <=", value, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillLike(String value) {
            addCriterion("vol_skill like", value, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillNotLike(String value) {
            addCriterion("vol_skill not like", value, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillIn(List<String> values) {
            addCriterion("vol_skill in", values, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillNotIn(List<String> values) {
            addCriterion("vol_skill not in", values, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillBetween(String value1, String value2) {
            addCriterion("vol_skill between", value1, value2, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolSkillNotBetween(String value1, String value2) {
            addCriterion("vol_skill not between", value1, value2, "volSkill");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagIsNull() {
            addCriterion("vol_service_tag is null");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagIsNotNull() {
            addCriterion("vol_service_tag is not null");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagEqualTo(String value) {
            addCriterion("vol_service_tag =", value, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagNotEqualTo(String value) {
            addCriterion("vol_service_tag <>", value, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagGreaterThan(String value) {
            addCriterion("vol_service_tag >", value, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagGreaterThanOrEqualTo(String value) {
            addCriterion("vol_service_tag >=", value, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagLessThan(String value) {
            addCriterion("vol_service_tag <", value, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagLessThanOrEqualTo(String value) {
            addCriterion("vol_service_tag <=", value, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagLike(String value) {
            addCriterion("vol_service_tag like", value, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagNotLike(String value) {
            addCriterion("vol_service_tag not like", value, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagIn(List<String> values) {
            addCriterion("vol_service_tag in", values, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagNotIn(List<String> values) {
            addCriterion("vol_service_tag not in", values, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagBetween(String value1, String value2) {
            addCriterion("vol_service_tag between", value1, value2, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolServiceTagNotBetween(String value1, String value2) {
            addCriterion("vol_service_tag not between", value1, value2, "volServiceTag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagIsNull() {
            addCriterion("vol_active_flag is null");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagIsNotNull() {
            addCriterion("vol_active_flag is not null");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagEqualTo(Integer value) {
            addCriterion("vol_active_flag =", value, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagNotEqualTo(Integer value) {
            addCriterion("vol_active_flag <>", value, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagGreaterThan(Integer value) {
            addCriterion("vol_active_flag >", value, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("vol_active_flag >=", value, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagLessThan(Integer value) {
            addCriterion("vol_active_flag <", value, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagLessThanOrEqualTo(Integer value) {
            addCriterion("vol_active_flag <=", value, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagIn(List<Integer> values) {
            addCriterion("vol_active_flag in", values, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagNotIn(List<Integer> values) {
            addCriterion("vol_active_flag not in", values, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagBetween(Integer value1, Integer value2) {
            addCriterion("vol_active_flag between", value1, value2, "volActiveFlag");
            return (Criteria) this;
        }

        public Criteria andVolActiveFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("vol_active_flag not between", value1, value2, "volActiveFlag");
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