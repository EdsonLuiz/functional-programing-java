package com.edson.collections.fpij;

import java.util.List;
import java.util.Optional;

import com.edson.repo.GenericRepository;

public class PickALongestB {
  public static void main(String[] args) {
    List<String> names = GenericRepository.getFriends();
    final Optional<String> aLongName = names.stream()
      .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);

    // the result of reduce() is an optional
    // if the list had only one element, them the reduce() 
    // would return that element and the lambda expression no be invoked
 
    aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));
  }
}
