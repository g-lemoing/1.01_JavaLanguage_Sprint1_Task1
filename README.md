<b>Descripció</b>

https://github.com/g-lemoing/1.01_JavaLanguage_Sprint1_Task1/tree/masterSe entregan los niveles 1 y 2 de la tarea.
Nivel 1 - Ejercicio 1:
  Se crea una clase abtracta Instrument con 3 subclases según su tipo (viento, cuerda, percusión).
  En cada una, un bloque estático permite mostrar por la consola cuando se carga la clase, e inicializar el atributo estático del tipo de instrumento.
  Cada subclase implementa el método abstracto tocar() de la clase Instrumento.

  En la clase Main, comprobamos que cada clase se carga una sola vez, y puede ser por crear la primera instancia de cada subclase o al acceder a su miembro estático.

Nivel 1 - Ejercicio 2:
  La clase Car contiene dos atributos estáticos: la marca y el modelo. La marca es además final, por tanto es una constante.
  El tercer atributo Potencia no es estático pero sí final, con lo que no se puede modificar, pero sí instanciar.
  En el Main, comprobamos que si intentamos modificar el valor de los atributos finales, da error al compilar.
  En cambio, sí que se puede modificar el valor del modelo, pero logicamente, afecta a todas las instancias de la clase.

  El método estático frenar() se invoca desde la misma clase mientras que el no estático accelerar() se invoca desde una instancia de esa clase.

Nivel 2 - Ejercicio 1:
  La clase Phone tiene dos atributos, y un método trucar() que recibe como parámetro el número de teléfono en string, y tiene como acción enseñarlo en la consola.
  La subclase Smartphone hereda de la clase Phone e implementa dos métodos (fotografiar() y alarma()) definidos en sendos interfaces Camera y Rellotge.
  Comprobamos en el Main que creamos un objeto Smartphone, e invoquem correctamente los 3 métodos: trucar(), fotografiar() y alarma().
  
Tecnologies Utilitzades : IDE IntelliJ Idea v 2024.2.1, Java, SDK openjdk-22 Oracle OpenJDK 22.0.2
Requisits: SDK openjdk-22 Oracle OpenJDK 22.0.2

Instal·lació: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/1.01_JavaLanguage_Sprint1_Task1.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.

Ejecución:
Localizar y abrir las classes Main de cada ejercicio, y ejecutarlas con el Run.

Contribuciones:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/1.01_JavaLanguage_Sprint1_Task1
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request
