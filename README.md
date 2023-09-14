# Bazar
### API Rest con SpringBoot que conecta a una base de datos H2. 
#### API REST para la gestión de las ventas, clientes y productos de un bazar.
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
 #### Productos cuya cantidad_disponible sea menor a 5
 * GET      localhost:3500/productos/falta_stock
 #### Productos de una determinada venta
 * GET      localhost:3500/productos/{codigo_venta}


 ### EndPoints CLIENTES
 * POST     localhost:3500/clientes/crear
 * GET      localhost:3500/clientes/traer
 * GET      localhost:3500/clientes/{id_cliente}  Traer un cliente en particular
 * DELETE   localhost:3500/clientes/eliminar/{id_cliente}
 * PUT      localhost:3500/clientes/editar

 ### EndPoints VENTAS
 * POST     localhost:3500/ventas/crear
 * GET      localhost:3500/ventas/traer
 * GET      localhost:3500/ventas/{codigo_venta}    Traer una venta en particular
 * DELETE   localhost:3500/ventas/eliminar/{codigo_venta}
 * PUT      localhost:3500/ventas/editar



 ### Instalación

##### Clona o descarga el repositorio.
##### Importa el proyecto a tu IDE (NetBeans, Eclipse, Intellij)
##### Ejecuta el archivo BazarApplication.java desde tu IDE.
##### Abre Postman e importa la colección para realizar las pruebas: [Postman Collection](https://github.com/luzhersor/Bazar_CRUD/blob/main/bazar.postman_collection.json)
