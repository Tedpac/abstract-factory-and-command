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
public class ComandoPegar extends Comando {
    
    public ComandoPegar(Aplicacion aplicacion) {
        super(aplicacion);
    }
    
    public boolean ejecutar() {
        System.out.println("Se ejecutó el comando PEGAR.");
        
        super.guardarBackup();
        
        super.aplicacion.getTextArea().replaceSelection(super.aplicacion.getPortapapeles());
        
        return true;
    }
}
