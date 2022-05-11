package com.edson.collections.fpij;

import java.util.List;
import java.util.stream.Collectors;

import com.edson.repo.GenericRepository;

public class PickElements {
 public static void main(String[] args) {
   final List<String> startsWith = GenericRepository.getFriends().stream()
    .filter(name -> name.startsWith("N"))
    .collect(Collectors.toList());

    startsWith.forEach(System.out::println);
 } 
}
