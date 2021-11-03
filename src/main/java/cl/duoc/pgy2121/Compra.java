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
public class Compra {
    private String cliente;
    private String bebidas;
    private int total;

    

    public Compra(String cliente, String bebidas, int total) {
        this.cliente = cliente;
        this.bebidas = bebidas;
        this.total = total;
    }
    
    public Compra() {
    }
    
    public void agregarBebida(String bebidas){
        if(this.bebidas == null){
            this.bebidas = bebidas;
        }else{
            this.bebidas = this.bebidas + ";" + bebidas;
        }
    }
    
    
    
    public void mostrarDetalleCompra(Compra compra){
        System.out.println("Estimado " + compra.getCliente()+" Su pedido es el siguiete:");
        String[] bebidaArray = compra.getBebidas().split(";");
        for(int i = 0; i < bebidaArray.length; i++) {
            System.out.println(bebidaArray[i]);
        }
        System.out.println("Total Compra: " + compra.getTotal());
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebida(String bebidas) {
        this.bebidas = bebidas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    
    
}
