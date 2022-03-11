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
public class Convertible extends Auto{
    
    public Convertible(int numIdentificador, int distanciaRecorrida, String nombreCorredor, Color color) {
        super(numIdentificador, distanciaRecorrida, nombreCorredor, color);
        minV = 20;
        maxV = 200;
    }
    
    
    
}
