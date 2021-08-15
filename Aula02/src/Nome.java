import java.util.Scanner;

public class Nome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome;
        String sobrenome;
        System.out.println("Digite o seu nome:");
        nome=scanner.nextLine();
        System.out.println("Digite o seu sobrenome:");
        sobrenome = scanner.nextLine();
      
        System.out.println("Digite o dia do seu niver:");
        int dia=scanner.nextInt();
        System.out.println("Digite o mês do seu niver:");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano do seu niver:");
        int ano = scanner.nextInt();

        String aniversarioFormatado= dataFormatada(dia,mes,ano);

        System.out.println("Iniciais do seu nome:"+ nome.charAt(0)+ sobrenome.charAt(0));
        System.out.println("Sua data de nascimento é: " + aniversarioFormatado);


    
       


    }

    static String dataFormatada(int dia, int mes, int ano){
        return dia+"/"+mes+"/"+ano;
    }
}

