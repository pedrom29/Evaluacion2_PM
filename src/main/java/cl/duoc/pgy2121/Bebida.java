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
public abstract class Bebida implements BebidasInterfaz {
    public String marca;
    public int litro, precio, id;    
    
    public Bebida(){
    }
    
    public Bebida(String marca, int litro, int precio, int id){
        this.marca = marca;
        this.litro = litro;
        this.precio = precio;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLitro() {
        return litro;
    }

    public void setLitro(int litro) {
        this.litro = litro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void porPagar(){
        throw new UnsupportedOperationException("Not supported");
    }
    
    @Override
    public void descuentoProducto(){
        throw new UnsupportedOperationException("Not supported");
    }
    
    @Override
    public String toString() {
        return "Bebida{" + "marca =" + marca + ", litro=" + litro + ", precio=" + precio +  ", id=" + id + '}';
    }
}
