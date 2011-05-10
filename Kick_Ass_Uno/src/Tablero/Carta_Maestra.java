/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

import java.util.ArrayList;

/**
 *
 * @author Jacob Ramirez
 */
public class Carta_Maestra {

    public enum Color {NEGRO,VERDE,PURPURA,ROJO}

    protected Color TipodeColor;
    protected int NumerodeCarta;
    protected Cartas_Numericas Numericas;
    protected Cartas_Especiales Especiales;
    protected static ArrayList BarajaInicial = new ArrayList(108);

    public Carta_Maestra(){
        Numericas.Crear_Cartas_Numericas();
        Especiales.Crear_Cartas_Especiales();
    }

    public Carta_Maestra(Color A, int B){
        TipodeColor = A;
        NumerodeCarta = B;

    }

}
