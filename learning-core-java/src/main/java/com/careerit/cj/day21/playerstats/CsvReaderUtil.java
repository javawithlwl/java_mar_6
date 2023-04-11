package com.careerit.cj.day21.playerstats;

import com.careerit.cj.day21.EmployeeManager;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public final class CsvReaderUtil {

  private CsvReaderUtil() {

  }

  public static List<Player> loadPlayers() throws IOException {
    List<Player> players = new ArrayList<>();
    String fileName = EmployeeManager.class.getResource("/players.csv").getFile();
    Reader in = new FileReader(fileName);
    final String[] HEADERS = "name,role,amount,country,team".split(",");
    CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
        .setHeader(HEADERS)
        .setSkipHeaderRecord(true)
        .build();
    Iterable<CSVRecord> records = csvFormat.parse(in);
    for (CSVRecord csvRecord : records) {
      String name = csvRecord.get("name");
      String role = csvRecord.get("role");
      double amount = Double.parseDouble(csvRecord.get("amount"));
      String country = csvRecord.get("country");
      String team = csvRecord.get("team");
      Player player = Player.builder()
          .name(name)
          .team(team)
          .amount(amount)
          .role(role)
          .team(team).build();
      players.add(player);
    }
    return players;
  }
}
