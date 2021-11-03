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
public class BebidaAlcoholica extends Bebida{
    public int grados;

    public BebidaAlcoholica() {
    }
    
    public BebidaAlcoholica(int grados, String marca, int litro, int precio, int id) {
        super(marca, litro, precio, id);
        this.grados = grados;
    }
    
    
    
    
    
}
