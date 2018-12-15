package pl.sdacademy.thread;

public class HelloThreadExample {

  public static void main(String[] args) {
    int number = 0;
    Thread thread = new Thread(() -> System.out.println("hello from thread!"));
    thread.start();
    System.out.println("hello");
  }


  public static class NumberHolder{
    private int number;
  }



}
