package org.zendesk.client.v2.model;

public enum SortOrder
{
  ASCENDING("asc"),
  DESCENDING("desc");

  private final String name;

  SortOrder(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
