/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mueble.mesilla;

/**
 *
 * @author Nicolás
 */
public class MesillaVictoriana implements Mesilla {
    
    @Override
    public void empaquetar() {
        System.out.println("Se empaquetó Mesilla Victoriana.");
    }
    
    @Override
    public void enviar(String destino) {
        System.out.println("Se envió Mesilla Victoriana a " + destino + ".");
    }
}
