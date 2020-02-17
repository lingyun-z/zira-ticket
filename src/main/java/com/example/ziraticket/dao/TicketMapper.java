package com.example.ziraticket.dao;

import com.example.ziraticket.entity.Ticket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketMapper {
  Ticket getTicketById(String id);

  Ticket getTicketByTicketName(@Param("projectName") String projectName, @Param("number") String ticketNumber);

  List<Ticket> getPagedTickets(@Param("pageSize") int pageSize,@Param("start") int start, @Param("projectName") String projectName);

  List<Ticket> getSubTicket(String id);

  int getTicketCount(String projectName);

  int addTicket(Ticket ticket);

  int updateTicket(Ticket ticket);

  int deleteTicket(String id);
}
