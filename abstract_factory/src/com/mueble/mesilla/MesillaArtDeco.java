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
public class MesillaArtDeco implements Mesilla {
    
    @Override
    public void empaquetar() {
        System.out.println("Se empaquetó Mesilla Art Decó.");
    }
    
    @Override
    public void enviar(String destino) {
        System.out.println("Se envió Mesilla Art Decó a " + destino + ".");
    }
}
