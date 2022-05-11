package com.edson.collections.fpij;

import java.util.function.Predicate;

import com.edson.repo.GenericRepository;

public class PickElementsMultipleCollection {
 public static void main(String[] args) {
    final Predicate<String> startsWithN = name -> name.startsWith("N");

    final long countFriendsStartsN = GenericRepository.getFriends()
      .stream().filter(startsWithN).count();

    final long countComradesStartsN = GenericRepository.getComrades()
      .stream().filter(startsWithN).count();

    final long countEditorsStartsN = GenericRepository.getEditors()
      .stream().filter(startsWithN).count();

    System.out.println("count friends starts with N " + countFriendsStartsN);
    System.out.println("count editors starts with N " + countEditorsStartsN);
    System.out.println("count comrades starts with N " + countComradesStartsN);
 }
}
