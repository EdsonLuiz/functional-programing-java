package com.edson.collections.fpij;

import java.util.List;
import java.util.Optional;

import com.edson.repo.GenericRepository;

public class PickAnElementB {
  public static void pickName(
    final List<String> names,
    final String startingLetter
  ) {
    final Optional<String> foundName = names.stream()
      .filter(name -> name.startsWith(startingLetter))
      .findFirst(); //  return and Optional

    System.out.println(String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No found name")));

    // we can ask Optional to run a bloc of code or a lambda expression
    // only if a value is present like
    // foundName.isPresent(name -> System.out.prinatln("Hello " + namek));
  }

  public static void main(String[] args) {
    List<String> friends = GenericRepository.getFriends();
    pickName(friends, "N");
    pickName(friends, "X");
  }
}
