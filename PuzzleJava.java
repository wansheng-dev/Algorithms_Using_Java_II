import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

  public static ArrayList<Integer> sumAndGreater(int[] arrY, int y) {
    int sum = 0;
    ArrayList<Integer> greater = new ArrayList<Integer>();
    for (int element : arrY){
      sum += element;
      if (element > y){
        greater.add(element);
      };
    };
    System.out.println(sum);
    return greater;
  };

  public static ArrayList<String> printAndLength(ArrayList<String> arrName) {
    ArrayList<String> longName = new ArrayList<String>();
    Collections.shuffle(arrName);
    for (String element : arrName){
      System.out.println(element);
      if (element.length() > 5){
        longName.add(element);
      }
    }
    return longName;
  };

  public void letters() {
    ArrayList<String> alphabet = new ArrayList<String>();
    alphabet.add("A");
    alphabet.add("B");
    alphabet.add("C");
    alphabet.add("D");
    alphabet.add("E");
    alphabet.add("F");
    alphabet.add("G");
    alphabet.add("H");
    alphabet.add("I");
    alphabet.add("J");
    alphabet.add("K");
    alphabet.add("L");
    alphabet.add("M");
    alphabet.add("N");
    alphabet.add("O");
    alphabet.add("P");
    alphabet.add("Q");
    alphabet.add("R");
    alphabet.add("S");
    alphabet.add("T");
    alphabet.add("U");
    alphabet.add("V");
    alphabet.add("W");
    alphabet.add("X");
    alphabet.add("Y");
    alphabet.add("Z");
    Collections.shuffle(alphabet);
    String first = alphabet.get(0);
    System.out.println(first);
    String last = alphabet.get(alphabet.size()-1);
    System.out.println(last);
    if (first == "A" || first == "E" || first == "I" || first == "O" || first == "U"){
      System.out.println("First is a Vowel");
    } else {
      System.out.println("It ain't Vowel");
    }
  };

  public static ArrayList<Integer> tenRandoms() {
    ArrayList<Integer> result = new ArrayList<Integer>();
    Random r = new Random();
    int counter = 0;
    while (counter < 10){
      int num = r.nextInt(45) + 55;
      result.add(num);
      counter ++;
    }
    return result;
  };

  public static ArrayList<Integer> tenRandomsPlus() {
    ArrayList<Integer> result = new ArrayList<Integer>();
    Random r = new Random();
    int counter = 0;
    while (counter < 10){
      int num = r.nextInt(45) + 55;
      result.add(num);
      counter ++;
    }
    Collections.sort(result);
    int min = result.get(0);
    int max = result.get(result.size()-1);
    System.out.println(min);
    System.out.println(max);
    return result;
  };

  public static String randomStr (){ // ????
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 5;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();

    return generatedString;
  };

  public static ArrayList<String> tenRandomsStrs() {
    ArrayList<String> result = new ArrayList<String>();
    int counter = 0;
    while ( counter < 10){
      result.add(randomStr());
      counter ++;
    }
    return result;
  };
}