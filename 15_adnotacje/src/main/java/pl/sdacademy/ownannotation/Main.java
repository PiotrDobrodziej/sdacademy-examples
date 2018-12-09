package pl.sdacademy.ownannotation;

import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    // todo
    TestClass test = new TestClass();
    BenchMarkProcessor benchMarkProcessor = new BenchMarkProcessor();
    benchMarkProcessor.benchmark(test);

  }
}
