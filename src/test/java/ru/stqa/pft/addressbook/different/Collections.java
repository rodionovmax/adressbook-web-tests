package ru.stqa.pft.addressbook.different;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args){

    // Massive initialization 1 option
    /*String[] langs = new String[4];
    langs[0] = "Java";
    langs[1] = "C#";
    langs[2] = "PHP";
    langs[3] = "Python";*/

    //Massive initialization 2 option
    String[] langs = {"Java", "C#", "Python", "PHP"};

    for (int i = 0; i < langs.length; i++){
      System.out.println("I want to learn: " + langs[i]);
    }

    //Massive initialization 3 option
    for (String l: langs) {
      System.out.println("I really want to know: " + l);
    }

    //4th option - Initialization of list
    /*List<String> languages = new ArrayList<String>();
    languages.add("Java");
    languages.add("C#");
    languages.add("Python");
    languages.add("PHP");

    for (String l: languages){
      System.out.println("WTF dude learn fucking: " + l);
    }*/

    //5th option - Initialization of list version 2
    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");
    for (int i = 0; i < languages.size(); i++){
      System.out.println("WTF dude learn fucking: " + languages.get(i));
    }
  }
}
