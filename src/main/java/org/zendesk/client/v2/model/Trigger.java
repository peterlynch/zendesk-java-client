package org.zendesk.client.v2.model;

import java.util.Date;
import java.util.List;

/**
 * https://developer.zendesk.com/rest_api/docs/core/triggers
 *
 * @author adavidson
 */
public class Trigger {
    private Long id;
    private String title;
    private boolean active;
    private int position;
    private Conditions conditions;
    private List<Action> actions;
    private Date createdAt;
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Trigger");
        sb.append("{id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", active=").append(active);
        sb.append(", position=").append(position);
        sb.append(", active=").append(active);
        sb.append(", conditions=").append(conditions);
        sb.append(", actions=").append(actions);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append('}');
        return sb.toString();
    }

}
