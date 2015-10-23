package org.zendesk.client.v2.model.hc;

public enum ArticleSortBy
{
  POSITION("position"),
  TITLE("title"),
  CREATED_AT("created_at"),
  UPDATED_AT("updated_at");

  private final String name;

  ArticleSortBy(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
