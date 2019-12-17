package com.example.ziraticket.utils;

public class StringUtils {
  public static boolean isBlank(String a) {
    return a == null || "".equals(a);
  }

  public static boolean isNotBlank(String a) {
    return !isBlank(a);
  }
}
