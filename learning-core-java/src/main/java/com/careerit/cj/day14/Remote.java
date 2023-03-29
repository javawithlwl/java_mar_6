package com.careerit.cj.day14;

import java.util.StringJoiner;

public class Remote extends Object {

      int volume;
      boolean isMute;
      public Remote(){
          this.volume = 5;
          this.isMute = false;
      }
      public void volumeUp(){
          if(this.isMute){
              this.isMute = false;
          }
          this.volume++;
      }
      public void volumeDown(){
          if(this.volume>0){
              this.volume--;
          }
          if(this.volume==0){
            this.isMute = true;
          }
      }
      public void mute(){
          this.isMute = true;
          this.volume = 0;
      }

  @Override
  public String toString() {
    return new StringJoiner(", ", Remote.class.getSimpleName() + "[", "]")
        .add("volume=" + volume)
        .add("isMute=" + isMute)
        .toString();
  }
}
