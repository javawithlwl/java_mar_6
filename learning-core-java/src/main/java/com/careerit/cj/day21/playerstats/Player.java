package com.careerit.cj.day21.playerstats;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Player {

  private String name;
  private String role;
  private double amount;
  private String country;
  private String team;


}
