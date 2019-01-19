package pl.sdacademy.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @DisplayName("given empty string, then 0 is returned")
  @Test
  public void test0(){
    // given
    String text = "";
    // when
    int wynik = Calculator.add(text);
    // than
    Assertions.assertThat(wynik).isEqualTo(0);
  }

  @DisplayName("given string with one element then this element is returned")
  @Test
  public void testOneElement(){
    // given
    String text = "2";
    // when
    int wynik = Calculator.add(text);
    // than
    Assertions.assertThat(wynik).isEqualTo(2);
  }

  @DisplayName("given string with two element then sum this telements is returned its value")
  @Test
  public void testTw0Eelements(){
    // given
    String text = "20,56";
    // when
    int wynik = Calculator.add(text);
    // than
    Assertions.assertThat(wynik).isEqualTo(76);
  }

  @DisplayName("given string with any element then sum this telements is returned its value")
  @Test
  public void test3Eelements(){
    // given
    String text = "1,2,3,5,4,5,3,4,6,7,8,9,9";
    // when
    int wynik = Calculator.add(text);
    // than
    Assertions.assertThat(wynik).isEqualTo(66);
  }

  @DisplayName("given munbers with \n beetwen numbers ")
  @Test
  public void test4Delimiter(){
    // given
    String text = "1\n2,3";
    // when
    int wynik = Calculator.add(text);
    // than
    Assertions.assertThat(wynik).isEqualTo(6);
  }

  @DisplayName("given delimiter after 2 character \\\\ ")
  @Test
  public void test5Delimiter(){
    // given
    String text = "//;\\n1;2";
    // when
    int wynik = Calculator.add(text);
    // than
    Assertions.assertThat(wynik).isEqualTo(3);
  }



}
