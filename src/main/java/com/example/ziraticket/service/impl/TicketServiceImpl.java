package com.example.ziraticket.service.impl;

import com.example.ziraticket.dao.TicketMapper;
import com.example.ziraticket.entity.dto.PageCount;
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
  public Ticket getTicketByTicketName(String projectId, String ticketNumber) {
    return ticketMapper.getTicketByTicketName(projectId, ticketNumber);
  }

  @Override
  public List<Ticket> getPagedTickets(int pageSize, int start, String projectId) {
    logger.info("getPagedTickets pageSize: {} start: {} projectId: {}", pageSize, start, projectId);
    return ticketMapper.getPagedTickets(pageSize, start, projectId);
  }

  @Override
  public PageCount getTicketCount(String projectId) {
    logger.info("getTicketCount projectId: {}", projectId);
    var count = ticketMapper.getTicketCount(projectId);
    return new PageCount(count);
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
