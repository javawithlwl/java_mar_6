package com.careerit.cj.day14;

public class AccNumberGenerator {

  private static int startNum = 1001;

  public static int getNewAccNumber() {
    return startNum++;
  }
}
