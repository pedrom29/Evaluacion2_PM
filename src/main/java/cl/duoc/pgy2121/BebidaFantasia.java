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
public class BebidaFantasia extends Bebida{
    public String sabor;

    public BebidaFantasia() {
    }

    public BebidaFantasia(String sabor, String marca, int litro, int precio, int id) {
        super(marca, litro, precio, id);
        this.sabor = sabor;
    }
    
    
    
    
}
