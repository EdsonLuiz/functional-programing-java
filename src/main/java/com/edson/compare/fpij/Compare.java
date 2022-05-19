package com.edson.compare.fpij;

import java.util.List;
import java.util.stream.Collectors;

import com.edson.repo.GenericRepository;

public class Compare {
  public static void main(String[] args) {
    List<Person> ascendingAge = GenericRepository.getPeople().stream()
      .sorted((person1, person2) -> person1.ageDifference(person2))
      .collect(Collectors.toList());

      Person.prinatPeople("Sorted in ascending order by age", ascendingAge);
  }
}

class CompareV2 {
  public static void main(String[] args) {
    List<Person> ascendingAge = GenericRepository.getPeople().stream()
      .sorted(Person::ageDifference)
      .collect(Collectors.toList());

    Person.prinatPeople("Sorted in ascending order by age", ascendingAge);
  }
}

class ReusingAComparator {
  public static void main(String[] args) {
    Person.prinatPeople("Sorted in descending order by age: ", 
      GenericRepository.getPeople().stream()
        .sorted((person1, person2) -> person2.ageDifference(person1))
        .collect(Collectors.toList()));
  }
}