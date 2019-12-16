package com.example.ziraticket.service;

import com.example.ziraticket.entity.TicketSubscription;

import java.util.List;

public interface TicketSubscriptionService {
  List<TicketSubscription> getSubscriptionByTicketId(String id);

  int subscribe(String ticketId, String userId);

  int unsubscribe(String ticketId, String userId);
}
