import java.io.*;
import java.util.*;

public class lab6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scnner(System.in);
        String first=sc.nextLine();
        String second=sc.nextLine();
        String f=first.toLowerCase();
        String s=second.toLowerCase();
        int t = f.length()+s.length();
        System.out.println(t);
        
    }
}