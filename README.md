# Bazar
### API Rest con SpringBoot que conecta a una base de datos H2. 
La API permite realizar consultas CRUD(Cread, Read, Update, Delete) de las clases "VENTA", 
"PRODUCTO" y "CLIENTE", así como otras operaciónes personalizadas que se enlistan a continuación.

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

 ### Consideraciones importantes 
 * Cada venta posee una lista de productos (@ManyToMany) y uno y solo un cliente asociado (@OneToOne).
 
 ### Este programa permite realizar las siguientes consultas 
 * CRUD de PRODUCTO
 * CRUD de CLIENTE
 * CRUD de VENTA
 * Listado de PRODUCTOS asociados a una determinada VENTA.
 * Listado de PRODUCTOS cuya cantidad_disponible sea menor a 5.

 ### EndPoints PRODUCTOS
 * POST     localhost:3500/productos/crear
 * GET      localhost:3500/productos/traer
 * GET      localhost:3500/productos/{codigo_producto}  Traer un producto en particular
 * DELETE   localhost:3500/productos/eliminar/{codigo_producto}
 * PUT      localhost:3500/productos/editar


 ### EndPoints CLIENTES
 * POST     localhost:3500/temas/crear
 * PUT      localhost:3500/temas/editar

 ### EndPoints VENTAS
 * GET      localhost:3500/cursos/traer
 * POST     localhost:3500/cursos/crear
 * PUT      localhost:3500/cursos/editar
 * GET      localhost:3500/cursos/temas/{id} DTO
 * GET      localhost:3500/cursos/java

 ### Instalación

##### Clona o descarga el repositorio.
##### Importa el proyecto a tu IDE (NetBeans, Eclipse, Intellij)
##### Ejecuta el archivo CursosApplication.java desde tu IDE.
##### Abre Postman e importa la colección para realizar las pruebas: [Postman Collection](https://github.com/luzhersor/Cursos_Temas_CRUD/blob/main/Estudiante_Programaci%C3%B3n.postman_collection.json)
