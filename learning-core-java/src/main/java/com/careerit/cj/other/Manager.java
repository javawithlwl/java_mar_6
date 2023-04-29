package com.careerit.cj.other;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Manager {

  @PaymentType(paymentMode = PaymentMode.CARD)
  public void payBillAmount() {

  }

  public static void main(String[] args) throws NoSuchMethodException {
    Method m1 = new Manager().getClass().getDeclaredMethod("payBillAmount");
    PaymentType ret = m1.getAnnotation(PaymentType.class);
    System.out.println(ret.paymentMode());

    List<BillItem> billItems = new ArrayList<>();
    BillItem billItem1 = BillItem.builder()
        .id(1001)
        .description("Using Badminton court")
        .amount(600)
        .day(Day.TUESDAY)
        .build();
    BillItem billItem2 = BillItem.builder()
        .id(1001)
        .description("Using parking space")
        .amount(400)
        .day(Day.SUNDAY)
        .build();

    Arrays.asList(Day.values()).forEach(ele -> {
      System.out.println(ele);
    });

    Arrays.asList(TShirtSize.values()).forEach(ele -> {
      System.out.println(ele + " " + ele.getSize());
    });
    double weight = 60;
    double mass = weight / Planet.EARTH.surfaceGravity();
    Planet planet = Planet.MARS;
    double weightOnPlanet = planet.surfaceWeight(mass);
    System.out.println(weightOnPlanet);

    UUID uuid = UUID.fromString("da82800a-0646-45d9-a66a-914ce6671427");
    Status status1 = Status.fromValue(uuid);
    System.out.println(status1.getTypeId() + " " + status1.getLabel());

  }
}
