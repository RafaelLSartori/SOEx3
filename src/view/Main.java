package view;

import controller.Exercicio3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Exercicio3 m = new Exercicio3();
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
        while (tamanho > 100){
            JOptionPane.showMessageDialog(null, "O vetor precisa ter no máximo 100 posições.");
            tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente o tamanho do vetor: "));
        }
        int[] vet = new int[tamanho];
        m.exTres(vet);
    }
}