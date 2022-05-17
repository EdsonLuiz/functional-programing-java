package com.edson.compare.fpij;

public class IterateStringB {
  public static void main(String[] args) {
    final String str = "w00t";

    str.chars()
      .mapToObj(ch -> Character.valueOf((char)ch))
      .forEach(System.out::println);
  }
}
