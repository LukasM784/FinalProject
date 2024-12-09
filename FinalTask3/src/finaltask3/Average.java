/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finaltask3;
import java.util.Scanner;
/**
 *
 * @author macproavid
 */
public class Average {
    private int[] num;
    private double mean;
    
    public Average(){
        num = new int[5];
        Scanner input = new Scanner(System.in);
        
        for (int j = 0; j< num.length;j++){
            System.out.print("Enter score number" + (j+1)+":");
            num[j] = input.nextInt();
        }
        selectionSort();
        calculateMean();
    }
    public void calculateMean(){
        int total = 0;
        for (int i = 0; i < num.length; i++) {
               int score = num[i];
            total += score;
        }
        mean = total/num.length;
        
    }
    public String toString(){
        String result = "Scores (descending order):";
        for (int j = 0; j< num.length;j++){
            result += num[j];
            if(j < num.length - 1){
                result += ", ";    
            }
        }
        result += "\n Mean " + mean;
        return result;
    }
    public void selectionSort(){
        for(int j = 0; j <num.length - 1; j++){
            int maxIndex = j;
            for (int k = j + 1; k < num.length; k++){
                if (num[k] > num[maxIndex]){
                    maxIndex = k;
                }
            }
            int test = num[j];
            num[j] = num[maxIndex];
            num[maxIndex] = test;
        }
    }
}
