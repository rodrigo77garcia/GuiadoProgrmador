public class P0203Escopo { // iniciio do bloco 0
    public static void main (String[] args) { // inicio do bloco 1
        int i = 5; // Variavel do bloco 1
        int j;
        { // inicio do bloco 2
            j = 0;
            System.out.println(i); // uso do i dentro do escopo
            j = 5 * i; // Uso do j dentro do seu escopo
            System.out.println(j);
            { // Inicio do bloco 3
                System.out.println(i); // uso do i dentro do seu escopo
                System.out.println(j); // uso do j dentro do seu escopo


            }
        }
        System.out.println(i); // uso do i dentro do seu escopo
        System.out.println(j); //Erro!uso do j Fora do seu escopo
    }
}
