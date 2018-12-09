package pl.sdacademy.mapa.examples;

import java.util.*;

public class MapExample {
  public static void main(String[] args) {
    // peppersExample();
    countWordsExample();
  }

  private static void countWordsExample() {
    String anyString = "Zgodnie z pierwotną metodyką ostrość w skali Scoville’a wyznaczano organoleptycznie. Najpierw tworzono roztwór cukru z wodą, a następnie dodawano znaną ilość alkoholowego ekstraktu z badanej papryki do roztworu. Gdy testerzy (zazwyczaj pięciu) zaczynali odczuwać pieczenie, wyznaczano stopień rozcieńczenia roztworu, co dawało wynik na scali Scoville’a, np. SHU papryki habanero odmiany ‘Red Savina’ o wartości 580 000 oznacza, że jej ekstrakt musi zostać rozcieńczony w stosunku 1:580 000, zanim przestanie być odczuwane uczucie ostrości.";
    List<String> listOfWords = Arrays.asList(anyString.split("\\s"));

    Map<String, Integer> words = new HashMap<>();

    for (String word : listOfWords) {
      if(words.containsKey(word)) {
        words.put(word,words.get(word)+1);
      } else {
        words.put(word, 1);
      }
    }


    System.out.println(words);

  }


  private static void peppersExample() {
    Map<String, Integer> peppers = new HashMap<>();

    peppers.put("Habaner0", 100_000);
    peppers.put("Jalapeno", 2_500);
    peppers.put("PepperX", 3_180_000);
    peppers.put("Pepperoni", 100);


//    System.out.println(peppers);
//    System.out.println(peppers.get("PepperX"));
    System.out.println(peppers.entrySet());

    for (Map.Entry<String, Integer> entry : peppers.entrySet()) {
      if (entry.getValue() == 2_500) {
        System.out.println(entry.getKey());
      }
    }
  }

}
