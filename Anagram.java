import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        s = new String(ch);
        String t = sc.nextLine();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        t = new String(ch2);
        if(s.equals(t)){
            System.out.println("true");
        } 
        else{
            System.out.println("False");
        }
    }
}
