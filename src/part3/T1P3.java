package part3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Write 100 random ints to a text file; one int per line. Use a try with
 * resources and a catch block as needed. Add a finally block that prints the
 * words "All done".
 *
 * @author Your name
 */
public class T1P3 {

    public static void main(String[] args) throws IOException
   {
      PrintWriter out = new PrintWriter(new File("random.txt"));
      Random rand = new Random();
      int number, count=0, countTwo=0;
      while(count<100)
      {
         while(countTwo<1)
         {
            number=rand.nextInt(100)+1;
            out.print(number);
            count++;
            countTwo++;
         }
         countTwo = 0;
         out.println();
      }
      System.out.println("All done");
      out.close();
  }
    
}
