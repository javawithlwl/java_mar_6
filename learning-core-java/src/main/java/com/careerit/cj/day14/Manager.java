package com.careerit.cj.day14;

public class Manager {

  public static void main(String[] args) {

    Remote remote = new Remote();
    remote.volumeUp();
    remote.volumeUp();
    remote.volumeDown();
    System.out.println(remote);

    Remote remote1 = new Remote();
    remote1.volumeDown();
    remote1.mute();
    remote1.volumeUp();
    System.out.println(remote1);
  }
}
