package org.zendesk.client.v2.model.hc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The access policy of a section defines who can view or manage the content of a section.
 */
public class AccessPolicy {
    /**
     * The set of users who can view content
     */
    @JsonProperty("viewable_by")
    private ViewableBy viewableBy;

    /**
     * The set of users who can manage content
     */
    @JsonProperty("manageable_by")
    private ManageableBy manageableBy;

    /**
     * The ids of the groups that have access
     */
    @JsonProperty("restricted_to_group_ids")
    private List<Long> restrictedToGroupIds;

    /**
     * The ids of the organizations that have access
     */
    @JsonProperty("restricted_to_organization_ids")
    private List<Long> restrictedToOrganizationIds;

    /**
     * The tags a user must have to have access
     */
    @JsonProperty("required_tags")
    private List<String> requiredTags;

    public ViewableBy getViewableBy() {
        return viewableBy;
    }

    public void setViewableBy(final ViewableBy viewableBy) {
        this.viewableBy = viewableBy;
    }

    public ManageableBy getManageableBy() {
        return manageableBy;
    }

    public void setManageableBy(final ManageableBy manageableBy) {
        this.manageableBy = manageableBy;
    }

    public List<Long> getRestrictedToGroupIds() {
        return restrictedToGroupIds;
    }

    public void setRestrictedToGroupIds(final List<Long> restrictedToGroupIds) {
        this.restrictedToGroupIds = restrictedToGroupIds;
    }

    public List<Long> getRestrictedToOrganizationIds() {
        return restrictedToOrganizationIds;
    }

    public void setRestrictedToOrganizationIds(final List<Long> restrictedToOrganizationIds) {
        this.restrictedToOrganizationIds = restrictedToOrganizationIds;
    }

    public List<String> getRequiredTags() {
        return requiredTags;
    }

    public void setRequiredTags(final List<String> requiredTags) {
        this.requiredTags = requiredTags;
    }

    @Override
    public String toString() {
        return "AccessPolicy{" +
                "viewableBy=" + viewableBy +
                ", manageableBy=" + manageableBy +
                ", restrictedToGroupIds=" + restrictedToGroupIds +
                ", restrictedToOrganizationIds=" + restrictedToOrganizationIds +
                ", requiredTags=" + requiredTags +
                '}';
    }

    public enum ViewableBy {
        EVERYBODY("everybody", "all users, signed in or not"),
        SIGNED_IN_USERS("signed_in_users", "only authenticated users"),
        STAFF("staff", "only agents and Help Center managers");

        private final String name;

        private final String description;

        ViewableBy(String name, String description) {
            this.name = name;
            this.description = description;
        }

        /**
         * Helper to resolve &lt;visibility-restriction-id&gt; values from exported Zendesk forums.xml.
         *
         * @param visibilityRestrictionid an id from the &lt;visibility-restriction-id&gt; element in exported Zendesk
         *                                forums.xml
         * @return am equivalent ViewableBy restriction based on the orginal id
         */
        public static ViewableBy resolveVisibilityRestrictionId(int visibilityRestrictionid) {
            switch (visibilityRestrictionid) {
                case 1:
                    return EVERYBODY;
                case 2:
                    return SIGNED_IN_USERS;
                case 3:
                default:
                    return STAFF; // guess the most restrictive access
            }
        }

        @Override
        public String toString() {
            return name;
        }

    }

    public enum ManageableBy {
        STAFF("staff", "agents and managers"),
        MANAGERS("managers", "only Help Center managers");

        private final String name;

        private final String description;

        ManageableBy(String name, String description) {
            this.name = name;
            this.description = description;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
