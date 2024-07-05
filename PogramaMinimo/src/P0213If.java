public class P0213If {
    public static void main(String[] args) {
        if (args.length > 0) { // testa presença de argumentos
            // converte 1º argumento para inteiro
            int max = Integer.parseInt(args[0]);
            for (int j = 0; j < max; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\nFim da Contagem");
        }
        else
            System.out.println("Fim do Programa");
    }
}