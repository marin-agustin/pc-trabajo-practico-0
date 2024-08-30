/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author marin
 */
public class RedefinicionUno extends PruebaUno {

    private int temp2;

    public RedefinicionUno(int valor) {
        super(valor);
        this.temp2 = valor * 7;
    }

    @Override
    public String aCadena() {
        return "ahora estoy en la subclase con valor " + temp;
    }

    public String aCadena2() {
        return "en la subclase con valor " + temp2;
    }
}
