/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Nicolás
 */
public class ComandoCopiar extends Comando {

    public ComandoCopiar(Aplicacion aplicacion) {
        super(aplicacion);
    }
    
    public boolean ejecutar() {
        System.out.println("Se ejecutó el comando COPIAR.");
        
        if (super.aplicacion.getTextArea().getSelectedText() != null) {
            super.aplicacion.setPortapapeles(super.aplicacion.getTextArea().getSelectedText());
        }
        
        return false;
    }
}
