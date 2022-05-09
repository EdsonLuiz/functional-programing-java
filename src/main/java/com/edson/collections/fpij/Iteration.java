package com.edson.collections.fpij;

import java.util.Arrays;
import java.util.List;

public class Iteration {
 public static void main(String[] args) {
   final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

   // the for loops are inherently sequential and are quite dificult to parallelize
   // loops are non-polimorphiac
   // we passed a collection to for instead of invoking a method (polimorphic operation) 
   // the code fails the "Tell, dont ask" principle

   // we can`t break out the iteration

   friends.forEach(System.out::println);
 } 
}
