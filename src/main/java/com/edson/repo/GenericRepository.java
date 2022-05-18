package com.edson.repo;

import java.util.Arrays;
import java.util.List;

import com.edson.compare.fpij.Person;

public class GenericRepository {
 public static List<String> getFriends() {
   final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
   return friends;
 } 

 public static List<String> getEditors() {
   final List<String> editors = Arrays.asList("Brian", "Jackie", "Jhon", "Mike");
   return editors;
 }

 public static List<String> getComrades(){
   final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
   return comrades;
 }

 public static List<Person> getPeople() {
   List<Person> people = List.of(
     new Person("Jhon", 20),
     new Person("Sara", 21),
     new Person("Jane", 21),
     new Person("Greg", 35)
   );
  return people;
 }

}
