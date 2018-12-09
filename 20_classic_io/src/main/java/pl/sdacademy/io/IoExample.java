package pl.sdacademy.io;

import java.io.*;
import java.net.URLConnection;
import java.nio.file.Paths;

public class IoExample {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader
                    (new FileReader(Paths.get("files", "sourceFile.txt").toFile()))) {
      bufferedReader.readLine();
      String line = bufferedReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    }


    try (BufferedWriter bufferedWriter = new BufferedWriter
            (new FileWriter(Paths.get("files", "sourceFileNew.txt").toFile()))) {
      bufferedWriter.write("String testowy 1");
      bufferedWriter.newLine();
      bufferedWriter.write("String testowy 22");
      bufferedWriter.flush();
    }




  }
}