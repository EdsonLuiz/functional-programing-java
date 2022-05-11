package com.edson.collections.fpij;

import java.util.function.Predicate;

import com.edson.repo.GenericRepository;

public class PickDifferentNames {
  public static void main(String[] args) {
      final long countFriendsStartsN = GenericRepository.getFriends()
      .stream().filter(checkIfStartsWith("N")).count();

      final long countFriendsStartsB = GenericRepository.getFriends()
        .stream().filter(checkIfStartsWith("B")).count();

      System.out.println("Friends starts with N " + countFriendsStartsN);
      System.out.println("Friends starts with B " + countFriendsStartsB);
  } 

  static Predicate<String> checkIfStartsWith(final String letter) {
  return name -> name.startsWith(letter);
};
}
