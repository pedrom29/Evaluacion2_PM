/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author Pedro
 */
public interface BebidasInterfaz {
    double IVA = 0.19;
    double DESCUENTO_BEBIDA = 0.10;
    double DESCUENTO_VINO = 0.15;
    void porPagar();
    void descuentoProducto();
    
}
