package com.example.ziraticket.entity.dto;

public class TicketName {
  private int number;
  private String projectId;

  public TicketName() {
  }

  public TicketName(int number, String projectId) {
    this.number = number;
    this.projectId = projectId;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @Override
  public String toString() {
    return "TicketName{" +
            "number=" + number +
            ", projectId='" + projectId + '\'' +
            '}';
  }
}
