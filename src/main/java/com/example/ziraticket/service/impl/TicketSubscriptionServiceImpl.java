package com.example.ziraticket.service.impl;

import com.example.ziraticket.dao.TicketSubscriptionMapper;
import com.example.ziraticket.entity.TicketSubscription;
import com.example.ziraticket.service.TicketSubscriptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketSubscriptionServiceImpl implements TicketSubscriptionService {
  private final Logger logger = LoggerFactory.getLogger(TicketSubscriptionService.class);

  @Autowired
  private TicketSubscriptionMapper subscriptionMapper;

  @Override
  public List<TicketSubscription> getSubscriptionByTicketId(String ticketId) {
    logger.info("getSubscriptionByTicketId ticketId: {}", ticketId);
    return subscriptionMapper.getSubscriptionByTicketId(ticketId);
  }

  @Override
  public int subscribe(String ticketId, String userId) {
    logger.info("subscribe ticketId: {} userId: {}", ticketId, userId);
    var subscription = new TicketSubscription(ticketId, userId);
    return subscriptionMapper.subscribe(subscription);
  }

  @Override
  public int unsubscribe(String ticketId, String userId) {
    logger.info("unsubscribe ticketId: {} userId: {}", ticketId, userId);
    var subscription = new TicketSubscription(ticketId, userId);
    return subscriptionMapper.subscribe(subscription);
  }
}
