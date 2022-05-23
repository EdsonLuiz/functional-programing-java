package com.edson.compare.fpij;

import java.util.ArrayList;
import java.util.List;

import com.edson.repo.GenericRepository;

public class OlderThan20 {
  public static void main(String[] args) {
    List<Person> olderThan20 = new ArrayList<>();
    List<Person> people = GenericRepository.getPeople();
    
    people.stream()
      .filter(person -> person.getAge() > 20)
      .forEach(person -> olderThan20.add(person));
    
    System.out.println(olderThan20);
  }
}
