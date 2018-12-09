package pl.sdacademy.ownannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalTime;

public class BenchMarkProcessor {

  void benchmark(Object obj) throws InvocationTargetException, IllegalAccessException {
    long time;
    Method[] methods = obj.getClass().getDeclaredMethods();

    for (Method method : methods) {
      if (method.isAnnotationPresent(BenchmarkTime.class)) {
        time = System.currentTimeMillis();
        method.invoke(obj);
        System.out.println(String.format("Method %s takes %d ms to execute",
                method.getName(), (System.currentTimeMillis() - time)));
      }
    }


  }

}
