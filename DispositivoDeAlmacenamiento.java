public abstract class DispositivoDeAlmacenamiento {
    protected String nombre;
    protected String capacidad;
    protected String tipoDeDisco;
    protected String contenido;

public DispositivoDeAlmacenamiento() {}

public DispositivoDeAlmacenamiento (String nombre, String capacidad, String tipoDeDisco) {
this.nombre = nombre;
this.capacidad = capacidad;
this.tipoDeDisco = tipoDeDisco;
this.contenido = "";
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoDeDisco() {
        return tipoDeDisco;
    }



public abstract void gírarDisco();
public abstract void escribirDatos(String datos);
public abstract String leerDatos();

public void reportarInformacion() {
    //got you!
System.out.println("----- Información del Dispositivo de Almacenamiento -----");
System.out.println("Nombre: " + this.nombre);
System.out.println("Capacidad: " + this.capacidad);
System.out.println("Tipo de Disco: " + this.tipoDeDisco);
System.out.println("Contenido: " + this.contenido);
System.out.println("-------------------------------------------------------");
} 


}
