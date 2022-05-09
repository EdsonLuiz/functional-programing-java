package com.edson.collections.fpij;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transform {
 public static void main(String[] args) {
   final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

   friends.stream()
    .map(f -> f.toUpperCase())
    .forEach(System.out::println);
 } 
}
