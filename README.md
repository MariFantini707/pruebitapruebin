🛒 Sistema de Microservicios - Gestión de Usuarios, Inventario y Carrito de Compras
Este proyecto implementa un sistema de microservicios utilizando Spring Boot, enfocado en la gestión de usuarios, productos en inventario y compras a través de un carrito. La arquitectura modular permite una alta escalabilidad, facilidad de mantenimiento y una integración eficiente con otras tecnologías.

📌 Tecnologías Utilizadas

Java + Spring Boot: Framework principal para construir microservicios.

Maven: Gestión de dependencias y estructura del proyecto.

MySQL: Base de datos relacional para almacenamiento.

JPA (Hibernate): Persistencia de datos con entidades Java.

Postman: Pruebas y validación de endpoints.

GitHub: Control de versiones y colaboración.

🧱 Arquitectura del Sistema

El sistema se compone de tres microservicios independientes:

Usuario: Gestión de autenticación, registro y datos de usuarios.

Inventario: Administración de productos y control de stock.

Carrito: Manejo de compras, verificación de stock y operaciones de carrito.

Los microservicios se comunican mediante RESTful APIs utilizando JSON para el intercambio de datos.

Cada servicio funciona como una aplicación Spring Boot independiente, lo que permite:

Despliegue y desarrollo modular.

Escalabilidad horizontal.

Mejor mantenimiento del sistema.
