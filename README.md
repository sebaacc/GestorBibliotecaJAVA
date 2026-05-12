# Gestor de biblioteca con Java
Parcial 1 de Interfaz Gráfica, IES. Aplicación CLI para gestión de materiales de biblioteca, con Java. Fecha: 13/05/26.

## Instrucciones de ejecución

### Opción con Netbeans
1. Descargar o clonar el proyecto. 
2. En Netbeans, ir a File &rarr; Open project &rarr; seleccionar proyecto "Parcial-Markoja" en la carpeta donde fue descargado, y luego &rarr; Open project.
3. Una vez cargado correctamente el proyecto, click en "Run" o presionar F6, para correr el proyecto en la terminal de Netbeans.

### Opción sin IDE en consola bash o cmd 
1. Abrir la carpeta del proyecto descargado, donde se encuentra el archivo *GestorBiblioteca.jar*.
2. Abrir con click derecho una nueva terminal bash, o llegar con cd y copiando/pegando la ruta donde está (en bash o cmd). 
2. Escribir en la terminal y ejecutar: 
```bash
java -jar GestorBiblioteca
```
### Funcionamiento del programa
Inicia con un saludo de bienvenida, y presenta en pantalla 6 opciones para realizar distintas acciones. Entre paréntesis los datos que se pide ingresar por consola:
1. Agregar libro (título, año de publicación, autor).
2. Listar libros.
3. Buscar libro (por título). 
4. Prestar material (por título).
5. Devolver material (por título).
6. Cerrar programa.

## Estructura del proyecto
Está organizado en 2 packages:
* com.biblioteca.ui
    - *Main* - clase donde está el main. 
* com.biblioteca.modelo
    - *MaterialBiblioteca* - clase abstracta que implementa la interfaz *Prestable*.
    - *Biblioteca* - clase que hereda *MaterialBiblioteca*.
    - *Libro* - clase que hereda *MaterialBiblioteca*.
    - *Prestable* - interfaz.

## Integrantes y rol de cada uno
- Sebastián Alejo, Markoja. Rol: Desarrollador.

## Desafíos encontrados
* Función *agregar libro*: Se corrigió un error en el ingreso de datos donde el programa omitía el campo "Título" después de capturar un valor numérico. El problema radicaba en el residuo del salto de línea en el buffer de Scanner. Se implementó una limpieza del buffer tras cada nextInt() para asegurar que las lecturas con nextLine(), de tipo String, se capturen correctamente.

* Cambio de ruta de Main class: Al renombrar el paquete de la interfaz de usuario (donde se encuentra la clase Main) a com.biblioteca.ui, ocurrió un problema al intentar ejecutar el proyecto. Fue necesario actualizar manualmente el path de la clase Main desde las propiedades del proyecto. Para configurarlo hay que seguir los siguientes pasos: File &rarr; Proyect Properties &rarr; Run &rarr; en el campo **Main Class** click en el botón Browse &rarr; seleccionar ruta del Main.

* Creación de archivo .jar y ejecución sin IDE: Tras la duda de cómo poder ejecutar el programa en una terminal Bash, por fuera de Netbeans, investigué con Gemini como realizarlo. Tuve que realizar los siguientes pasos:

1. Instalar en mi computadora el Binary zip archive de Maven desde su página oficial (ya que la terminal de Netbeans lo trae de forma nativa).
2. Luego configurar las variables de entorno de mi sistema operativo, agregando en "PATH" la ruta de la carpeta bin del Maven recientemente instalado.
3. Por el error "no main manifest attribute, in Parcial-Markoja-1.0-SNAPSHOT.jar", tuve que modificar el .pom del proyecto, agregar la sección de "build" justo debajo de donde terminan las "properties" con lo siguiente:
```xml
<build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.3.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <addClasspath>true</addClasspath>
                            <mainClass>com.biblioteca.ui.Main</mainClass>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
        </plugins>
    </build>
```
5. Finalmente para hacer un "Clean and Build", compilar el código y generar un archivo .jar dentro de la carpeta target; ejecuté lo siguiente en la terminal bash:
```bash
    mvn clean package
```

7. Para poder ejecutarlo en la terminal bash (en la carpeta donde se encuentra el archivo):
```bash
    java -jar GestorBiblioteca.jar
```

## Uso de IA/ herramientas externas
Conversación con Gemini durante el proceso del proyecto: [Gemini](https://gemini.google.com/share/c7f900201371)