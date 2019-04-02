package tarea02labo;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    private Cliente cliente;
    private Producto producto;
    
    public static void menu() {
        ArrayList<ArrayList> factura = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Producto> listaProducto = new ArrayList<>();
        Cliente c = new Cliente();
        Producto p = new Producto();
        Scanner in = new Scanner(System.in);
        
        System.out.println("MENÚ" + "\nPresione 1 para agregar cliente");
        System.out.println("Presione 2 para agregar producto");
        System.out.println("Presione 3 para lista de productos" + "\nPresione 6 para calcular total");
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
                System.out.println("Nombre: " + c.getApellidosCliente() + "\nApellido: " + c.getApellidosCliente()+ "\nTelefono: "   + c.getTelefono());
                factura.add(listaClientes);
                //Funcion agregar producto; 
            }
            case 2:{
                System.out.println("Ingrese cantidad de prodcutos a ingresar");
                int productos = in.nextInt(); in.nextLine();
                for (int i = 0; i < productos; i++){
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
                factura.add(listaProducto);
                menu();
//                mostrarLista(factura, listaProducto);
//                System.out.println(factura);
                //Funcion agregar producto; 
                break;
            }
            case 3:{
                System.out.println("Yendo a ver lista de productos");
                mostrarLista(factura, listaProducto);
                //Funcion agregar producto; 
                break;
            }
            case 4:{    
                System.out.println("Yendo a calcular total");
                //Funcion agregar producto; 
                break;
            }
            case 5:{
                System.out.println("Yendo a ver la factura");
                //Funcion agregar producto; 
                break;
            }
            default:{
                System.out.println("Opción incorrecta, seleccione una opción válida");
                menu();
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
    
    public static void mostrarLista(ArrayList<ArrayList> factura, ArrayList<Producto> listaProducto){
        for (int i = 0; i < listaProducto.size(); i++){
            System.out.println("Producto " + (i+1) + ": " + listaProducto.get(i).getNombreProducto());
            System.out.println("Tipo " + (i+1) + ": " + listaProducto.get(i).getTipoProducto());
            System.out.print("Precio " + listaProducto.get(i).getPrecioProducto() + ", cantidad: " + listaProducto.get(i).getCantidadProducto());
        }
    }
    
    public static void darRecibo(){
        
    }
}
