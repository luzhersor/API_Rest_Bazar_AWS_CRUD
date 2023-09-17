# Store API Rest AWS
### API Rest with SpringBoot and MySQL as database, deployed in AWS Elastic Beanstalk(BE)
#### API Rest for the management of sales, customers and products of a Clothes Store.
_The API allows CRUD requests (Create, Read, Update, Delete) of the services "Venta", "Producto" and "Cliente", 
as well as other custome request listed below._

### 🖥️ Tech Stack
* Java 17
* AWS Elastic Beanstalk, EC2, S3, RDB
* Spring Boot: 2.7.13
* Spring Boot Data JPA
* Spring Boot Starter Web
* H2 Database
* Lombok
* MySQL Driver
* Postman
* IDE NetBeans

#### Important considerations
Every sale (venta) has a list of products (@ManyToMany) and only one client related @OneToOne.

###  📦 AWS Elastic Beanstalk (EB) -Remote Server-
The endpoints for requests and responses are the same as on the local server, you only have to change the initial part of the link:

 * GET   shop-bazar-env.eba-trg26fj3.us-east-2.elasticbeanstalk.com/productos/traer
 * GET   shop-bazar-env.eba-trg26fj3.us-east-2.elasticbeanstalk.com/clientes/traer
 * GET   shop-bazar-env.eba-trg26fj3.us-east-2.elasticbeanstalk.com/ventas/traer

Consider that in the browser you can only run GET type requests, if you want to make another type of request it is necessary to use Postman (POST, DELETE, PUT).

#### Products with an amount of less than 5 pieces 📦
 * GET    shop-bazar-env.eba-trg26fj3.us-east-2.elasticbeanstalk.com/productos/falta_stock 

#### List of the products of a certain sale  📦
 * GET     shop-bazar-env.eba-trg26fj3.us-east-2.elasticbeanstalk.com/ventas/productos/7
 
###  ⚙️ Local Server 
### EndPoints PRODUCTOS
 * POST     localhost:3500/productos/crear
 * GET      localhost:3500/productos/traer
 * GET      localhost:3500/productos/{codigo_producto}  Traer un producto en particular
 * DELETE   localhost:3500/productos/eliminar/{codigo_producto}
 * PUT      localhost:3500/productos/editar
 * GET      localhost:3500/productos/falta_stock
 * GET      localhost:3500/ventas/productos/{codigo_venta}

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


### API Rest con SpringBoot que conecta a una base de datos MySQL desplegada en AWS Elastic Beanstalk (EB). 
#### API REST para la gestión de las ventas, clientes y productos de un bazar.
_La API permite realizar consultas CRUD(Cread, Read, Update, Delete) de las clases "VENTA", 
"PRODUCTO" y "CLIENTE", así como otras operaciónes personalizadas que se enlistan a continuación._

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
 * GET      localhost:3500/ventas/productos/{codigo_venta}


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
