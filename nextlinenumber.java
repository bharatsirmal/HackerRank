//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner sc=new Scanner(System.in);
  int i=1;
  while(sc.hasNext()){
      String str=sc.nextLine();
      System.out.println(i+" "+str);
      i++;
  }
    }
}
