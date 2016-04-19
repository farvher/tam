/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.enumeration;

/**
 *
 * @author geotor
 */
public enum EGenero {

    MASCULINO('M'),
    FEMENINO('F');

    private char valor;

    EGenero(char valor) {
        this.valor = valor;
    }

    public char getValor() {
        return this.valor;
    }

    public static EGenero get(char valor) {
        for (EGenero v : values()) {
            if (v.valor == valor) {
                return v;
            }
        }
        return null;
    }
}
