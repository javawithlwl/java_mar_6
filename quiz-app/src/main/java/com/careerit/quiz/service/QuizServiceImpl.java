package com.careerit.quiz.service;

import com.careerit.quiz.Question;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizServiceImpl implements  QuizService{
  @Override
  public void startQuiz(String name) {

    try {
      System.out.println("Hi " + name + " welcome to quiz world, you quiz is going start in few seconds...");
      TimeUnit.SECONDS.sleep(5);
      List<Question> questionList = LoadQuestionUtil.loadQuestions();
      int ccount = 0;
      Scanner sc  = new Scanner(System.in);
      for(Question question:questionList){
        System.out.println(question.getId()+". "+question.getQuestionData());
        System.out.println();
        int i = 1;
        for(String opt:question.getOptions()){
          System.out.println(i+". "+opt);
          i++;
        }
        System.out.println();
        System.out.println("Enter your choice (1-4) :");
        int ans = sc.nextInt();
        if(ans == question.getAnswer()){
            ccount++;
        }

      }
      System.out.println("Please wait your results are computing");
      TimeUnit.SECONDS.sleep(5);
      showResult(questionList.size(),ccount,name);
    }catch (Exception e){
        e.printStackTrace();
    }
  }

  private void showResult(int size, int ccount, String name) {
    System.out.println("Hi "+name+", You have scored "+ccount+" out of "+size);
  }
}
