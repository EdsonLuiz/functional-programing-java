package com.edson.repo;

import java.util.Arrays;
import java.util.List;

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
}
