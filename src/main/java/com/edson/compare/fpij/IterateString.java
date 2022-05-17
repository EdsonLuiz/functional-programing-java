package com.edson.compare.fpij;

public class IterateString {
  public static void main(String[] args) {
    final String str = "w00t";

    str.chars()
      .forEach(IterateString::printChar);
  }

  private static void printChar(int aChar) {
    System.out.println((char)(aChar));
  }
}

