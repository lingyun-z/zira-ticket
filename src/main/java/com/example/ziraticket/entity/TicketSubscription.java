package com.example.ziraticket.entity;

public class TicketSubscription {
  private String ticketId;
  private String userId;

  public TicketSubscription() {
  }

  public TicketSubscription(String ticketId, String userId) {
    this.ticketId = ticketId;
    this.userId = userId;
  }

  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
