public class Exercicio09 {
    public static void main (String[] args){
        int var1 = 0;
        int var2 = 1;

        System.out.println(var1 + " ");

        while (var2 <= 100){
            System.out.println(var2 + " ");

            var2 = var2 + var1;
            var1 = var2 - var1;
        }
        System.out.println(var2);
    }
    
}
