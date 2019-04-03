package tarea02labo;

import java.util.ArrayList;

public class Tarea02Labo {
    public static void main(String[] args) {
        ArrayList<ArrayList> factura = new ArrayList<>();
        ArrayList<Producto> listaProducto = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Menu.menu(factura, listaProducto, listaClientes, 0);
    }
    
}
