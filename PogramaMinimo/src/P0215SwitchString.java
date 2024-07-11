import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class P0215SwitchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um comando (data, hora, nova-data, nova-hora): ");
        String input = scanner.nextLine();
        //if (args.length > 0){ // testa presença de argumentos
            switch (input.toLowerCase()){ // avalia texto do 1º argurmento em minusculas
                case "data":
                    System.out.println(DateFormat.getDateInstance().format(new Date())); // uso encadeado de métodos
                    break;
                case "hora":
                    System.out.println(DateFormat.getTimeInstance().format(new Date())); //uso encadeado de métodos
                    break;
                case "nova-data":
                    System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
                    break;
                case "nova-hora":
                    System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
                    break;
                default:
                    System.out.println("Comando não reconhecido.");
            }
//        }else {
//            System.out.println("Não foi fornecido argumento.");
        }
    }
//}
