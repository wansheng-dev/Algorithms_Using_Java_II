import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTest {
  
  public static void main(String[] args) {
    
    PuzzleJava one = new PuzzleJava();
    int[] arr1={3,5,1,2,7,9,8,13,25,32};
    System.out.println(one.sumAndGreater(arr1, 10));

    PuzzleJava two = new PuzzleJava();
    ArrayList<String> names = new ArrayList<String>();
    names.add("Nancy");
    names.add("Jinichi");
    names.add("Fujibayashi");
    names.add("Momochi");
    names.add("Ishikawa");
    System.out.println(two.printAndLength(names));

    PuzzleJava three = new PuzzleJava();
    three.letters();

    PuzzleJava four = new PuzzleJava();
    System.out.println(four.tenRandoms());

    PuzzleJava five = new PuzzleJava();
    System.out.println(five.tenRandomsPlus());

    PuzzleJava six = new PuzzleJava();
    System.out.println(six.randomStr());

    PuzzleJava seven = new PuzzleJava();
    System.out.println(seven.tenRandomsStrs());
  }
}