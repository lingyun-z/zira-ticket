package com.example.ziraticket.service.impl;

import com.example.ziraticket.dao.TicketMapper;
import com.example.ziraticket.entity.Ticket;
import com.example.ziraticket.service.TicketService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class TicketServiceImpl implements TicketService {
  private final Logger logger = LoggerFactory.getLogger(TicketService.class);

  @Autowired
  private TicketMapper ticketMapper;

  @Override
  public Ticket getTicketById(String id) {
    logger.info("getTicketById id: {}", id);
    return ticketMapper.getTicketById(id);
  }

  @Override
  public Ticket getTicketByTicketName(String projectName, String ticketNumber) {
    return ticketMapper.getTicketByTicketName(projectName, ticketNumber);
  }

  @Override
  public List<Ticket> getPagedTickets(int pageSize, int start, String projectName) {
    logger.info("getPagedTickets pageSize: {} start: {} projectName: {}", pageSize, start, projectName);
    return ticketMapper.getPagedTickets(pageSize, start, projectName);
  }

  @Override
  public Integer getTicketCount(String projectName) {
    logger.info("getTicketCount projectName: {}", projectName);
    return ticketMapper.getTicketCount(projectName);
  }

  @Override
  public List<Ticket> getSubTicket(String id) {
    logger.info("getSubTicket id: {}", id);
    return ticketMapper.getSubTicket(id);
  }

  @Override
  @Transactional
  public Ticket addTicket(Ticket ticket) {
    logger.info("addTicket ticket: {}", ticket);
    ticketMapper.addTicket(ticket);
    return ticketMapper.getTicketById(ticket.getId());
  }

  @Override
  @Transactional
  public Ticket updateTicket(Ticket ticket) {
    logger.info("updateTicket ticket: {}", ticket);
    var preTicket = ticketMapper.getTicketById(ticket.getId());

    if (ticketMapper.updateTicket(ticket) == 1) {
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
