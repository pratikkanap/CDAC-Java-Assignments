package Day2.Array;

public class Service1DArray {
        public static boolean isPrime(int num){
            for(int i = 2; i<num;i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
       
    }

    