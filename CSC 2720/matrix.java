import java.util.*;
import java.util.Scanner;
import java.util.Array;
import java.util.Arrays;
import java.util.Random;

public class matrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String cont; //To record if the User wants to continue the program or not 
        

        do{
            final long startTime = System.currentTimeMillis(); //Timer starts here
            System.out.print("Enter a dimension for matrix that is greater than 50: "); //Ask for Dimensions
            int dimensions = scan.nextInt();
            while(dimensions < 50){ //Makes suere the dimensions is greater than 50
                System.out.println("You entered a dimension less than 50!");
                System.out.print("Enter a dimension for matrix that is greater than 50: ");
                dimensions = scan.nextInt();
            }

            int[][] arr1 = new int[dimensions][dimensions]; //Creates the first Matrix
            int[][] arr2 = new int[dimensions][dimensions]; //Creates the Second Matrix
            int[][] res = new int[dimensions][dimensions]; //Creates the resulting Matrix
            
            for(int row = 0; row < arr1.length; row++){ //Assigns Random numbers to the First Matrix
                for(int col = 0; col < arr1[row].length; col++){
                    arr1[row][col] = rand.nextInt(50);
                }
            }

            for(int row = 0; row < arr2.length; row++){ //Assigns Random numbers to the Second Matrix
                for(int col = 0; col < arr2[row].length; col++){
                    arr2[row][col] = rand.nextInt(50);
                }
            }

            for(int i = 0; i < dimensions; i++){ //Multiples both the Matrices and stores the output in the array
                for(int j = 0; j < dimensions; j++){
                    res[i][j] = 0;
                    for(int k = 0; k < dimensions; k++){
                        res[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            } 

            System.out.println();
            System.out.println("Matrix 1 is as follows: "); 
            System.out.print("[");
            for(int i = 0; i < arr1.length; i++){ //Prints the First Matrix
                System.out.print("[");
                System.out.print(arr1[i][0]); //Prints the first number of the First Matrix
                for(int j = 1; j < arr1[i].length; j++){
                    System.out.print("," + arr1[i][j]); //Prints comma and the rest of the numbers in the Matrix
                    if(j == arr1[i].length-1 && i != arr1.length-1){
                        System.out.print("],"); //Prints a Square ending bracket at the end of each line
                    }else if(j == arr1[i].length-1 && i == arr1.length-1){
                        System.out.print("]]"); //Prints a Square ending bracket at the end of the Matrix
                    }
                }
                System.out.println();
            }

            System.out.println();

            System.out.println("Matrix 2 is as follows: ");
            System.out.print("[");
            for(int i = 0; i < arr2.length; i++){ //Prints the Second Matirx
                System.out.print("[");
                System.out.print(arr2[i][0]); //Prints the first number of the Second Matrix
                for(int j = 1; j < arr2[i].length; j++){
                    System.out.print("," + arr2[i][j]); //Prints comma and the rest of the numbers in the Matrix
                    if(j == arr2[i].length-1 && i != arr2.length-1){
                        System.out.print("],"); //Prints a Square ending bracket at the end of each line
                    }else if(j == arr2[i].length-1 && i == arr2.length-1){
                        System.out.print("]]"); //Prints a Square ending bracket at the end of the Matrix
                    }
                }
                System.out.println();
            }

            System.out.println();

            System.out.println("Result Matrix is as follows: ");
            System.out.print("[");
            for(int i = 0; i < res.length; i++){ //Prints the Resulting Matirx
                System.out.print("[");
                System.out.print(res[i][0]); //Prints the first number of the Resulting Matrix
                for(int j = 1; j < res[i].length; j++){
                    System.out.print("," + res[i][j]); //Prints comma and the rest of the numbers in the Matrix
                    if(j == res[i].length-1 && i != res.length-1){
                        System.out.print("],"); //Prints a Square ending bracket at the end of each line
                    }else if(j == res[i].length-1 && i == res.length-1){
                        System.out.print("]]"); //Prints a Square ending bracket at the end of the Matrix
                    }
                }
                System.out.println();
            }
            final long endTime = System.currentTimeMillis(); //Stores the end time
            System.out.println();
            System.out.println("Total execution times is...: " + (endTime-startTime) + "ms"); //Prints total execution time
            System.out.println();
            System.out.print("Would you like to continue(Yes/No): "); //Asks the user if they want to continue the program again
            cont = scan.next();
        }while(cont.equals("yes") || cont.equals("Yes")); //Record User's input
        System.out.println();
        System.out.println("Thank You!");
    }
}