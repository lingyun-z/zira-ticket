package com.example.ziraticket.service.impl;

import com.example.ziraticket.dao.TicketMapper;
import com.example.ziraticket.entity.Ticket;
import com.example.ziraticket.entity.dto.PagedTicket;
import com.example.ziraticket.service.TicketService;
import com.example.ziraticket.service.TicketSubscriptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketServiceImpl implements TicketService {
  private final Logger logger = LoggerFactory.getLogger(TicketService.class);

  @Autowired
  private TicketMapper ticketMapper;

  @Autowired
  private TicketSubscriptionService subscriptionService;

  @Override
  public Ticket getTicketById(String id) {
    return ticketMapper.getTicketById(id);
  }

  @Override
  public List<Ticket> getPagedTickets(int pageSize, int start, String projectId) {
    logger.info("getPagedTickets pageSize: {} start: {} projectId: {}", pageSize, start, projectId);
    return ticketMapper.getPagedTickets(pageSize, start, projectId);
  }

  @Override
  public List<Ticket> getSubTicket(String id) {
    logger.info("getSubTicket id: {}", id);
    return ticketMapper.getSubTicket(id);
  }

  @Override
  public Ticket addTicket(Ticket ticket) {
    logger.info("addTicket ticket: {}", ticket);
    ticketMapper.addTicket(ticket);
    subscriptionService.subscribe(ticket.getId(), ticket.getCreatedBy());
    return ticket;
  }

  @Override
  public Ticket updateTicket(Ticket ticket) {
    logger.info("updateTicket ticket: {}", ticket);
    if (ticketMapper.updateTicket(ticket) == 1) {
//      TODO: get user from token

//      subscriptionService.subscribe(ticket.getId(), "ZLY");
      return ticketMapper.getTicketById(ticket.getId());
    }
    return null;
  }

  @Override
  public int deleteTicket(String id) {
    logger.info("deleteTicket id: {}", id);
    return ticketMapper.deleteTicket(id);
  }
}
