/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;
import java.util.Scanner;
/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese su nombre:");
        Cliente cliente = new Cliente();
        String nombre = s.nextLine();
        cliente.setNombre(nombre);
        int opcion = 0;
        Compra compra = new Compra();
        compra.setCliente(cliente.getNombre());
        System.out.println("Bienvenido "+nombre + " Cual es su orden");
        while(opcion != 4){
            System.out.println("1.-Ingresar Cantidad bebidas de fantasia");
            System.out.println("2.-Ingresar Cantidad Bebida alcoholica");
            System.out.println("3.-Ver detalle de pedido");
            System.out.println("4.-Salir");
            opcion = s.nextInt();
            if(opcion == 1){
                
                System.out.println("Ingrese cantidad bebidas de fantasia : ");
                Bebida pepsi = new Bebida( "Pepsi", (int) 2, 1900, 1) {};
                Bebida coca = new Bebida( "Coca", (int) 2, 1700, 2) {};
                Bebida fanta = new Bebida( "Fanta", (int) 2, 1600, 3) {};
                System.out.println("1.- " + pepsi.toString());
                System.out.println("2.- " + coca.toString());
                System.out.println("3.- " + fanta.toString());
                int selectedBebida = s.nextInt(); 
                if(selectedBebida == 1){
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    compra.agregarBebida(pepsi.getMarca());
                    int precio = (int) (compra.getTotal() + pepsi.getPrecio()); 
                    compra.setTotal(precio * cantidad);
                }
                
                if(selectedBebida == 2){
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    compra.agregarBebida(coca.getMarca());
                    int precio = (int) (compra.getTotal() + coca.getPrecio()); 
                    compra.setTotal(precio * cantidad);
                }        
                if(selectedBebida == 3){
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    compra.agregarBebida(fanta.getMarca());
                    int precio = (int) (compra.getTotal() + fanta.getPrecio()); 
                    compra.setTotal(precio * cantidad);
                }      
                
                
            }
            
            if(opcion == 2){
                System.out.println("Ingrese cantidad bebidas alcoholicas : ");
                Bebida vino = new Bebida( "Casillero del diablo", (int) 1, 15000, 8) {};
                Bebida cerveza = new Bebida( "Corona", (int) 1, 2000, 9) {};
                Bebida ron = new Bebida( "Barcelo", (int) 1, 7000, 10) {};
                System.out.println("1.- " + vino.toString());
                System.out.println("2.- " + cerveza.toString());
                System.out.println("3.- " + ron.toString());
                int selectedBebida = s.nextInt(); 
                
                if(selectedBebida == 1){
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    compra.agregarBebida(vino.getMarca());
                    int precio = (int) (compra.getTotal() + vino.getPrecio()); 
                    compra.setTotal(precio * cantidad);
                }
                
                if(selectedBebida == 2){
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    compra.agregarBebida(cerveza.getMarca());
                    int precio = (int) (compra.getTotal() + cerveza.getPrecio()); 
                    compra.setTotal(precio * cantidad);
                }        
                if(selectedBebida == 3){
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = s.nextInt();
                    s.nextLine();
                    compra.agregarBebida(ron.getMarca());
                    int precio = (int) (compra.getTotal() + ron.getPrecio()); 
                    compra.setTotal(precio * cantidad);
                }                
            }          
            
            if(opcion == 3){
                compra.mostrarDetalleCompra(compra);
            }           
        }
    }
}
                
       
    
    

