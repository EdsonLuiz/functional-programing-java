package com.edson.compare.fpij;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

import com.edson.repo.GenericRepository;

public class OlderThan20E {
  public static void main(String[] args) {
    List<Person> people = GenericRepository.getPeople();

    Map<Integer, List<String>> nameOfPeopleByAge = people.stream()
      .collect(
        groupingBy(Person::getAge, mapping(Person::getName, toList()))
      );
    System.out.println("People grouped by age: " + nameOfPeopleByAge);
  }
}
