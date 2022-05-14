package com.edson.collections.fpij;

import java.util.List;

import com.edson.repo.GenericRepository;

public class PickALongestC {
  public static void main(String[] args) {
    List<String> names = GenericRepository.getFriends();

    final String steveOrLonge = names.stream()
      .reduce("steve", (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
    // in this example reduce() receive as the first argument "steve",
    // this the initial value of name1
    
    System.out.println(String.format("This is the longest name: %s", steveOrLonge));
  }
}
