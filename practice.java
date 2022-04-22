// program to replace the with 'i' character in the place of 'e' character.

import java.util.*;

class practice{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your word :");
    String word = scan.nextLine();
    String result = "";

    for(int i = 0; i < word.length(); i++){
      if(word.charAt(i) == 'e'){
        result+='i';
      }else{
        result+=word.charAt(i);
      }
    }
    System.out.println(result);
   }
}
