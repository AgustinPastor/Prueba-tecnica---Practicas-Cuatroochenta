PRUEBA TÉCNICA - PRÁCTICAS CUATROOCHENTA

Este repositorio contiene la solución a la prueba técnica de POO, implementada con Java.

1. RESOLUCIÓN
   Se ha optado por utilizar un modelo de Herencia:
   · Clase Padre Abstracta (DispositivoDeAlmacenamiento):

   1. contiene las propiedades comunes: nombre, capacidad, tipoDeDisco y contenido.
   2. contiene los métodos abstractos: girarDisco(), escribirDatos() y leerDatos().
   3. contiene el método concreto: reportarInformacion.

   ·Clases hijas: CD, DiscoDuro y BlueRay, que heredan los atributos y métodos del padre.

2. REQUISITOS ESPECÍFICOS
   Revisando el documento PDF de la prueba en detalle, noté que había tres requisitos adicionales formateados como texto en blanco sólo visibles al seleccionar el texto:

   1. Atributo Brand en todas las clases hijas, sin getter ni setter.
   2. Método gírarDisco() con acento en la "i" de girar.
   3. Comentario "got you!". Lo he incluido dentro del método reportarInformacion() en la clase Padre Abstracta.

3. BONUS

   1. Clases BlueRay y Vinilo.
      · BlueRay encaja sin problemas en el modelo de herencia, ya que gira, lee y escribe. Por tanto, se ha añadido una clase BlueRay.java que hereda de la clase padre.
      · El vinilo no encaja bien ya que no podemos escribir en él (en el contexto de un usuario). El modelo obliga a todas las clases hijas a heredar el método escribirDatos() lo cual no sería correcto.

      Este problema resalta que un modelo de Interfaces sería lo correcto y más flexible, donde (dependiendo de las características de cada Objeto) se implementarían unas u otras.

   2. Ruedas y Frisbees
      · Lo mismo sucedería con estos dos objetos. No son dispositivos de almacenamiento por lo que carece de sentido heredar de la clase padre, ya que el único comportamiento que comparten es que giran.
      · La solución también pasaría por un modelo de interfaces, donde Rueda y Fresbee implementarían únicamente la interfaz girar.
