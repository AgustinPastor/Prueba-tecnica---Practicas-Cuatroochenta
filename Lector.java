public class Lector {   

public static void main(String[] args)
{
System.out.println("===Probando el dispositivo de almacenamiento===");
System.out.println();

DispositivoDeAlmacenamiento miCD =new CD("CD de música", "700MB", 500.8);
miCD.gírarDisco();
miCD.escribirDatos ("Pista 1.mp3, Pista 2.mp3, Pista 3.mp3");
System.out.println(miCD.leerDatos());
miCD.reportarInformacion();

System.out.println("\n============================\n");

System.out.println("===Probando el Disco Duro===");
 DispositivoDeAlmacenamiento miDiscoDuro = new DiscoDuro("Disco Externo Trabajo", "2TB", 7500.0);
miDiscoDuro.gírarDisco();
miDiscoDuro.escribirDatos("Documentos, Archivos de Programa, Imágenes");
System.out.println(miDiscoDuro.leerDatos());
miDiscoDuro.reportarInformacion();


System.out.println("\n============================\n");

System.out.println("===Probando el BlueRay===");
 DispositivoDeAlmacenamiento miBlueRay = new BlueRay("Lector BlueRay", "50GB", 8500.0);
miBlueRay.gírarDisco();
miBlueRay.escribirDatos("Prueba de nivel.pdf, Prueba de nivel.java");
System.out.println(miBlueRay.leerDatos());
miBlueRay.reportarInformacion();

}
}