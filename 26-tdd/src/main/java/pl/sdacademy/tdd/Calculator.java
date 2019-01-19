package pl.sdacademy.tdd;

import java.util.stream.Stream;

public class Calculator {

  public static int add(String numbers) {
    if (numbers.isEmpty()) return 0;


    String currRegex = ",|\n";

    if (numbers.length() > 1) {
      if ("//".equals(numbers.substring(0, 2))) {
        currRegex = numbers.substring(2, 3);
        currRegex += "|\n";
        numbers = numbers.substring(5);
      }
    }

    String[] data = numbers.split(currRegex);
    int sum = 0;
    for (String element : data) {
      sum += Integer.parseInt(element);
    }
    return sum;
  }

}
