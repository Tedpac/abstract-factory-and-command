/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mueble.fabrica;

import com.mueble.mesilla.Mesilla;
import com.mueble.mesilla.MesillaModerna;
import com.mueble.silla.Silla;
import com.mueble.silla.SillaModerna;
import com.mueble.sofa.Sofa;
import com.mueble.sofa.SofaModerno;

/**
 *
 * @author Nicolás
 */
public class FabricaMueblesModernos implements FabricaMuebles {
    
    @Override
    public Mesilla crearMesilla() {
        return new MesillaModerna();
    }
    
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }
    
    @Override
    public Sofa crearSofa() {
        return new SofaModerno();
    }
}
