package com.careerit.cj.product;
import java.io.File;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ProductFileReaderUtil {

        public static List<Product> loadFromFile(){
          try {
            LocalDate localDate = LocalDate.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd_MM_yyyy");
            String fileName = "/top_rated_product_" + localDate.format(dateTimeFormatter)+".csv";
            List<String> reqColumn = List.of("pid", "name", "price", "discount");
            File file = new File(ProductFileReaderUtil.class.getResource(fileName).getFile());
            List<String> lines = Files.readAllLines(file.toPath());
            List<String> headings = Arrays.asList(lines.get(0).split(","));
            Map<String,Integer> headingIndex = new HashMap<>();
            for(int i=0;i<headings.size();i++){
                  headingIndex.put(headings.get(i),i);
            }
            System.out.println(headings);
            for(int i=1;i<lines.size();i++){
                String[] arr = lines.get(i).split(",");
                int pid = Integer.parseInt(arr[headingIndex.get("pid")]);
                String name = arr[headingIndex.get("name")];
              System.out.println(pid+" "+name);
            }

          }catch (Exception e){
            e.printStackTrace();
          }
          return null;
        }

  public static void main(String[] args) {
        loadFromFile();
  }

}
