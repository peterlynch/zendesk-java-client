package org.zendesk.client.v2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Conditions are common to {@link Trigger}s, {@link Automation}s, views and SLA Policies.
 */
public class Conditions {
    private List<Condition> all = new ArrayList<Condition>();

    private List<Condition> any = new ArrayList<Condition>();

    public List<Condition> getAll() {
        return all;
    }

    public void setAll(List<Condition> all) {
        this.all = all;
    }

    public List<Condition> getAny() {
        return any;
    }

    public void setAny(List<Condition> any) {
        this.any = any;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Conditions");
        sb.append("{all=").append(all);
        sb.append(", any=").append(any);
        sb.append('}');
        return sb.toString();
    }

    /**
     * A condition checks field values for truth.
     */
    public static class Condition {
        private String field;

        private String operator;

        private String value;

        public Condition() {
        }

        public Condition(String field, String operator, String value) {
            this.field = field;
            this.operator = operator;
            this.value = value;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Condition");
            sb.append("{field=").append(field);
            sb.append(", operator=").append(operator);
            sb.append(", value=").append(value);
            sb.append('}');
            return sb.toString();
        }

    }
}
