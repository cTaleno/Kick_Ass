/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tablero;

/**
 *
 * @author Jacob Ramirez
 */
public class Cartas_Especiales extends Carta_Maestra{

    private static Cartas_Especiales[] CTomaDos;
    private static Cartas_Especiales[] CReversa;
    private static Cartas_Especiales[] CSalta;
    private static Cartas_Especiales[] CComodinColor;
    private static Cartas_Especiales[] CComodinTomaCuatro;

    public Cartas_Especiales(Color A, int B){
        super(A,B);
    }

    public void Crear_Cartas_Especiales(){
        Barajas_TomaDos();
        Barajas_Reversa();
        Barajas_Salta();
        Barajas_ComodinColor();
        Barajas_ComodinTomaCuatro();
    }

    private void Barajas_TomaDos(){
        for(int A=0; A<8;A++){
            if(A==0 || A==1){
                CTomaDos[A]=new Cartas_Especiales(Color.NEGRO, 10);
            }else if(A==2 || A==3){
                CTomaDos[A]=new Cartas_Especiales(Color.VERDE, 10);
            }else if(A==4 || A==5){
                CTomaDos[A]=new Cartas_Especiales(Color.PURPURA, 10);
            }else if(A==6 || A==7){
                CTomaDos[A]=new Cartas_Especiales(Color.ROJO, 10);
            }
        }

        for(int B=0; B<8; B++){
            BarajaInicial.add(CTomaDos[B].TipodeColor);
            BarajaInicial.add(CTomaDos[B].NumerodeCarta);
        }
    }

     private void Barajas_Reversa(){
        for(int A=0; A<8;A++){
            if(A==0 || A==1){
                CReversa[A]=new Cartas_Especiales(Color.NEGRO, 11);
            }else if(A==2 || A==3){
                CReversa[A]=new Cartas_Especiales(Color.VERDE, 11);
            }else if(A==4 || A==5){
                CReversa[A]=new Cartas_Especiales(Color.PURPURA, 11);
            }else if(A==6 || A==7){
                CReversa[A]=new Cartas_Especiales(Color.ROJO, 11);
            }
        }

        for(int B=0; B<8; B++){
            BarajaInicial.add(CReversa[B].TipodeColor);
            BarajaInicial.add(CReversa[B].NumerodeCarta);
        }
    }

    private void Barajas_Salta(){
        for(int A=0; A<8;A++){
            if(A==0 || A==1){
                CSalta[A]=new Cartas_Especiales(Color.NEGRO, 12);
            }else if(A==2 || A==3){
                CSalta[A]=new Cartas_Especiales(Color.VERDE, 12);
            }else if(A==4 || A==5){
                CSalta[A]=new Cartas_Especiales(Color.PURPURA, 12);
            }else if(A==6 || A==7){
                CSalta[A]=new Cartas_Especiales(Color.ROJO, 12);
            }
        }

        for(int B=0; B<8; B++){
            BarajaInicial.add(CSalta[B].TipodeColor);
            BarajaInicial.add(CSalta[B].NumerodeCarta);
        }
    }

    private void Barajas_ComodinColor(){
        for(int A=0; A<4;A++)
            CComodinColor[A]=new Cartas_Especiales(Color.NEGRO, 13);

        for(int B=0; B<4; B++){
            BarajaInicial.add(CComodinColor[B].TipodeColor);
            BarajaInicial.add(CComodinColor[B].NumerodeCarta);
        }
    }

    private void Barajas_ComodinTomaCuatro(){
        for(int A=0; A<4;A++)
            CComodinTomaCuatro[A]=new Cartas_Especiales(Color.NEGRO, 14);

        for(int B=0; B<4; B++){
            BarajaInicial.add(CComodinTomaCuatro[B].TipodeColor);
            BarajaInicial.add(CComodinTomaCuatro[B].NumerodeCarta);
        }
    }

}
