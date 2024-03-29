import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Sarah
 *  Class:          CS30S
 * 
 *  Assignment:     CS30S A4.0 OOP Cookies and Jars
 * 
 *  Description:   
 * 
 *************************************************************/

public class Main {
  // a new line character that works on every computer system
  final static String nl = System.lineSeparator();
  final static String delim = "[ ]+";          // delimiter for splitting input records

  public static void main(String[] args) throws IOException{
      // ***** constants *******

      // ***** variables *****
      String banner = "";             // output banner
      String prompt = "";             // prompt for user input

      String strin = "";              // string fro keyboard input
      String strout = "";             // string for formatted output

      String[] tokens = null;         // used to split input records


      // ***** objects *****
      
      ProgramInfo pInfo = new ProgramInfo("A4.0 OOP Cookies and Jars");
      Scanner scanner = new Scanner(System.in);


      // ***** print banner *****
      
      System.out.println(pInfo.getBanner());

      int ID;
      
      // Jar
      ArrayList<Jar> jars = new ArrayList<>();

      
      //Cookie
      Cookie c1 = new Cookie("Chocolate Chip");
      Cookie c2 = new Cookie("Oreo");
      Cookie c3 = new Cookie("Sugar");
      Cookie c4 = new Cookie("Mint Chip");
      Cookie c5 = new Cookie("Peanut Butter");
      Cookie c6 = new Cookie("Ginger");
      Cookie c7 = new Cookie("ShortBread");
      Cookie c8 = new Cookie("Fig Newton");
      Cookie c9 = new Cookie("Double Fudge");
      
      // read Jars.txt file
      
      BufferedReader fin = new BufferedReader(new FileReader("Jars.txt"));

      
      // ***** Main Processing *****

      strin = fin.readLine();
      
      while(strin != null){
          jars.add(new Jar(strin));

          //update control
          strin = fin.readLine();
      }// end eof loop 

      System.out.println("The Jars have been created and added to the list of jars.");

      
      // add Cookies to Bat Jar
      addCookiesToJar(c1, jars.get(0));
      addCookiesToJar(c2, jars.get(0));
      addCookiesToJar(c3, jars.get(0));
      addCookiesToJar(c3, jars.get(0));
      
      // add Cookies to Jar Jar Binks
      addCookiesToJar(c4, jars.get(1));
      addCookiesToJar(c1, jars.get(1));
      addCookiesToJar(c1, jars.get(1));
      addCookiesToJar(c3, jars.get(1));
      addCookiesToJar(c5, jars.get(1));
      
      // add Cookies to A Jar Door
      addCookiesToJar(c6, jars.get(2));
      addCookiesToJar(c7, jars.get(2));
      addCookiesToJar(c2, jars.get(2));
      
      // add Cookies to Jarmain Jackson
      addCookiesToJar(c8, jars.get(3));
      addCookiesToJar(c9, jars.get(3));
      addCookiesToJar(c9, jars.get(3));
      
      System.out.println("Some cookies have been added to each jar.");
      System.out.println("Now let's print the list of jars and cookies using toString()\n");

      
      // Printing jars and their cookies
      System.out.println("-----------------------------------");
      System.out.println("A list of all of the jars and the cookies they contain.");
      System.out.println("-----------------------------------\n");

      for (Jar jar : jars) {
          System.out.println(jar.toString());
      }


      System.out.println("-----------------------------------");
      System.out.println("end of processing");
  }

  // add the setAssociation() static method
  public static void addCookiesToJar(Cookie c, Jar j){
      c.setJar(j);
      j.addCookie(c);
  }// end adoptACat
}// end driver
