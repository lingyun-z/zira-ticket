package com.example.ziraticket.service;

import com.example.ziraticket.entity.Ticket;

import java.util.List;

public interface TicketService {
  Ticket getTicketById(String id);

  List<Ticket> getPagedTickets(int pageSize, int pageNum, String projectId);

  List<Ticket> getSubTicket(String id);

  Ticket addTicket(Ticket ticket);

  Ticket updateTicket(Ticket ticket);

  int deleteTicket(String id);
}
