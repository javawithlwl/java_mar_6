package com.careerit.iplstats.domian;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private String role;
    private String country;
    private String team;
    @JsonProperty("amount")
    private double price;
}
