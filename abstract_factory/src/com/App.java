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
public class App {
    public static void main(String args[]) {
        TiendaMuebles tiendaMuebles = new TiendaMuebles("Victoriano");
        
        tiendaMuebles.encargar("Silla", "Kagar, Alemania");
    }
}
