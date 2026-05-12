# GestorBibliotecaJAVA
Parcial 1 de Interfaz Gráfica, IES. Aplicación CLI para gestión de materiales de biblioteca, con Java.

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

## Uso de IA/ herramientas externas
Conversación con Gemini durante el proceso del proyecto: [Gemini](https://gemini.google.com/share/c7f900201371)