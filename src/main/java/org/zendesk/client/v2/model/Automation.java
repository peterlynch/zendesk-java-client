package org.zendesk.client.v2.model;

import java.util.Date;
import java.util.List;

/**
 * <a href="https://developer.zendesk.com/rest_api/docs/core/automations">Automation</a>s consist of one or more actions
 * that are performed if certain conditions are met after a period of time.
 *
 * @since FIXME
 */
public class Automation {
    private Long id;
    private String title;
    private boolean active;
    private Integer position;
    private Date createdAt;
    private Date updatedAt;
    private Conditions conditions;
    private List<Action> actions;

    /**
     * Get the unique id of the automation automatically assigned when created.
     *
     * @return the unique id of the the automation
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the unique id of the automation used when performing an operation on an existing automation.
     *
     * @param id the id to set
     */
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Automation{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", active=").append(active);
        sb.append(", position=").append(position);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", conditions=").append(conditions);
        sb.append(", actions=").append(actions);
        sb.append('}');
        return sb.toString();
    }
}
