/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author marin
 */
public class PruebaUno {
    
    protected int temp;
    
    public PruebaUno (int valor){
        this.temp = valor;
    }
    
    public void cambiar (int valor){
        this.temp = valor;
    }
    
    public String aCadena() {
        return "estoy en la superclase con valor " + temp;
    }
}
