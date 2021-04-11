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
public class ComandoBorrar extends Comando {

    public ComandoBorrar(Aplicacion aplicacion) {
        super(aplicacion);
    }
    
    public boolean ejecutar() {
        System.out.println("Se ejecutó el comando BORRAR.");
        
        super.guardarBackup();
        
        if (super.aplicacion.getTextArea().getSelectedText() != null) {
            super.aplicacion.getTextArea().replaceSelection("");
        } else {
            return false;
        }
        
        return true;
    }
}
