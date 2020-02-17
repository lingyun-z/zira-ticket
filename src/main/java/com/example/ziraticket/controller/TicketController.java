package com.example.ziraticket.controller;

import com.example.ziraticket.entity.Ticket;
import com.example.ziraticket.service.TicketService;
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

  @GetMapping("/project/{projectName}")
  public ResponseEntity<List<Ticket>> getPagedTicket(@PathVariable("projectName") String projectName, int pageSize, int pageNum) {
    List<Ticket> result;
    try {
      pageSize = pageSize > 0 ? pageSize : 20;
      pageNum = pageNum > 0 ? pageNum : 1;
      var start = (pageNum - 1) * pageSize;
      result = ticketService.getPagedTickets(pageSize, start, projectName);
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

  @GetMapping("/{projectName}/{ticketNumber}")
  public ResponseEntity<Ticket> getTicketByTicketName(@PathVariable("projectName") String projectName, @PathVariable("ticketNumber") String ticketNumber) {
    Ticket result;
    try {
      result = ticketService.getTicketByTicketName(projectName, ticketNumber);
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

  @GetMapping("/count/{projectName}")
  public ResponseEntity<Integer> getTicketCount(@PathVariable("projectName") String projectName) {
    Integer count;
    try {
      count = ticketService.getTicketCount(projectName);
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

  @DeleteMapping("/{id}")
  public ResponseEntity<Integer> deleteTicketById(@PathVariable("id") String id) {
    Integer result;
    try {
      result = ticketService.deleteTicket(id);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
