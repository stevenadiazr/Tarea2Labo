package tarea02labo;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    private Cliente cliente;
    private Producto producto;
    
    public static void menu(ArrayList<ArrayList> factura, ArrayList<Producto> listaProducto, ArrayList<Cliente> listaClientes, int cantidadProductos) {
        Cliente c = new Cliente();
        Producto p = new Producto();
        Scanner in = new Scanner(System.in);
        
        System.out.println("MENÚ" + "\nPresione 1 para agregar cliente");
        System.out.println("Presione 2 para agregar producto");
        System.out.println("Presione 3 para lista de productos" + "\nPresione 4 para calcular total");
        System.out.println("Presione 5 para ver la factura");
        
        int opcion = in.nextInt(); in.nextLine();
        
        switch (opcion){
            case 1:{
                System.out.println("Ingrese nombres del cliente");
                c.setNombresCliente(in.nextLine());
                System.out.println("Ingrese apellidos del cliente");
                c.setApellidosCliente(in.nextLine());
                System.out.println("Ingrese numero telefonico del cliente");
                c.setTelefono(in.nextInt()); in.nextLine();
                listaClientes.add(c);
                factura.add(listaClientes);
                //Funcion agregar producto; 
            }
            case 2:{
                System.out.println("Ingrese cantidad de productos a ingresar");
                cantidadProductos = in.nextInt(); in.nextLine();
                for (int i = 0; i < cantidadProductos; i++){
                    System.out.println("Ingrese nombre del producto");
                    p.setNombreProducto(in.nextLine());
                    System.out.println("Ingrese tipo del producto");
                    p.setTipoProducto(in.nextLine());
                    System.out.println("Ingrese precio del producto");
                    p.setPrecioProducto(in.nextDouble()); in.nextLine();
                    System.out.println("Ingrese cantidad del producto");
                    p.setCantidadProducto(in.nextInt()); in.nextLine();
                    listaProducto.add(p);
                    
                }
                
                menu(factura, listaProducto, listaClientes, cantidadProductos);
//                mostrarLista(factura, listaProducto);
//                System.out.println(factura);
                //Funcion agregar producto; 
                break;
            }
            case 3:{
                factura.add(listaProducto);
                System.out.println("Yendo a ver lista de productos");
                mostrarLista(factura, listaProducto, listaClientes, cantidadProductos);
                //Funcion agregar producto; 
                break;
            }
            case 4:{    
                System.out.println("Yendo a calcular total");
                mostrarTotal(factura, listaProducto, listaClientes, cantidadProductos);
                //Funcion agregar producto; 
                break;
            }
            case 5:{
                System.out.println("Yendo a ver la factura");
                darRecibo(factura, listaProducto, listaClientes, cantidadProductos);
                //Funcion agregar producto; 
                break;
            }
            default:{
                System.out.println("Opción incorrecta, seleccione una opción válida");
                menu(factura, listaProducto, listaClientes, cantidadProductos);
                break;
            }
        }
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    
    public Cliente getCliente(){
        return cliente;
    }

//    
    
    public static void mostrarLista(ArrayList<ArrayList> factura, ArrayList<Producto> listaProducto, ArrayList<Cliente> listaClientes, int cantidadProductos){
        for (int i = 0; i < cantidadProductos; i++){
            System.out.print("Producto " + (i+1) + ": " + listaProducto.get(i).getNombreProducto());
            System.out.print(", tipo " + (i+1) + ": " + listaProducto.get(i).getTipoProducto());
            System.out.println(", precio " + listaProducto.get(i).getPrecioProducto() + ", cantidad: " + listaProducto.get(i).getCantidadProducto());
        }
        menu(factura, listaProducto, listaClientes, cantidadProductos);
    }
    
    public static void mostrarTotal(ArrayList<ArrayList> factura, ArrayList<Producto> listaProducto, ArrayList<Cliente> listaClientes, int cantidadProductos){
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++){
//            System.out.println("Producto " + (i+1) + ": " + listaProducto.get(i).getNombreProducto());
//            System.out.println("Tipo " + (i+1) + ": " + listaProducto.get(i).getTipoProducto());
//            System.out.print("Precio " + listaProducto.get(i).getPrecioProducto() + ", cantidad: " + listaProducto.get(i).getCantidadProducto());
            total += (listaProducto.get(i).getPrecioProducto() * listaProducto.get(i).getCantidadProducto());
        }
            System.out.println("El total es: " + total);
            menu(factura, listaProducto, listaClientes, cantidadProductos);
    }
    
    public static void darRecibo(ArrayList<ArrayList> factura, ArrayList<Producto> listaProducto, ArrayList<Cliente> listaClientes, int cantidadProductos){
        double total = 0;
        System.out.print("Cliente: " +  listaClientes.get(0).getNombresCliente() + listaClientes.get(0).getApellidosCliente());
        for (int i = 0; i < cantidadProductos; i++){
            System.out.print("Producto " + (i+1) + ": " + listaProducto.get(i).getNombreProducto());
            System.out.print(", tipo " + (i+1) + ": " + listaProducto.get(i).getTipoProducto());
            System.out.println(", precio " + listaProducto.get(i).getPrecioProducto() + ", cantidad: " + listaProducto.get(i).getCantidadProducto());
            total += (listaProducto.get(i).getPrecioProducto() * listaProducto.get(i).getCantidadProducto());
        }
        System.out.println("Total: " + total);
    }
}
