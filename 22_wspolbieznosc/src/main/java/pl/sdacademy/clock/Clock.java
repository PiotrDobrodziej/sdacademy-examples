package pl.sdacademy.clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {

  void startClock() {
    new Thread(this::work).start();
  }

  private void work() {
    while (isWorking()) {
      try {
        Thread.sleep(1000);
//        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        System.out.println(LocalTime.now());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  void stopClock() {
    working = false;
  }

  private boolean working;

  private boolean isWorking() {
    return working;
  }


}
