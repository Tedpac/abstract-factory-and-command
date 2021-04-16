/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mueble.sofa;

/**
 *
 * @author Nicolás
 */
public class SofaVictoriano implements Sofa {
    
    @Override
    public void empaquetar() {
        System.out.println("Se empaquetó Sofá Victoriano.");
    }
    
    @Override
    public void enviar(String destino) {
        System.out.println("Se envió Sofá Victoriano a " + destino + ".");
    }
}
