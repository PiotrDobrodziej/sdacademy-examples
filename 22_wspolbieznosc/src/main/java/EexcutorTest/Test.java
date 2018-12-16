package EexcutorTest;

import downloader.Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    Future<Integer> submit1 = executorService.submit(() -> 4);
    Future<Integer> submit2 = executorService.submit(() -> 6);
    Future<Integer> submit3 = executorService.submit(() -> 5);
    System.out.println(submit1.get() + submit2.get() + submit3.get());
    executorService.shutdown();
  }
}

