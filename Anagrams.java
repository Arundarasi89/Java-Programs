// Example modified from
//    http://www.toves.org/books/java/ch18-recurex/index.html#fig2
 
import java.util.Scanner;

public class Anagrams {
	  
	  public static void main( String[] args)
	  {
		  Scanner keyboard = new Scanner( System.in);
		  
		  System.out.print("Provide a word to anagram: ");
          String word = keyboard.nextLine();
          printAnagrams("", word);
      }
  
      static void printAnagrams(String prefix, String word) {
          if(word.length() <= 1) {
              System.out.println(prefix + word);
          } 
          else {
              for(int i = 0; i < word.length(); i++) {
                  String current = word.substring(i, i + 1);
                  String before = word.substring(0, i); // letters before cur
                  String after = word.substring(i + 1); // letters after cur
                  printAnagrams(prefix + current, before + after);
              }//end for( int i....
         }//end else
     }//end printAnagrams()
      
}