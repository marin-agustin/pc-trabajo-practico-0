/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author marin
 */
public class RedefinicionStatic extends PruebaStatic {
    public static String aCadena(){
        return super.aCadena() + "estoy en la subclase";
    }
}
