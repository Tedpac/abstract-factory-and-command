/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mueble.silla;

/**
 *
 * @author Nicolás
 */
public class SillaModerna implements Silla {
    
    @Override
    public void empaquetar() {
        System.out.println("Se empaquetó Silla Moderna.");
    }
    
    @Override
    public void enviar(String destino) {
        System.out.println("Se envió Silla Moderna a " + destino + ".");
    }
}
