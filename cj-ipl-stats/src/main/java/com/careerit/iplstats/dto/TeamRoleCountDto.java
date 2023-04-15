package com.careerit.iplstats.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamRoleCountDto {

    private String team;
    private String role;
    private int count;
}
