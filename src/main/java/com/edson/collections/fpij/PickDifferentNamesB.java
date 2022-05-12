package com.edson.collections.fpij;

import java.util.function.Function;
import java.util.function.Predicate;

import com.edson.repo.GenericRepository;

public class PickDifferentNamesB {
 public static void main(String[] args) {
    final Function<String, Predicate<String>> startsWithLetterV1 = (String letter) -> {
        Predicate<String> chechStarts = (String name ) -> name.startsWith(letter);
        return chechStarts;
    };

    final Function<String, Predicate<String>> startsWithV2 = 
        (String letter)  -> (String name) -> name.startsWith(letter);

    final Function<String, Predicate<String>> startsWithV3 =
      letter -> name -> name.startsWith(letter);

    final long countFriendsStartsN = GenericRepository.getFriends()
      .stream().filter(startsWithV3.apply("N")).count();

    final long countFriendsStartsB = GenericRepository.getFriends()
      .stream().filter(startsWithV3.apply("B")).count();

    System.out.println("Friends starts with N " + countFriendsStartsN);
    System.out.println("Friends starts with B " + countFriendsStartsB);
 } 
}
