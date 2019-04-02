package tarea02labo;



public class Cliente {
    private String nombresCliente;
    private String apellidosCliente;
    private int telefono;

    public Cliente() {
    }
    
    public Cliente(String nombresCliente, String apellidosCliente, int telefono) {
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.telefono = telefono;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
        
    
}
