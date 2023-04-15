package com.careerit.iplstats;

import com.careerit.iplstats.service.IplStatService;
import com.careerit.iplstats.service.IplStatServiceImpl;

public class IplStatsManager {

  public static void main(String[] args) {

    IplStatService iplStatService = new IplStatServiceImpl();
//    iplStatService.getTeamBasicDetails().forEach(ele->{
//      System.out.println(ele.getTeam()+" "+ele.getTeamName());
//    });
  }
}
