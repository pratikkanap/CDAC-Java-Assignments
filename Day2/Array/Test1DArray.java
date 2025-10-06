package Day2.Array;

import java.util.Scanner;

public class Test1DArray {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to check if it's prime: ");
            int num = sc.nextInt();
            if(Service1DArray.isPrime(num)){
                System.out.println("The Number is Prime");
            }
            else{
                System.out.println("The Number is not Prime");
            }
           
        }
    }

