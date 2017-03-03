/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author STyDE AdC
 */
public class TestPainting {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el titulo de la pintura");
        String pintura = teclado.next();
        System.out.println("tipos de artista");
        String artista = teclado.next();
        System.out.println("ingrese su precio");
        Integer precio = teclado.nextInt();

        Painting venta1 = new Painting(pintura, artista, precio);
        System.out.println(venta1.getPrecio() + " " + venta1.getArtista() + " " + venta1.getPintura());
        System.out.println("la comision por pintura es de " + venta1.getComision());
        Painting venta2 = new Painting(pintura, artista, precio);
        System.out.println(venta2.getPrecio() + " " + venta2.getArtista() + " " + venta2.getPintura());
        System.out.println("la comision por pintura es de " + venta2.getComision());
        Painting venta3 = new Painting();
        System.out.println(venta3.getPrecio() + " " + venta3.getArtista() + " " + venta3.getPintura());
        System.out.println("la comision por pintura es de " + venta3.getComision());

    }
}

