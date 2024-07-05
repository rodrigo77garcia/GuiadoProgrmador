import javax.swing.*;
import java.util.Scanner;
public class P0214Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira uma palavra: ");
        String input = scanner.nextLine();

        if (input.length() > 0) { // testa presença de argumentos
            switch(input.charAt(0)) {// avalia 1º argumento para inteiro
                case 'a': //argumento com primeira inicial minuscula ou maiscula
                case 'A':
                    System.out.println("Vogal A.");
                    break;
                case 'e': //argumento com inicial minuscula ou maiscula
                case 'E':
                    System.out.println("Vogal E.");
                    break;
                case 'i': //argumento com inicial minuscula ou maiscula
                case 'I':
                    System.out.println("Vogal I.");
                    break;
                case 'o': //argumento com inicial minuscula ou maiscula
                case 'O':
                    System.out.println("Vogal O.");
                    break;
                case 'u': //argumento com inicial minuscula ou maiscula
                case 'U':
                    System.out.println("Vogal U.");
                    break;
                default: // inicial não é uma vogal
                    System.out.println("Não é uma vogal.");
            }

        }
        else{
            System.out.println("Não foi fornecido argumento.");
        }
    }
}
