/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author tayla
 */
public class AtividadeDois {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double alturaMaxima = -1.0;
            double alturaMinima = -1.0;
            
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a altura " + i + ": ");
                double altura = scanner.nextDouble();
                
                if (i == 1) {
                    alturaMaxima = altura;
                    alturaMinima = altura;
                } else {
                    if (altura > alturaMaxima) {
                        alturaMaxima = altura;
                    }
                    if (altura < alturaMinima) {
                        alturaMinima = altura;
                    }
                }
            }
            System.out.println("\nA altura máxima registrada é: " + alturaMaxima);
            System.out.println("A altura mínima registrada é: " + alturaMinima);
        }
    }
}
