# Bazar
API Rest con SpringBoot que conecta a una base de datos H2. 
La API permite realizar consultas CRUD(Cread, Read, Update, Delete) de las clases "VENTA", 
"PRODUCTO" y "CLIENTE", así como otras operaciónes personalizadas.
Un curso puede contener varios temas (relación 1 a muchos @OneToMany)

 ### 🖥️ Tecnologías Utilizadas:
* Java 17
* Spring Boot: 2.7.13
* Spring Boot Data JPA
* Spring Boot Starter Web
* H2 Database
* Lombok
* MySQL Driver
* Postman
* IDE NetBeans
 
 ### Este programa permite realizar las siguientes consultas 
 * CRUD de las mascotas (Alta, Modificación, Lectura)
 * Listado de cursos que contengan la palabra "java"
 * Listado de temas de un curso (Patron DTO)
 * Crear temas y asociar a un curso. 
 * Modificar los datos de un tema.

 ### EndPoints cursos
 * GET      localhost:3500/cursos/traer
 * POST     localhost:3500/cursos/crear
 * PUT      localhost:3500/cursos/editar
 * GET      localhost:3500/cursos/temas/{id} DTO
 * GET      localhost:3500/cursos/java

 ### EndPoints temas
 * POST     localhost:3500/temas/crear
 * PUT      localhost:3500/temas/editar

 ### Instalación

##### Clona o descarga el repositorio.
##### Importa el proyecto a tu IDE (NetBeans, Eclipse, Intellij)
##### Ejecuta el archivo CursosApplication.java desde tu IDE.
##### Abre Postman e importa la colección para realizar las pruebas: [Postman Collection](https://github.com/luzhersor/Cursos_Temas_CRUD/blob/main/Estudiante_Programaci%C3%B3n.postman_collection.json)
