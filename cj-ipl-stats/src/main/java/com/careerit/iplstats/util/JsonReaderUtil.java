package com.careerit.iplstats.util;

import com.careerit.iplstats.domian.Player;
import com.careerit.iplstats.domian.Team;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class JsonReaderUtil {

    private JsonReaderUtil(){

    }
    public static List<Player> loadPlayers(){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Player> players = new ArrayList<>();
        TypeReference<List<Player>> type = new TypeReference<List<Player>>() {};
        try {
            players = objectMapper.readValue(JsonReaderUtil.class.getResource("/player.json"), type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return players;
    }
    public static List<Team> loadTeamDetails(){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Team> teams = new ArrayList<>();
        TypeReference<List<Team>> type = new TypeReference<List<Team>>() {};
        try {
            teams = objectMapper.readValue(JsonReaderUtil.class.getResource("/team.json"), type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return teams;
    }
}
