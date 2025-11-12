public class DiscoDuro extends DispositivoDeAlmacenamiento {
   
   private final double velocidadRotacion;
   private String Brand;
   
   
   
    public DiscoDuro (String nombre, String capacidad, double velocidadRotacion) {
        super(nombre, capacidad,"Disco Duro");
        this.velocidadRotacion = velocidadRotacion;
    }

    @Override
    public void gírarDisco() {
        System.out.println("Disco Duro girando... (a " + this.velocidadRotacion + "rpm)");
    }

    @Override
    public void escribirDatos(String datos) {
        System.out.println("Escribiendo en el Disco Duro (con cabezal magnético):" + datos);
        this.contenido = datos;
    }

    @Override
    public String leerDatos() {
        System.out.print("Leyendo datos del Disco Duro (con cabezal magnético):");
        return this.contenido;


        
    }

    public double getVelocidadRotacion() {
        return velocidadRotacion;
    }

}