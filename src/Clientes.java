
public class Clientes {
    
    public String nombre, apellido;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String Salida(){
        
        return "Usuario "+ nombre + apellido;
        
    }
    
}
