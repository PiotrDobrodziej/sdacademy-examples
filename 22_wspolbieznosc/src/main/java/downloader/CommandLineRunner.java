//package downloader;
//
//import java.io.InputStream;
//import java.net.URLDecoder;
//import java.util.Scanner;
//
//public class CommandLineRunner {
//
//  private UrlDownloader downloader;
//  private Executor executor;
//
//  public CommandLineRunner(UrlDownloader downloader, Executor executor) {
//    this.downloader = downloader;
//    this.executor = executor;
//  }
//
//  void run(InputStream inputStream) {
//    Scanner scanner = new Scanner(System.in);
//    scanner.useDelimiter("\n");
//    while (scanner.hasNext()) {
//      String command = scanner.next();
//      if ("exit".equals(command)) {
//        return;
//      } else if (!command.isEmpty()) {
//        dowloadURL(command);
//      }
//    }
//  }
//
//  private void dowloadURL(String command) {
//    executor.execute(() -> downloader.download(command), () -> {
//              System.out.println("File downloaded");
//            });
////    Thread thread = new Thread(() -> downloader.download(command));
//
//  }
//
//
//}
