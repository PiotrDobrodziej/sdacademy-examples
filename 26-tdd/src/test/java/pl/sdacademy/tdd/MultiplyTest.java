package pl.sdacademy.tdd;

import junit.framework.Assert;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiplyTest {

  @DisplayName("Multiply two numbers")
  @Test

  public void test() throws Exception {
    // given
    int n1 = 4;
    int n2 = 5;
    // when
    int wynik = Multiply.result(n1, n2);
    // then
    Assertions.assertThat(wynik).isEqualTo(20);
  }

  @DisplayName("Mnożenie")
  @ParameterizedTest(name = "czynnik 1 = {0}, czynnik 2 =  {1}, iloczyn = {2}")
  @CsvSource({
          "3,2,6",
          "5,4,20"
  })

  void test(int n1, int n2, int wynik) {
    // when
    int wynik0 = Multiply.result(n1, n2);

    // then
    Assertions.assertThat(wynik0).isEqualTo(wynik);

  }








}
