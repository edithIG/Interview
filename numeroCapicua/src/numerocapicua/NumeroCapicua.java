/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerocapicua;

import java.util.Scanner;

public class NumeroCapicua {

    public static void main(String[] args) {
        int numero, aux, inverso= 0, cifra;
         Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un numero entero");
            numero = sc.nextInt();
            aux=numero;
      
      
        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;

        }
      
        if (numero == inverso) {
            System.out.println("El numero es capicúa" + " " + aux + inverso );
        } else {
            System.out.println("El numeor no es capicúa");
        }
    }
}

