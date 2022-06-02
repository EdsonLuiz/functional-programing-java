package com.edson.compare.fpij;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListSelectFilesA {
  public static void main(String[] args) throws IOException {
    Files.newDirectoryStream(
      Paths.get("src/main/java/com/edson/compare/fpij"), path -> path.toString().endsWith(".java")
    ).forEach(System.out::println);
  }
}
