package com.careerit.quiz.service;

import com.careerit.quiz.Question;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public final class LoadQuestionUtil {

  public static List<Question> loadQuestions() {
    List<Question> questions = new ArrayList<>();
    try {
      File file = new File(LoadQuestionUtil.class.getResource("/quiz.txt").getFile());
      List<String> lines = Files.readAllLines(file.toPath());
      int count = lines.size()/7;
      for (int i = 0,j=0; i < count; i++,j=j+7) {
        List<String> subList = lines.subList(j, j + 7);
        int id = Integer.parseInt(subList.get(0).substring(1));
        String questionData = subList.get(1);
        List<String> options = new ArrayList<>();
        options.add(subList.get(2).substring(subList.get(2).indexOf(".")+1).trim());
        options.add(subList.get(3).substring(subList.get(3).indexOf(".")+1).trim());
        options.add(subList.get(4).substring(subList.get(4).indexOf(".")+1).trim());
        options.add(subList.get(5).substring(subList.get(5).indexOf(".")+1).trim());
        int answer = Integer.parseInt(subList.get(6).split(":")[1].trim());
        Question question = Question.builder()
            .id(id)
            .questionData(questionData)
            .options(options)
            .answer(answer)
            .build();
        questions.add(question);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return questions;
  }

}
