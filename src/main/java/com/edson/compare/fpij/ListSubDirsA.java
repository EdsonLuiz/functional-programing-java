package com.edson.compare.fpij;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSubDirsA {
  public static void main(String[] args) {
    List<File> files = new ArrayList<>();

    File[] filesInCurrentDirectory = new File(".").listFiles();
    for (File file : filesInCurrentDirectory) {
      File[] filesInSubDirectory = file.listFiles();
      if(filesInSubDirectory != null) {
        files.addAll(Arrays.asList(filesInSubDirectory));
      } else {
        files.add(file);
      }
    }
    System.out.println("Count: " + files.size());
  }
}
