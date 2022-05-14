package com.edson.collections.fpij;

import java.util.List;

import com.edson.repo.GenericRepository;

public class PickALongestA {
  public static void main(String[] args) {
    List<String> friends = GenericRepository.getFriends();
    System.out.println("Total number of characteres in all names " + friends.stream()
      .mapToInt(name -> name.length())
      .sum());
      // instead sum() we can use:
      // max() to find the longest length
      // min() to find tne shortest length
      // sort() to sort the length
      // average() to find the average of the length

      /**
       * this example can be considered a use of mapReduce pattern
       * where the map() is the spreead operator and 
       * the sum() is the reduce operation
       */
  }
}
