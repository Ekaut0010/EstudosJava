import java.util.Scanner;

public class DesafioTemperatura {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a temperatura (°C)?");
        double tempCelcius = input.nextDouble();
        double tempF = (tempCelcius*1.8) + 32;
        System.out.printf("A temperatura em Fahrenheit é %.1f", tempF);
        input.close();
    }
}
