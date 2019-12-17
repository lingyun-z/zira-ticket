package com.example.ziraticket.service;

import com.example.ziraticket.entity.Ticket;
import com.example.ziraticket.entity.dto.PageCount;

import java.util.List;

public interface TicketService {
  Ticket getTicketById(String id);

  Ticket getTicketByTicketName(String projectId, String ticketNumber);

  List<Ticket> getPagedTickets(int pageSize, int pageNum, String projectId);

  PageCount getTicketCount(String projectId);

  List<Ticket> getSubTicket(String id);

  Ticket addTicket(Ticket ticket);

  Ticket updateTicket(Ticket ticket);

  int deleteTicket(String id);
}
