package com.example.ziraticket.entity.dto;

import com.example.ziraticket.entity.Ticket;

import java.util.List;

public class PagedTicket {
  private int pageCount;
  private List<Ticket> tickets;

  public PagedTicket() {
  }

  public PagedTicket(int pageCount, List<Ticket> tickets) {
    this.pageCount = pageCount;
    this.tickets = tickets;
  }

  public int getPageCount() {
    return pageCount;
  }

  public void setPageCount(int pageCount) {
    this.pageCount = pageCount;
  }

  public List<Ticket> getTickets() {
    return tickets;
  }

  public void setTickets(List<Ticket> tickets) {
    this.tickets = tickets;
  }
}
