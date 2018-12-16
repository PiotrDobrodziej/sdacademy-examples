package pl.sdacademy.clock;

import java.time.LocalTime;

public class ClockTest {


  public static void main(String[] args) throws InterruptedException {
    System.out.println(LocalTime.now());
    Clock clock1 = new Clock();
    clock1.startClock();
    Thread.sleep(3000);
    clock1.stopClock();

  }


}
