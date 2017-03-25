package job.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class PmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsedmemIsNull() {
            addCriterion("usedmem is null");
            return (Criteria) this;
        }

        public Criteria andUsedmemIsNotNull() {
            addCriterion("usedmem is not null");
            return (Criteria) this;
        }

        public Criteria andUsedmemEqualTo(Integer value) {
            addCriterion("usedmem =", value, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemNotEqualTo(Integer value) {
            addCriterion("usedmem <>", value, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemGreaterThan(Integer value) {
            addCriterion("usedmem >", value, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemGreaterThanOrEqualTo(Integer value) {
            addCriterion("usedmem >=", value, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemLessThan(Integer value) {
            addCriterion("usedmem <", value, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemLessThanOrEqualTo(Integer value) {
            addCriterion("usedmem <=", value, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemIn(List<Integer> values) {
            addCriterion("usedmem in", values, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemNotIn(List<Integer> values) {
            addCriterion("usedmem not in", values, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemBetween(Integer value1, Integer value2) {
            addCriterion("usedmem between", value1, value2, "usedmem");
            return (Criteria) this;
        }

        public Criteria andUsedmemNotBetween(Integer value1, Integer value2) {
            addCriterion("usedmem not between", value1, value2, "usedmem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememIsNull() {
            addCriterion("avaliablemem is null");
            return (Criteria) this;
        }

        public Criteria andAvaliablememIsNotNull() {
            addCriterion("avaliablemem is not null");
            return (Criteria) this;
        }

        public Criteria andAvaliablememEqualTo(Integer value) {
            addCriterion("avaliablemem =", value, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememNotEqualTo(Integer value) {
            addCriterion("avaliablemem <>", value, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememGreaterThan(Integer value) {
            addCriterion("avaliablemem >", value, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememGreaterThanOrEqualTo(Integer value) {
            addCriterion("avaliablemem >=", value, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememLessThan(Integer value) {
            addCriterion("avaliablemem <", value, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememLessThanOrEqualTo(Integer value) {
            addCriterion("avaliablemem <=", value, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememIn(List<Integer> values) {
            addCriterion("avaliablemem in", values, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememNotIn(List<Integer> values) {
            addCriterion("avaliablemem not in", values, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememBetween(Integer value1, Integer value2) {
            addCriterion("avaliablemem between", value1, value2, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andAvaliablememNotBetween(Integer value1, Integer value2) {
            addCriterion("avaliablemem not between", value1, value2, "avaliablemem");
            return (Criteria) this;
        }

        public Criteria andUseddiskIsNull() {
            addCriterion("useddisk is null");
            return (Criteria) this;
        }

        public Criteria andUseddiskIsNotNull() {
            addCriterion("useddisk is not null");
            return (Criteria) this;
        }

        public Criteria andUseddiskEqualTo(Integer value) {
            addCriterion("useddisk =", value, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskNotEqualTo(Integer value) {
            addCriterion("useddisk <>", value, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskGreaterThan(Integer value) {
            addCriterion("useddisk >", value, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskGreaterThanOrEqualTo(Integer value) {
            addCriterion("useddisk >=", value, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskLessThan(Integer value) {
            addCriterion("useddisk <", value, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskLessThanOrEqualTo(Integer value) {
            addCriterion("useddisk <=", value, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskIn(List<Integer> values) {
            addCriterion("useddisk in", values, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskNotIn(List<Integer> values) {
            addCriterion("useddisk not in", values, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskBetween(Integer value1, Integer value2) {
            addCriterion("useddisk between", value1, value2, "useddisk");
            return (Criteria) this;
        }

        public Criteria andUseddiskNotBetween(Integer value1, Integer value2) {
            addCriterion("useddisk not between", value1, value2, "useddisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskIsNull() {
            addCriterion("avaliabledisk is null");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskIsNotNull() {
            addCriterion("avaliabledisk is not null");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskEqualTo(Integer value) {
            addCriterion("avaliabledisk =", value, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskNotEqualTo(Integer value) {
            addCriterion("avaliabledisk <>", value, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskGreaterThan(Integer value) {
            addCriterion("avaliabledisk >", value, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskGreaterThanOrEqualTo(Integer value) {
            addCriterion("avaliabledisk >=", value, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskLessThan(Integer value) {
            addCriterion("avaliabledisk <", value, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskLessThanOrEqualTo(Integer value) {
            addCriterion("avaliabledisk <=", value, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskIn(List<Integer> values) {
            addCriterion("avaliabledisk in", values, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskNotIn(List<Integer> values) {
            addCriterion("avaliabledisk not in", values, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskBetween(Integer value1, Integer value2) {
            addCriterion("avaliabledisk between", value1, value2, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andAvaliablediskNotBetween(Integer value1, Integer value2) {
            addCriterion("avaliabledisk not between", value1, value2, "avaliabledisk");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(Integer value) {
            addCriterion("numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(Integer value) {
            addCriterion("numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(Integer value) {
            addCriterion("numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(Integer value) {
            addCriterion("numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<Integer> values) {
            addCriterion("numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<Integer> values) {
            addCriterion("numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(Integer value1, Integer value2) {
            addCriterion("numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("numbers not between", value1, value2, "numbers");
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