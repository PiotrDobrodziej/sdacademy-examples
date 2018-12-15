package downloader;

public class Main {
  public static void main(String[] args) {
//    CommandLineRunner commandLineRunner = new CommandLineRunner(
//            url -> System.out.printf("Downloading file %s\n", url));

    CommandLineRunner commandLineRunner = new CommandLineRunner(
            new FileDownloader());

    commandLineRunner.run(System.in);
  }
}
