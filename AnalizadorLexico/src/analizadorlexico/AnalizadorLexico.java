
package analizadorlexico;

import java.util.Arrays;
import java.util.Scanner;


public class AnalizadorLexico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu cadena de texto");
        regresarCadenaConCordenada(regresarCadenasinCordenada(regresarCadenaConCordenada(regresarCadenasinCordenada(regresarCadenaConCordenada(regresarCadenasinCordenada(scanner.nextLine()))))));
        
    }

    public static String regresarCadenasinCordenada(String cadena) {
        if (cadena.charAt(0) == '(') {
            cadena = cadena.substring(1);
            String cadenaCordenadaUno = "";
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) != ')') {
                    cadenaCordenadaUno = cadenaCordenadaUno.concat(String.valueOf(cadena.charAt(i)));
                } else {
                    if (!cadenaCordenadaUno.matches("[0-9, /,]+")) {
                        System.out.println("Formato erroneo, favor de verificar.");
                    } else {
                        cadena = cadena.replaceAll(cadenaCordenadaUno, "");
                        cadena = cadena.substring(1);
                        System.out.print("(" + cadenaCordenadaUno + ") ");
                        cadenaCordenadaUno = "";
                        break;
                    }
                }
            }
        } else {
            System.out.println("Formato erroneo, favor de verificar.");
        }
        return cadena;
    }

    public static String regresarCadenaConCordenada(String cadena) {
        String cadenaCordenadaUno = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != '(') {
                cadenaCordenadaUno = cadenaCordenadaUno.concat(String.valueOf(cadena.charAt(i)));
            } else {
                cadena = cadena.replaceAll(cadenaCordenadaUno, "");
                System.out.print(cadenaCordenadaUno);
                System.out.println("");
                cadenaCordenadaUno = "";
                break;
            }
        }
        System.out.print(cadenaCordenadaUno);
        System.out.println("");
        return cadena;
    }
}
