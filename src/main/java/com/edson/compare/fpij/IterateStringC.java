package com.edson.compare.fpij;

public class IterateStringC {
  public static void main(String[] args) {
    final String str = "w00t";

    str.chars()
      .filter(Character::isDigit)
      .forEach(IterateStringC::printChar);
  }

  private static void printChar(final int c) {
    System.out.println((char)(c));
  }
}
