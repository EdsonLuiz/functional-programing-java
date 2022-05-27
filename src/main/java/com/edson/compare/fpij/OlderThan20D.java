package com.edson.compare.fpij;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.edson.repo.GenericRepository;

public class OlderThan20D {
  public static void main(String[] args) {
    List<Person> people = GenericRepository.getPeople();

    Map<Integer, List<Person>> peopleByAge = people.stream()
      .collect(Collectors.groupingBy(Person::getAge));

    System.out.println("Grouped by age: " + peopleByAge);
  }
}
