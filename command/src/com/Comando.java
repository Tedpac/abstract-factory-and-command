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
public abstract class Comando {
    protected Aplicacion aplicacion;
    private String backup;
    
    public Comando(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }
    
    public void guardarBackup() {
        this.backup = this.aplicacion.getTextArea().getText();
    }
    
    public void deshacer() {
        this.aplicacion.getTextArea().setText(this.backup);
    }
    
    public abstract boolean ejecutar();
}
