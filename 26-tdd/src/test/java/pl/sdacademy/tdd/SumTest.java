package pl.sdacademy.tdd;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class SumTest {
  @DisplayName("Sum two numbers")
  @Test


  public void test() throws Exception {
    //given
    int number = 7;
    // when
    String msg = Sum.msg(number);
    // then
    assertThat(msg).isEqualTo("7");
  }


  public void test2() throws Exception {
    //given
    int number = 0;
    // when
    String msg = Sum.msg(number);
    // then
    assertThat(msg).isEqualTo("0");
  }


}
