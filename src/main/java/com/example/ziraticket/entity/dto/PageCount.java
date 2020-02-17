package com.example.ziraticket.entity.dto;

public class PageCount {
  private int count;

  public PageCount() {
  }

  public PageCount(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "PageCount{" +
            "count=" + count +
            '}';
  }
}
