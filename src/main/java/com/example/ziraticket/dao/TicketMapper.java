package com.example.ziraticket.dao;

import com.example.ziraticket.entity.Ticket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketMapper {
  Ticket getTicketById(String id);

  Ticket getTicketByTicketName(@Param("projectId") String projectId, @Param("number") String ticketNumber);

  List<Ticket> getPagedTickets(@Param("pageSize") int pageSize,@Param("start") int start, @Param("projectId") String projectId);

  List<Ticket> getSubTicket(String id);

  int getTicketCount(String projectId);

  int addTicket(Ticket ticket);

  int updateTicket(Ticket ticket);

  int deleteTicket(String id);
}
