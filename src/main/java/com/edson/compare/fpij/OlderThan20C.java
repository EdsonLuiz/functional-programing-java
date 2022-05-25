package com.edson.compare.fpij;

import java.util.List;
import java.util.stream.Collectors;

import com.edson.repo.GenericRepository;

public class OlderThan20C {
  public static void main(String[] args) {
    List<Person> people = GenericRepository.getPeople();

    List<Person> olderThan20 = people.stream()
      .filter(person -> person.getAge() > 20)
      .collect(Collectors.toList());

    System.out.println("People older than 20: " + olderThan20);
  }
}
