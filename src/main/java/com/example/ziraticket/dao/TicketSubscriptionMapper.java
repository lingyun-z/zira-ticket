package com.example.ziraticket.dao;

import com.example.ziraticket.entity.TicketSubscription;

import java.util.List;

public interface TicketSubscriptionMapper {
  List<TicketSubscription> getSubscriptionByTicketId(String id);

  int subscribe(TicketSubscription subscription);

  int unsubscribe(TicketSubscription subscription);
}
