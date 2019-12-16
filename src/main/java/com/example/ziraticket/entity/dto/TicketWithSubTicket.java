package com.example.ziraticket.entity.dto;

import com.example.ziraticket.entity.Ticket;

public class TicketWithSubTicket {
  private Ticket ticket;
  private Ticket subTicket;

  public TicketWithSubTicket() {
  }

  public TicketWithSubTicket(Ticket ticket, Ticket subTicket) {
    this.ticket = ticket;
    this.subTicket = subTicket;
  }

  public Ticket getTicket() {
    return ticket;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  public Ticket getSubTicket() {
    return subTicket;
  }

  public void setSubTicket(Ticket subTicket) {
    this.subTicket = subTicket;
  }
}
