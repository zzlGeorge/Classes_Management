package com.lzGeorge.app.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentInfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andScodeIsNull() {
            addCriterion("scode is null");
            return (Criteria) this;
        }

        public Criteria andScodeIsNotNull() {
            addCriterion("scode is not null");
            return (Criteria) this;
        }

        public Criteria andScodeEqualTo(String value) {
            addCriterion("scode =", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotEqualTo(String value) {
            addCriterion("scode <>", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeGreaterThan(String value) {
            addCriterion("scode >", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeGreaterThanOrEqualTo(String value) {
            addCriterion("scode >=", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLessThan(String value) {
            addCriterion("scode <", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLessThanOrEqualTo(String value) {
            addCriterion("scode <=", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeLike(String value) {
            addCriterion("scode like", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotLike(String value) {
            addCriterion("scode not like", value, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeIn(List<String> values) {
            addCriterion("scode in", values, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotIn(List<String> values) {
            addCriterion("scode not in", values, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeBetween(String value1, String value2) {
            addCriterion("scode between", value1, value2, "scode");
            return (Criteria) this;
        }

        public Criteria andScodeNotBetween(String value1, String value2) {
            addCriterion("scode not between", value1, value2, "scode");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("ssex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("ssex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnpIsNull() {
            addCriterion("snp is null");
            return (Criteria) this;
        }

        public Criteria andSnpIsNotNull() {
            addCriterion("snp is not null");
            return (Criteria) this;
        }

        public Criteria andSnpEqualTo(String value) {
            addCriterion("snp =", value, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpNotEqualTo(String value) {
            addCriterion("snp <>", value, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpGreaterThan(String value) {
            addCriterion("snp >", value, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpGreaterThanOrEqualTo(String value) {
            addCriterion("snp >=", value, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpLessThan(String value) {
            addCriterion("snp <", value, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpLessThanOrEqualTo(String value) {
            addCriterion("snp <=", value, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpLike(String value) {
            addCriterion("snp like", value, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpNotLike(String value) {
            addCriterion("snp not like", value, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpIn(List<String> values) {
            addCriterion("snp in", values, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpNotIn(List<String> values) {
            addCriterion("snp not in", values, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpBetween(String value1, String value2) {
            addCriterion("snp between", value1, value2, "snp");
            return (Criteria) this;
        }

        public Criteria andSnpNotBetween(String value1, String value2) {
            addCriterion("snp not between", value1, value2, "snp");
            return (Criteria) this;
        }

        public Criteria andTellIsNull() {
            addCriterion("tell is null");
            return (Criteria) this;
        }

        public Criteria andTellIsNotNull() {
            addCriterion("tell is not null");
            return (Criteria) this;
        }

        public Criteria andTellEqualTo(String value) {
            addCriterion("tell =", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotEqualTo(String value) {
            addCriterion("tell <>", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellGreaterThan(String value) {
            addCriterion("tell >", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellGreaterThanOrEqualTo(String value) {
            addCriterion("tell >=", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLessThan(String value) {
            addCriterion("tell <", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLessThanOrEqualTo(String value) {
            addCriterion("tell <=", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellLike(String value) {
            addCriterion("tell like", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotLike(String value) {
            addCriterion("tell not like", value, "tell");
            return (Criteria) this;
        }

        public Criteria andTellIn(List<String> values) {
            addCriterion("tell in", values, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotIn(List<String> values) {
            addCriterion("tell not in", values, "tell");
            return (Criteria) this;
        }

        public Criteria andTellBetween(String value1, String value2) {
            addCriterion("tell between", value1, value2, "tell");
            return (Criteria) this;
        }

        public Criteria andTellNotBetween(String value1, String value2) {
            addCriterion("tell not between", value1, value2, "tell");
            return (Criteria) this;
        }

        public Criteria andTelsIsNull() {
            addCriterion("tels is null");
            return (Criteria) this;
        }

        public Criteria andTelsIsNotNull() {
            addCriterion("tels is not null");
            return (Criteria) this;
        }

        public Criteria andTelsEqualTo(String value) {
            addCriterion("tels =", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsNotEqualTo(String value) {
            addCriterion("tels <>", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsGreaterThan(String value) {
            addCriterion("tels >", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsGreaterThanOrEqualTo(String value) {
            addCriterion("tels >=", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsLessThan(String value) {
            addCriterion("tels <", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsLessThanOrEqualTo(String value) {
            addCriterion("tels <=", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsLike(String value) {
            addCriterion("tels like", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsNotLike(String value) {
            addCriterion("tels not like", value, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsIn(List<String> values) {
            addCriterion("tels in", values, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsNotIn(List<String> values) {
            addCriterion("tels not in", values, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsBetween(String value1, String value2) {
            addCriterion("tels between", value1, value2, "tels");
            return (Criteria) this;
        }

        public Criteria andTelsNotBetween(String value1, String value2) {
            addCriterion("tels not between", value1, value2, "tels");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andSlivingIsNull() {
            addCriterion("sliving is null");
            return (Criteria) this;
        }

        public Criteria andSlivingIsNotNull() {
            addCriterion("sliving is not null");
            return (Criteria) this;
        }

        public Criteria andSlivingEqualTo(String value) {
            addCriterion("sliving =", value, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingNotEqualTo(String value) {
            addCriterion("sliving <>", value, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingGreaterThan(String value) {
            addCriterion("sliving >", value, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingGreaterThanOrEqualTo(String value) {
            addCriterion("sliving >=", value, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingLessThan(String value) {
            addCriterion("sliving <", value, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingLessThanOrEqualTo(String value) {
            addCriterion("sliving <=", value, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingLike(String value) {
            addCriterion("sliving like", value, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingNotLike(String value) {
            addCriterion("sliving not like", value, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingIn(List<String> values) {
            addCriterion("sliving in", values, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingNotIn(List<String> values) {
            addCriterion("sliving not in", values, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingBetween(String value1, String value2) {
            addCriterion("sliving between", value1, value2, "sliving");
            return (Criteria) this;
        }

        public Criteria andSlivingNotBetween(String value1, String value2) {
            addCriterion("sliving not between", value1, value2, "sliving");
            return (Criteria) this;
        }

        public Criteria andSliveIsNull() {
            addCriterion("slive is null");
            return (Criteria) this;
        }

        public Criteria andSliveIsNotNull() {
            addCriterion("slive is not null");
            return (Criteria) this;
        }

        public Criteria andSliveEqualTo(String value) {
            addCriterion("slive =", value, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveNotEqualTo(String value) {
            addCriterion("slive <>", value, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveGreaterThan(String value) {
            addCriterion("slive >", value, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveGreaterThanOrEqualTo(String value) {
            addCriterion("slive >=", value, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveLessThan(String value) {
            addCriterion("slive <", value, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveLessThanOrEqualTo(String value) {
            addCriterion("slive <=", value, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveLike(String value) {
            addCriterion("slive like", value, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveNotLike(String value) {
            addCriterion("slive not like", value, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveIn(List<String> values) {
            addCriterion("slive in", values, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveNotIn(List<String> values) {
            addCriterion("slive not in", values, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveBetween(String value1, String value2) {
            addCriterion("slive between", value1, value2, "slive");
            return (Criteria) this;
        }

        public Criteria andSliveNotBetween(String value1, String value2) {
            addCriterion("slive not between", value1, value2, "slive");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNull() {
            addCriterion("youbian is null");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNotNull() {
            addCriterion("youbian is not null");
            return (Criteria) this;
        }

        public Criteria andYoubianEqualTo(String value) {
            addCriterion("youbian =", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotEqualTo(String value) {
            addCriterion("youbian <>", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThan(String value) {
            addCriterion("youbian >", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThanOrEqualTo(String value) {
            addCriterion("youbian >=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThan(String value) {
            addCriterion("youbian <", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThanOrEqualTo(String value) {
            addCriterion("youbian <=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLike(String value) {
            addCriterion("youbian like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotLike(String value) {
            addCriterion("youbian not like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianIn(List<String> values) {
            addCriterion("youbian in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotIn(List<String> values) {
            addCriterion("youbian not in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianBetween(String value1, String value2) {
            addCriterion("youbian between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotBetween(String value1, String value2) {
            addCriterion("youbian not between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andHtellIsNull() {
            addCriterion("htell is null");
            return (Criteria) this;
        }

        public Criteria andHtellIsNotNull() {
            addCriterion("htell is not null");
            return (Criteria) this;
        }

        public Criteria andHtellEqualTo(String value) {
            addCriterion("htell =", value, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellNotEqualTo(String value) {
            addCriterion("htell <>", value, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellGreaterThan(String value) {
            addCriterion("htell >", value, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellGreaterThanOrEqualTo(String value) {
            addCriterion("htell >=", value, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellLessThan(String value) {
            addCriterion("htell <", value, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellLessThanOrEqualTo(String value) {
            addCriterion("htell <=", value, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellLike(String value) {
            addCriterion("htell like", value, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellNotLike(String value) {
            addCriterion("htell not like", value, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellIn(List<String> values) {
            addCriterion("htell in", values, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellNotIn(List<String> values) {
            addCriterion("htell not in", values, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellBetween(String value1, String value2) {
            addCriterion("htell between", value1, value2, "htell");
            return (Criteria) this;
        }

        public Criteria andHtellNotBetween(String value1, String value2) {
            addCriterion("htell not between", value1, value2, "htell");
            return (Criteria) this;
        }

        public Criteria andSfathernameIsNull() {
            addCriterion("sfathername is null");
            return (Criteria) this;
        }

        public Criteria andSfathernameIsNotNull() {
            addCriterion("sfathername is not null");
            return (Criteria) this;
        }

        public Criteria andSfathernameEqualTo(String value) {
            addCriterion("sfathername =", value, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameNotEqualTo(String value) {
            addCriterion("sfathername <>", value, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameGreaterThan(String value) {
            addCriterion("sfathername >", value, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameGreaterThanOrEqualTo(String value) {
            addCriterion("sfathername >=", value, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameLessThan(String value) {
            addCriterion("sfathername <", value, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameLessThanOrEqualTo(String value) {
            addCriterion("sfathername <=", value, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameLike(String value) {
            addCriterion("sfathername like", value, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameNotLike(String value) {
            addCriterion("sfathername not like", value, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameIn(List<String> values) {
            addCriterion("sfathername in", values, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameNotIn(List<String> values) {
            addCriterion("sfathername not in", values, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameBetween(String value1, String value2) {
            addCriterion("sfathername between", value1, value2, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSfathernameNotBetween(String value1, String value2) {
            addCriterion("sfathername not between", value1, value2, "sfathername");
            return (Criteria) this;
        }

        public Criteria andSftellIsNull() {
            addCriterion("sftell is null");
            return (Criteria) this;
        }

        public Criteria andSftellIsNotNull() {
            addCriterion("sftell is not null");
            return (Criteria) this;
        }

        public Criteria andSftellEqualTo(String value) {
            addCriterion("sftell =", value, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellNotEqualTo(String value) {
            addCriterion("sftell <>", value, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellGreaterThan(String value) {
            addCriterion("sftell >", value, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellGreaterThanOrEqualTo(String value) {
            addCriterion("sftell >=", value, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellLessThan(String value) {
            addCriterion("sftell <", value, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellLessThanOrEqualTo(String value) {
            addCriterion("sftell <=", value, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellLike(String value) {
            addCriterion("sftell like", value, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellNotLike(String value) {
            addCriterion("sftell not like", value, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellIn(List<String> values) {
            addCriterion("sftell in", values, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellNotIn(List<String> values) {
            addCriterion("sftell not in", values, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellBetween(String value1, String value2) {
            addCriterion("sftell between", value1, value2, "sftell");
            return (Criteria) this;
        }

        public Criteria andSftellNotBetween(String value1, String value2) {
            addCriterion("sftell not between", value1, value2, "sftell");
            return (Criteria) this;
        }

        public Criteria andSmothernameIsNull() {
            addCriterion("smothername is null");
            return (Criteria) this;
        }

        public Criteria andSmothernameIsNotNull() {
            addCriterion("smothername is not null");
            return (Criteria) this;
        }

        public Criteria andSmothernameEqualTo(String value) {
            addCriterion("smothername =", value, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameNotEqualTo(String value) {
            addCriterion("smothername <>", value, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameGreaterThan(String value) {
            addCriterion("smothername >", value, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameGreaterThanOrEqualTo(String value) {
            addCriterion("smothername >=", value, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameLessThan(String value) {
            addCriterion("smothername <", value, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameLessThanOrEqualTo(String value) {
            addCriterion("smothername <=", value, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameLike(String value) {
            addCriterion("smothername like", value, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameNotLike(String value) {
            addCriterion("smothername not like", value, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameIn(List<String> values) {
            addCriterion("smothername in", values, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameNotIn(List<String> values) {
            addCriterion("smothername not in", values, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameBetween(String value1, String value2) {
            addCriterion("smothername between", value1, value2, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmothernameNotBetween(String value1, String value2) {
            addCriterion("smothername not between", value1, value2, "smothername");
            return (Criteria) this;
        }

        public Criteria andSmtellIsNull() {
            addCriterion("smtell is null");
            return (Criteria) this;
        }

        public Criteria andSmtellIsNotNull() {
            addCriterion("smtell is not null");
            return (Criteria) this;
        }

        public Criteria andSmtellEqualTo(String value) {
            addCriterion("smtell =", value, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellNotEqualTo(String value) {
            addCriterion("smtell <>", value, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellGreaterThan(String value) {
            addCriterion("smtell >", value, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellGreaterThanOrEqualTo(String value) {
            addCriterion("smtell >=", value, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellLessThan(String value) {
            addCriterion("smtell <", value, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellLessThanOrEqualTo(String value) {
            addCriterion("smtell <=", value, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellLike(String value) {
            addCriterion("smtell like", value, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellNotLike(String value) {
            addCriterion("smtell not like", value, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellIn(List<String> values) {
            addCriterion("smtell in", values, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellNotIn(List<String> values) {
            addCriterion("smtell not in", values, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellBetween(String value1, String value2) {
            addCriterion("smtell between", value1, value2, "smtell");
            return (Criteria) this;
        }

        public Criteria andSmtellNotBetween(String value1, String value2) {
            addCriterion("smtell not between", value1, value2, "smtell");
            return (Criteria) this;
        }

        public Criteria andClassesLikeInsensitive(String value) {
            addCriterion("upper(classes) like", value.toUpperCase(), "classes");
            return (Criteria) this;
        }

        public Criteria andSnameLikeInsensitive(String value) {
            addCriterion("upper(sname) like", value.toUpperCase(), "sname");
            return (Criteria) this;
        }

        public Criteria andScodeLikeInsensitive(String value) {
            addCriterion("upper(scode) like", value.toUpperCase(), "scode");
            return (Criteria) this;
        }

        public Criteria andSsexLikeInsensitive(String value) {
            addCriterion("upper(ssex) like", value.toUpperCase(), "ssex");
            return (Criteria) this;
        }

        public Criteria andSnLikeInsensitive(String value) {
            addCriterion("upper(sn) like", value.toUpperCase(), "sn");
            return (Criteria) this;
        }

        public Criteria andSnpLikeInsensitive(String value) {
            addCriterion("upper(snp) like", value.toUpperCase(), "snp");
            return (Criteria) this;
        }

        public Criteria andTellLikeInsensitive(String value) {
            addCriterion("upper(tell) like", value.toUpperCase(), "tell");
            return (Criteria) this;
        }

        public Criteria andTelsLikeInsensitive(String value) {
            addCriterion("upper(tels) like", value.toUpperCase(), "tels");
            return (Criteria) this;
        }

        public Criteria andQqLikeInsensitive(String value) {
            addCriterion("upper(qq) like", value.toUpperCase(), "qq");
            return (Criteria) this;
        }

        public Criteria andSlivingLikeInsensitive(String value) {
            addCriterion("upper(sliving) like", value.toUpperCase(), "sliving");
            return (Criteria) this;
        }

        public Criteria andSliveLikeInsensitive(String value) {
            addCriterion("upper(slive) like", value.toUpperCase(), "slive");
            return (Criteria) this;
        }

        public Criteria andYoubianLikeInsensitive(String value) {
            addCriterion("upper(youbian) like", value.toUpperCase(), "youbian");
            return (Criteria) this;
        }

        public Criteria andHtellLikeInsensitive(String value) {
            addCriterion("upper(htell) like", value.toUpperCase(), "htell");
            return (Criteria) this;
        }

        public Criteria andSfathernameLikeInsensitive(String value) {
            addCriterion("upper(sfathername) like", value.toUpperCase(), "sfathername");
            return (Criteria) this;
        }

        public Criteria andSftellLikeInsensitive(String value) {
            addCriterion("upper(sftell) like", value.toUpperCase(), "sftell");
            return (Criteria) this;
        }

        public Criteria andSmothernameLikeInsensitive(String value) {
            addCriterion("upper(smothername) like", value.toUpperCase(), "smothername");
            return (Criteria) this;
        }

        public Criteria andSmtellLikeInsensitive(String value) {
            addCriterion("upper(smtell) like", value.toUpperCase(), "smtell");
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