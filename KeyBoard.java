import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyBoard {

   public static String readString(String prompt, String output) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.flush();
    
      System.out.println(prompt);
      System.out.print(">> ");
      try {
          String line = reader.readLine();
          if (line != null && !line.isEmpty()) {
              System.out.println(output);
              return line;
          } else {
              System.out.println("Input was empty.");
              return " ";
          }
      } catch (Exception e) {
         System.err.println("Error while reading the string: " + e.getMessage());
         return " ";
      }
   }

   public static char readChar(String prompt, String output) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.flush();
    
      System.out.println(prompt);
      System.out.print(">>  ");
      try {
          String line = reader.readLine();
          if (line != null && !line.isEmpty()) {
              System.out.println(output);
              return line.charAt(0);
          } else {
              System.out.println("Input was empty.");
              return ' ';
          }
      } catch (Exception e) {
         System.err.println("Error while reading the character: " + e.getMessage());
         return ' ';
      }
   }

   public static long readLong(String prompt, String output) {
      return (long) readInt(prompt, output);
   }

   public static int readInt(String prompt, String output) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.flush();
    
      System.out.println(prompt);
      System.out.print(">>  ");
      try {
          String line = reader.readLine();
          int value = Integer.parseInt(line);
          System.out.println(output);
          return value;
      } catch (NumberFormatException e) {
         System.err.println("Invalid input: Please enter a valid integer.");
         return 0;
      } catch (Exception e) {
         System.err.println("Error while reading the integer: " + e.getMessage());
         return 0;
      }
   }

   public static float readFloat(String prompt, String output) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.flush();
    
      System.out.println(prompt);
      System.out.print(">>  ");
      try {
          String line = reader.readLine();
          float value = Float.parseFloat(line);
          System.out.println(output);
          return value;
      } catch (NumberFormatException e) {
         System.err.println("Invalid input: Please enter a valid float.");
         return 0;
      } catch (Exception e) {
         System.err.println("Error while reading the float: " + e.getMessage());
         return 0;
      }
   }

   public static double readDouble(String prompt, String output) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.flush();
    
      System.out.println(prompt);
      System.out.print(">>  ");
      try {
          String line = reader.readLine();
          double value = Double.parseDouble(line);
          System.out.println(output);
          return value;
      } catch (NumberFormatException e) {
         System.err.println("Invalid input: Please enter a valid double.");
         return 0;
      } catch (Exception e) {
         System.err.println("Error while reading the double: " + e.getMessage());
         return 0;
      }
   }
}

