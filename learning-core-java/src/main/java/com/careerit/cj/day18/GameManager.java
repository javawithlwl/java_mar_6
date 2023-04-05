package com.careerit.cj.day18;

interface Game {
  void start();

  void play();

  void stop();

}
abstract class AbstractGame implements  Game{
  @Override
  public void start() {
    System.out.println("The game " + this.getClass().getSimpleName() + " is going to start");
  }
  @Override
  public void stop() {
    System.out.println("The game " + this.getClass().getSimpleName() + " is going to stop");
  }
}

class Bike extends AbstractGame implements Game {

  @Override
  public void play() {
    System.out.println("You are playing " + this.getClass().getSimpleName() + " game, please wear helmet!...");
  }

}
class Car extends AbstractGame implements  Game{

  @Override
  public void play() {
    System.out.println("You are playing " + this.getClass().getSimpleName() + " game, please wear seat belt!...");
  }

}


public class GameManager {

  public static void main(String[] args) {
    Game game = new Car();
    game.start();
    game.play();
    game.stop();
  }
}
