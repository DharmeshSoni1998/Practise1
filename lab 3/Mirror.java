import java.util.Scanner;

public class Mirror
{
      
       public static String getImage(String str)
       {
              StringBuffer sbr = new StringBuffer(str);
              sbr.append('|');
              StringBuffer sb = new StringBuffer(str);
              sb.reverse();
              sbr.append(sb);
              return sbr.toString();
       }
       public static void main(String[] ar)
       {
             // Mirror p = new Mirror();
              
              Scanner s = new Scanner(System.in);
              System.out.println("Enter a String");
              String str = s.next();
              String sss=getImage(str);
              System.out.println(sss);
       }
}