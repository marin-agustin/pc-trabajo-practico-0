/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author marin
 */
public class TestPruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        do {
            System.out.println("opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        System.out.println(metodo1());
                    } catch (Exception error) {
                        System.err.println("Excepcion en metodo()");
                        error.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        System.out.println(metodo2());
                    } catch (Exception error) {
                        System.err.println("Excepcion en metodo()");
                        error.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        System.out.println(metodo3());
                    } catch (Exception error) {
                        System.err.println("Excepcion en metodo()");
                        error.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        System.out.println(metodo3());
                    } catch (Exception error) {
                        System.err.println("Excepcion en metodo()");
                        error.printStackTrace();
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
            }
        } while (continuar);

    }

    private static int metodo1() {
        int valor = 0;

        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("42");
            valor = valor + 1;

            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException error) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final del finally: " + valor);
        }

        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    private static int metodo2() {
        int valor = 0;

        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;

            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException error) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final del finally: " + valor);
        }

        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    private static int metodo3() {
        int valor = 0;

        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;

            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException error) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor al final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final del finally: " + valor);
        }

        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    private static int metodo4() {
        int valor = 0;

        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;

            System.out.println("Valor al final del try: " + valor);
            throw new IOException();
        } catch (IOException error) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor al final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final del finally: " + valor);
        }

        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}
