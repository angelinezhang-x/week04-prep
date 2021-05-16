import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      // TODO: Implement your code here
      Scanner scnr = new Scanner(System.in);
      int num = scnr.nextInt();
      String word;
      for (int i = 0; i < num; i++) {
        word = scnr.next();
        System.out.println(word);
      }
      scnr.close();
   }
}