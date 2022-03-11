/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_danaromero_22141150;

import java.awt.Color;

/**
 *
 * @author Dana Romero
 */
public class Auto {
    
    //Atributos
    protected int numIdentificador;
    protected int distanciaRecorrida;
    protected String nombreCorredor;
    protected Color color;
    int minV, maxV;
    
    //Constructor
    public Auto(int numIdentificador, int distanciaRecorrida, String nombreCorredor, Color color) {
        this.numIdentificador = numIdentificador;
        this.distanciaRecorrida = distanciaRecorrida;
        this.nombreCorredor = nombreCorredor;
        this.color = color;
    }

    public int getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador(int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
            
    
}
