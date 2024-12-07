
public class Pedidos extends Clientes {
    
    public int can_ped, ped_total;

    public Pedidos() {
    }

    public Pedidos(int can_ped, int ped_total) {
        this.can_ped = can_ped;
        this.ped_total = ped_total;
    }

    public Pedidos(int can_ped, int ped_total, String nombre, String apellido) {
        super(nombre, apellido);
        this.can_ped = can_ped;
        this.ped_total = ped_total;
    }

    public int getCan_ped() {
        return can_ped;
    }

    public void setCan_ped(int can_ped) {
        this.can_ped = can_ped;
    }

    public int getPed_total() {
        return ped_total;
    }

    public void setPed_total(int ped_total) {
        this.ped_total = ped_total;
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
    
    public void entregas(){
        
        int aux=can_ped;
        
        ped_total=can_ped;
        
        if(aux!=can_ped){
            ped_total=ped_total+can_ped;            
        }
    }
    
    public String s(String sn){
                
        return sn + "\n"+
               "Cantidad Pedidos por cliente: " + can_ped+
               "Pedidos en total a entregar: " + ped_total;
        
    }
    
}
