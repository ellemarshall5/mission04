import java.util.Scanner;

//this program will convert words to pig latin

public class Mission04Marshall
{

   public static void main(String[] args)
   {
   
      String input = " ";//initilizes string
      String userWord;//initilizes string
      String newWord;//initilizes string
      
      Scanner keyboard = new Scanner(System.in);//initilizes new scanner
      
      System.out.println("Welcome to the Pig Latin Translator!");//ouput
      System.out.println("Please enter a word.");//asks for user input
      input = keyboard.nextLine();//reads and stores user input
      
      do //tells program to keep running until condition is met
      {      
         System.out.println("The Translation is " + pigLatin(input));//output and calls method
      
         System.out.println("Enter another word or press 'Q' to quit.");//output
         input = keyboard.nextLine();//reads and stores user input
      }
      
      while (!input.equalsIgnoreCase("Q"));//conidition to determine if program quits
      
   public static String pigLatin(String userWord)//new method to translate words into pig latin
   {
      
      String result = "";//initilizes string
      String end = "";//initilizes string
      char vowel;//initilizes char
      char lower; //initilizes char
      
      vowel = userWord.charAt(0);//reads first char and stores it
      
      lower = Character.toLowerCase(vowel);//converts char to lower case
     
      if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')//decides which branch to use
      {
         String first = Character.toString(lower);//changes char to string 
         end = userWord.substring(1) + first + "ay";//creates and stores translated word
         return end;//returns translated word
      }
      
      else 
      {
         result = userWord + "way";//creates and stores translated word 
      }
      
      return result;//returns translated word
   }
}
