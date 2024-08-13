package controller;
import java.util.Random;

public class Exercicio3{
    public Exercicio3(){
        super();
    }
    Random random = new Random();
    public void exTres(int[] vet){

        for (int i: vet) {
            int num = random.nextInt(100);
            if (num % 2 != 0){
                System.out.println("O número "+num+" é ímpar.");
            } else if (num % 10 == 0){
                System.out.println("O número "+num+" é par e múltiplo de 10.");
            }
        }
    }
}
