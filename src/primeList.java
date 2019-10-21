
import java.util.ArrayList;
import java.util.Scanner;

public class primeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        ArrayList<Integer> primeList = new ArrayList<>();
        int beginNumber = 2;
        while(beginNumber< input){
            if(isPrime(beginNumber)){
                primeList.add(beginNumber);
            }
            beginNumber++;
        }
        System.out.println("Array of Prime Numbers that lower than "+input+" : ");
        for (Integer integer : primeList) {
            System.out.println(integer);
        }
    }

    private static boolean isPrime(int in){
        if(in<2){
            return false;
        }else{
            for (int i = 2; i<= Math.sqrt(in);i++){
                if(in % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
