import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
    
        String linha = scanner.nextLine();

        String[] partes = linha.split(" ");
        String nome = "";
        int idade = 0;

        if (partes.length == 2) {
            nome = partes[0];
            idade = Integer.parseInt(partes[1]);
        }else if (partes.length == 1) {
            idade = Integer.parseInt(partes[0]);
        }

        if (!nome.isEmpty() && idade >= 18){
            System.out.println("Cadastro aprovado");
        }else {
            System.out.println("Cadastro reprovado");
        }
        scanner.close();
    }

}
