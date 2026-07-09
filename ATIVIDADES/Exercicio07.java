public class Exercicio07 {
    public static void main (String[] args) {
        int anterior = 0;
        int atual = 1;

        System.out.print(anterior + " ");

        while (atual <= 100){
            System.out.print(atual + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        //imprimir o proximo que passou de 100
        System.out.print(atual);
        System.out.println();
    }
    
}
