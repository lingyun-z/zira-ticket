package com.example.ziraticket.controller;

import com.example.ziraticket.entity.Ticket;
import com.example.ziraticket.service.TicketService;
import com.example.ziraticket.entity.dto.PageCount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
  private final Logger logger = LoggerFactory.getLogger(TicketController.class);

  @Autowired
  private TicketService ticketService;

<<<<<<< Updated upstream
  @GetMapping
  public ResponseEntity<List<Ticket>> getPagedTicket(int pageSize, int pageNum, String projectId) {
=======
  @GetMapping("/project/{projectName}")
  public ResponseEntity<List<Ticket>> getPagedTicket(@PathVariable("projectName") String projectName, int pageSize, int pageNum) {
>>>>>>> Stashed changes
    List<Ticket> result;
    try {
      pageSize = pageSize > 0 ? pageSize : 20;
      pageNum = pageNum > 0 ? pageNum : 1;
      var start = (pageNum - 1) * pageSize;
      result = ticketService.getPagedTickets(pageSize, start, projectId);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Ticket> addTicket(@RequestBody Ticket ticket) {
    Ticket result;
    try {
      result = ticketService.addTicket(ticket);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Ticket> getTicketById(@PathVariable("id") String id) {
    Ticket result;
    try {
      result = ticketService.getTicketById(id);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping("/{projectId}/{ticketNumber}")
  public ResponseEntity<Ticket> getTicketByTicketName(@PathVariable("projectId") String projectId, @PathVariable("ticketNumber") String ticketNumber) {
    Ticket result;
    try {
      result = ticketService.getTicketByTicketName(projectId, ticketNumber);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Ticket> updateTicket(@PathVariable("id") String id, @RequestBody Ticket ticket) {
    Ticket result;
    try {
      ticket.setId(id);
      result = ticketService.updateTicket(ticket);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @GetMapping("/count/{projectId}")
  public ResponseEntity<PageCount> getTicketCount(@PathVariable("projectId") String projectId) {
    PageCount count;
    try {
      count = ticketService.getTicketCount(projectId);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(count, HttpStatus.OK);
  }

  @GetMapping("/subticket/{id}")
  public ResponseEntity<List<Ticket>> getSubTicket(@PathVariable("id") String id) {
    List<Ticket> result;
    try {
      result = ticketService.getSubTicket(id);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
