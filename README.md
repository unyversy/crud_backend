Proyecto CRUD de Estudiantes
Este es un proyecto de ejemplo de una API RESTful para gestionar estudiantes utilizando Java y Spring.

Características
Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una entidad "Estudiante".
Realiza validaciones de datos para garantizar la integridad de los registros.
Incluye pruebas unitarias para cada uno de los endpoints de la API.
Configuración
Requisitos Previos
Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

Java JDK
Spring Boot
Base de Datos
Configuración de la Base de Datos
Crea una base de datos en tu sistema de gestión de bases de datos preferido (por ejemplo, MySQL, PostgreSQL, H2, etc.) con el nombre que desees.

Abre el archivo de configuración de la base de datos (application.properties o application.yml) en el directorio src/main/resources.

Modifica la configuración de la base de datos con tus propias credenciales y detalles de conexión:

yaml
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/alumnos?useSSL=false&serverTimezone=UTC
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
logging.level.org.hibernate.SQL=debug

Ejecución del Proyecto
Clona este repositorio o descarga el código fuente.

Abre una terminal y navega hasta el directorio raíz del proyecto.

Ejecuta el proyecto utilizando el siguiente comando:

bash
Copy code
./mvnw spring-boot:run
O, si tienes Maven instalado globalmente:

bash
Copy code
mvn spring-boot:run
La API estará disponible en http://localhost:8080. Puedes acceder a la documentación de la API en http://localhost:8080/swagger-ui.html (si has habilitado Swagger).

Uso de la API
La API proporciona los siguientes endpoints:

POST /estudiantes: Crea un nuevo estudiante.
GET /estudiantes: Obtiene la lista de todos los estudiantes.
GET /estudiantes/{id}: Obtiene los detalles de un estudiante por ID.
PUT /estudiantes/{id}: Actualiza los datos de un estudiante por ID.
DELETE /estudiantes/{id}: Elimina un estudiante por ID.
Asegúrate de utilizar un cliente HTTP (por ejemplo, Postman) para probar los endpoints de la API.

Pruebas Unitarias
Las pruebas unitarias están ubicadas en el directorio src/test/java. Puedes ejecutarlas utilizando:

bash
Copy code
./mvnw test
Contribuciones
Si deseas contribuir a este proyecto, ¡estamos abiertos a sugerencias y mejoras! Siéntete libre de crear problemas (issues) y solicitudes de extracción (pull requests).
