import java.util.Scanner;
public class P0212Dowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Valor inteiro inferior? ");
        int min = s.nextInt();
        System.out.print("Valor inteiro superior? ");
        int max = s.nextInt();
        do{
            System.out.println(min + " < " + max);
            min++; max--;
        }while (min < max);
        System.out.println(max + " == " + (min - 1) + " Condicao Final!");
    }
}
