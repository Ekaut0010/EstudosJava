public class ScreenMatch {
    public static void main (String[] args){
        System.out.println("Bem-Vindo ao Screen Match");
        System.out.println("FIlme: Top Gun: Maverick");

        int anoDeLançamento = 2022;
        System.out.println("Ano de Lançamento: "+ anoDeLançamento);
        double notaFilme = 8.1;
        double mediaFilme = (9.8 + 6.3 + 8.0)/3;
        System.out.printf("Nota: %s%n", notaFilme);
        System.out.printf("Média do Filme: %.2f \n", mediaFilme);
        int a = (int) mediaFilme / 2;

        System.out.println(a);



    }
}
