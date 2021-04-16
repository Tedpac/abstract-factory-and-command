/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mueble.fabrica;

import com.mueble.mesilla.Mesilla;
import com.mueble.mesilla.MesillaVictoriana;
import com.mueble.silla.Silla;
import com.mueble.silla.SillaVictoriana;
import com.mueble.sofa.Sofa;
import com.mueble.sofa.SofaVictoriano;

/**
 *
 * @author Nicolás
 */
public class FabricaMueblesVictorianos implements FabricaMuebles {
    
    @Override
    public Mesilla crearMesilla() {
        return new MesillaVictoriana();
    }
    
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }
    
    @Override
    public Sofa crearSofa() {
        return new SofaVictoriano();
    }
}
