public class CD extends DispositivoDeAlmacenamiento {
   
   private final double velocidadLectura;
      private String Brand;

   
   
    public CD (String nombre, String capacidad, double velocidadLectura) {
        super(nombre, capacidad,"CD");
        this.velocidadLectura = velocidadLectura;
    }

    @Override
    public void gírarDisco() {
        System.out.println("CD girando... (a " + this.velocidadLectura + "rpm)");
    }

    @Override
    public void escribirDatos(String datos) {
        System.out.println("Escribiendo en CD (usando láser):" + datos);
        this.contenido = datos;
    }

    @Override
    public String leerDatos() {
        System.out.print("Leyendo datos del CD (usando láser):");
        return this.contenido;
    }

    public double getVelocidadLectura() {
        return velocidadLectura;
    }

}