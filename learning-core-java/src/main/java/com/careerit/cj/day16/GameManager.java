package com.careerit.cj.day16;
abstract class Game{
    void start(){
      System.out.println(this.getClass().getSimpleName()+" game is going to start");
    }
    abstract void play();
    void stop(){
      System.out.println(this.getClass().getSimpleName()+" is going to stop");
    }
}
class Car extends  Game{

  @Override
  void play() {
      System.out.println("Hi you are going to play "+this.getClass().getSimpleName()+" game, please wear seat belt");
  }
}
class Bike extends  Game{
  @Override
  void play(){
    System.out.println("Hi you are going to play "+this.getClass().getSimpleName()+" game, please wear helmet");
  }

}
public class GameManager {
  public static void main(String[] args) {
        Game game = new Bike();
        game.start();
        game.play();
        game.stop();
  }
}
