package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop(15);

    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {
        Integer result = 0;
        while (result < num) {
            System.out.println(result + " < " + num + ". El proximo ciclo valdra: " + (result + 1));
            result++;
        }
    }
}