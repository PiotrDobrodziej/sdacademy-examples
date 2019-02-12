package pl.sdacademy.tdd;

import org.assertj.core.api.Assertions;

public class KittTest {

  public static void main(String[] args) {

    int number = 5;
    String msg = Kitt.play(number);
    Assertions.assertThat(msg).isEqualTo(3);
  }

}
