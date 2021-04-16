/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mueble.fabrica;

import com.mueble.mesilla.Mesilla;
import com.mueble.silla.Silla;
import com.mueble.sofa.Sofa;

/**
 *
 * @author Nicolás
 * 
 * Esta es la fábrica abstracta. Sus métodos deben hacer referencia a
 * interfaces y no a objetos concretos.
 */
public interface FabricaMuebles {
    Mesilla crearMesilla();
    Silla crearSilla();
    Sofa crearSofa();
}
