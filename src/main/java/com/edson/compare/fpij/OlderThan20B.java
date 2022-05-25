package com.edson.compare.fpij;

import java.util.ArrayList;
import java.util.List;

import com.edson.repo.GenericRepository;

public class OlderThan20B {
  public static void main(String[] args) {
    List<Person> people = GenericRepository.getPeople();

    List<Person> olderThan20 = people.stream()
      .filter(person -> person.getAge() > 20)
      .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    System.out.println("People older than 20: " + olderThan20);
  }
}
