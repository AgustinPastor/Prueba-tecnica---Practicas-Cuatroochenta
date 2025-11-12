public class BlueRay extends DispositivoDeAlmacenamiento {
   
   private final double velocidadGiro;
      private String Brand;

   
   
    public BlueRay (String nombre, String capacidad, double velocidadGiro) {
        super(nombre, capacidad,"BlueRay");
        this.velocidadGiro = velocidadGiro;
    }

    @Override
    public void gírarDisco() {
        System.out.println("BlueRay girando... (a " + this.velocidadGiro + "rpm)");
    }

    @Override
    public void escribirDatos(String datos) {
        System.out.println("Escribiendo en BlueRay (con láser azul de alta precisión):" + datos);
        this.contenido = datos;
    }

    @Override
    public String leerDatos() {
        System.out.print("Leyendo datos del CD (usando láser):");
        return this.contenido;
    }

    public double getVelocidadLectura() {
        return velocidadGiro;
    }

}