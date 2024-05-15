### w2m



### Requisitos

Para ejecutar este proyecto, necesitarás lo siguiente:
- Java 11 o superior
- Maven 3.6.3 o superior

### Instrucciones de Instalación y Ejecución

### Clonar el Repositorio

Para obtener el proyecto, clona este repositorio en tu máquina local usando:

```bash
git clone https://github.com/tonysanrusso/w2m.git
```

### Construir el Proyecto

Para construir el proyecto y generar el artefacto ejecutable, ejecuta:

```bash
mvn clean install
```

### Ejecutar el Servidor

Una vez construido el proyecto, puedes ejecutar el servidor de Spring Boot localmente:

```bash
java -jar w2m-boot/w2m-boot.jar
```

O puedes ejecutar directamente con Maven:

```bash
mvn spring-boot:run
```

## Documentación de la API

La documentación de la API está disponible y puede ser accesada una vez que el servidor está en ejecución:

- **Swagger UI**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
- **API Docs**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

Estos enlaces te permitirán ver y probar los endpoints de la API.

## Configuración de la Base de Datos

Este proyecto está configurado para usar una base de datos que se inicializa automáticamente al arrancar la aplicación, utilizando Liquibase para gestionar la configuración y las migraciones del esquema:

- **Changelogs de Liquibase**: `src/main/resources/db/changelog`

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo `LICENSE.md` para más detalles.
```
