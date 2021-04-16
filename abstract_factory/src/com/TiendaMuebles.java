/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.mueble.Mueble;
import com.mueble.fabrica.FabricaMuebles;
import com.mueble.fabrica.FabricaMueblesArtDeco;
import com.mueble.fabrica.FabricaMueblesModernos;
import com.mueble.fabrica.FabricaMueblesVictorianos;

/**
 *
 * @author Nicolás
 */
public class TiendaMuebles {
    // Referencia a la fábrica abstracta y no a una fábrica concreta.
    private FabricaMuebles fabricaMuebles;
    
    public TiendaMuebles(String tipoMueble) {
        switch (tipoMueble) {
            case "Art Decó":
                fabricaMuebles = new FabricaMueblesArtDeco();
                break;
            case "Moderno":
                fabricaMuebles = new FabricaMueblesModernos();
                break;
            case "Victoriano":
                fabricaMuebles = new FabricaMueblesVictorianos();
                break;
        }
    }
    
    public void encargar(String mueble, String destino) {
        // En ningún lado se específica la clase concreta de ningún objeto.
        
        Mueble encargo = null;
        
        switch (mueble) {
            case "Mesilla":
                encargo = this.fabricaMuebles.crearMesilla();
                break;
            case "Silla":
                encargo = this.fabricaMuebles.crearSilla();
                break;
            case "Sofá":
                encargo = this.fabricaMuebles.crearSofa();
                break;
        }
        
        if (encargo != null) {
            encargo.empaquetar();
            encargo.enviar(destino);
        } else {
            System.out.println("No se puede realizar el encargo.");
        }
    }
}
