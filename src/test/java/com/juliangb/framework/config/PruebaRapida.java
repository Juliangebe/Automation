package com.juliangb.framework.config;

public class PruebaRapida {
    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


        int inicio = 0;
        int nlimite = matriz.length - 1;
        int n = matriz.length;
        int contador = 1;


        while (contador <= ((n*n))) {
            for (int i = inicio; i <= nlimite; i++) {
                System.out.println(matriz[inicio][i]);
                contador++;

            }
            for (int i = inicio + 1; i <= nlimite; i++) {
                System.out.println(matriz[i][nlimite]);
                contador++;
            }
            for (int i = nlimite - 1; i >= inicio; i--) {
                System.out.println(matriz[nlimite][i]);
                contador++;
            }
            for (int i = nlimite - 1; i >= inicio + 1; i--) {
                System.out.println(matriz[i][inicio]);
                contador++;
            }

            inicio = inicio + 1;
            nlimite = nlimite - 1;
        }

    }

}






