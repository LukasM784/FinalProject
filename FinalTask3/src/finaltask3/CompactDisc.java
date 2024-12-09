/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltask3;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author macproavid
 */
public class CompactDisc {
    public static void main(String[] args)throws IOException {
      Scanner input = new Scanner(new File("Classics.txt"));
      String title;
      String artist;
      Song [] cd = new Song[6];
      // Declare an array of Song objects, called cd, // with
      //a size of 6
    for (int i = 0; i < cd.length; i++){
        title = input.nextLine();
        artist = input.nextLine();
        cd[i] = new Song(title,artist);
    }
         
         // Fill the array by creating a new song with
         // the title and artist and storing it in the
         // appropriate position in the array
    
      System.out.println("Contents of Classics:");
      for (int i = 0; i < cd.length; i++) {
          System.out.print(cd[i].toString());
         // Print the contents of the array to the console
      }
      input.close();
    }
}

