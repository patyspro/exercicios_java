
import  java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int num1;
        System.out.println("Insira um número:");
        num1 = scanner.nextInt();
        boolean verifica = primo(num1);
        System.out.println(verifica);

    }
    static boolean primo(int number){
        int resultado =0;
        for(int i = 2; i <= number/2; i++){
            if(number%i == 0) {
                resultado++;
                break;}
        }
        if(resultado == 0){
            return true;
        }
        else{
            return false;
        }
    }
}



