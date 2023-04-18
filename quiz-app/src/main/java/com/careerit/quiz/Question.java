package com.careerit.quiz;

import lombok.Data;

import java.util.List;

@Data
public class Question {

      private int id;
      private String questionData;
      private List<String> options;
      private int answer;
}
