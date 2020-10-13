
package gimnasio;

//(sin comentarios)*se ofende*.

public class Gimnasio {
    
    private String nombre;
    private int precioDeSuscripcion;
    private String nombreDelInstructor;
    private Boolean atencion;
    private int cantidadDeClientes;
    private Boolean maquinasDeMantenimiento;

    public Gimnasio(String nombre, int precioDeSuscripcion, String nombreDelInstructor, Boolean atencion, int cantidadDeClientes, Boolean maquinasDeMantenimiento) {
        this.nombre = nombre;
        this.precioDeSuscripcion = precioDeSuscripcion;
        this.nombreDelInstructor = nombreDelInstructor;
        this.atencion = atencion;
        this.cantidadDeClientes = cantidadDeClientes;
        this.maquinasDeMantenimiento = maquinasDeMantenimiento;
        
    }
    
    
    // Este nuevo metodo nos va a definir el precio de suscripcion, la cantidad de clientes y las maquinas de mantenimiento y atencion
    
    public void datosGenerales(){
    this.precioDeSuscripcion = 42000;
    this.cantidadDeClientes += 2;
    this.maquinasDeMantenimiento = true;
    this.atencion = false;    
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioDeSuscripcion() {
        return precioDeSuscripcion;
    }

    public void setPrecioDeSuscripcion(int precioDeSuscripcion) {
        this.precioDeSuscripcion = precioDeSuscripcion;
    }

    public String getNombreDelInstructor() {
        return nombreDelInstructor;
    }

    public void setNombreDelInstructor(String nombreDelInstructor) {
        this.nombreDelInstructor = nombreDelInstructor;
    }

    public Boolean getAtencion() {
        return atencion;
    }

    public void setAtencion(Boolean atencion) {
        this.atencion = atencion;
    }

    public int getCantidadDeClientes() {
        return cantidadDeClientes;
    }

    public void setCantidadDeClientes(int cantidadDeClientes) {
        this.cantidadDeClientes = cantidadDeClientes;
    }

    public Boolean getMaquinasDeMantenimiento() {
        return maquinasDeMantenimiento;
    }

    public void setMaquinasDeMantenimiento(Boolean maquinasDeMantenimiento) {
        this.maquinasDeMantenimiento = maquinasDeMantenimiento;
    }
    
     
        
    public static void main(String[] args) {
        Gimnasio cross = new Gimnasio("Arroyito", 42000, "Dani", true, 20, false);
        
        System.out.println(cross.getPrecioDeSuscripcion());
        System.out.println(cross.getCantidadDeClientes());
        System.out.println(cross.getMaquinasDeMantenimiento());
        System.out.println(cross.getAtencion());
        
        
        cross.datosGenerales();
        
        System.out.println(cross.getPrecioDeSuscripcion());
        System.out.println(cross.getCantidadDeClientes());
        System.out.println(cross.getMaquinasDeMantenimiento());
        System.out.println(cross.getAtencion());        
        
    }
    
}
