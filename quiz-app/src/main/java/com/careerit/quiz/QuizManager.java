package com.careerit.quiz;

import com.careerit.quiz.service.QuizService;
import com.careerit.quiz.service.QuizServiceImpl;

public class QuizManager {

  public static void main(String[] args) {

    QuizService quizService = new QuizServiceImpl();
    quizService.startQuiz("Yogi");
  }
}
