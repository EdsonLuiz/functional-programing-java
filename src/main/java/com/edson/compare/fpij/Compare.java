package com.edson.compare.fpij;

import java.util.Comparator;
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

class CompareV3 {
  public static void main(String[] args) {
    List<Person> people = GenericRepository.getPeople();

    Comparator<Person> compareAscending = (person1, person2) -> person1.ageDifference(person2);
    Comparator<Person> compareDescending = compareAscending.reversed();

    Person.prinatPeople("Sorted in acending order", people.stream().sorted(compareAscending).collect(Collectors.toList()));

    Person.prinatPeople("Sorted in descending order", people.stream().sorted(compareDescending).collect(Collectors.toList()));
  }
}

class CompareV4 {
  public static void main(String[] args) {
    List<Person> people = GenericRepository.getPeople();

    Comparator<Person> ascendingOrderByName = (person1, person2) -> person1.getName().compareTo(person2.getName());

    Comparator<Person> descendingOrderByName = ascendingOrderByName.reversed();
    
    Person.prinatPeople("Sorted in ascending order by name", people.stream().sorted(ascendingOrderByName).collect(Collectors.toList()));

    Person.prinatPeople("Sorted in descending order by name", people.stream().sorted(descendingOrderByName).collect(Collectors.toList()));
  }
}

class CompareV5 {
  public static void main(String[] args) {
    List<Person> people = GenericRepository.getPeople();
    
    people.stream()
      .min(Person::ageDifference)
      .ifPresent(youngst -> System.out.println("Youngst" + youngst));
  }
}

class CompareV6 {
  public static void main(String[] args) {
    List<Person> people = GenericRepository.getPeople();

    people.stream()
      .max(Person::ageDifference)
      .ifPresent(eldest -> System.out.println("Eldest: " + eldest));
  }
}