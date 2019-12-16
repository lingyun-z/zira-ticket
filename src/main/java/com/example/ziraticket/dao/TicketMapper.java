package com.example.ziraticket.dao;

import com.example.ziraticket.entity.Ticket;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketMapper {
  Ticket getTicketById(String id);

  List<Ticket> getPagedTickets(@Param("pageSize") int pageSize,@Param("start") int start, @Param("projectId") String projectId);

  List<Ticket> getSubTicket(String id);

  int getTicketTotalPage(String projectId);

  int addTicket(Ticket ticket);

  int updateTicket(Ticket ticket);

  int deleteTicket(String id);
}
