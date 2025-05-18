import java.util.Scanner;

public class LABS {
 
        public static void main(String[] args) {
            String[] myMonths = {"January","Febuaray","March","April","May","June","July","August","September","Octuber","November","December"};           
            double[] myList = new double[12];
            for(int i= 0; i< myList.length; i++) {
                myList[i] = Math.random() * 100.0;
            }
            System.out.println(myMonths);
            System.out.println(myList);
           
        }
         
    }
