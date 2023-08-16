import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=scanner.next();
        System.out.println(countChars(s1));
        scanner.close();
    }
     public static Map<Character,Integer> countChars(String s){

     Map<Character,Integer>letters=new LinkedHashMap<>();
     for (int i =0;i<s.length();i++){
         char ch = s.charAt(i);
         if (letters.containsKey(ch)){
             letters.put(ch,letters.get(ch)+1);
         }else letters.put(ch,1);
     }return letters;
    }
}
