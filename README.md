# Proyecto de Pruebas Automatizadas con Selenium para Mercado Libre

Este repositorio contiene un conjunto de pruebas automatizadas utilizando Selenium para navegar por la página principal de Mercado Libre y buscar un producto en particular. El proyecto está organizado en tres carpetas principales: `pages`, `resources`, y `tests`.

## Tecnologías Utilizadas

- **Lenguaje**: Java
- **Framework**: Selenium

## Objetivo del Test

El objetivo de estas pruebas es navegar por la página principal de Mercado Libre y buscar un producto específico. El test está dividido en tres carpetas:

1. **pages**: Contiene las clases `HomePage` y `ResultPage`.
2. **resources**: Contiene el archivo `testng.xml`.
3. **tests**: Contiene la clase `BaseTest` (donde se configura el test) y `TestEnHome` (donde se declaran y utilizan los métodos creados en `HomePage` y `ResultPage`).

## Estructura del Proyecto

### Carpeta `pages`

- **HomePage.java**: Clase que contiene los métodos para interactuar con la página principal de Mercado Libre.
- **ResultPage.java**: Clase que contiene los métodos para interactuar con la página de resultados de búsqueda.

### Carpeta `resources`

- **testng.xml**: Archivo de configuración de TestNG para ejecutar los tests en diferentes navegadores (Chrome, Firefox y Edge) utilizando los comandos `parallel` y `suite` de TestNG.

### Carpeta `tests`

- **BaseTest.java**: Clase que contiene la configuración inicial del test (setup).
- **TestEnHome.java**: Clase donde se declaran y utilizan los métodos de `HomePage` y `ResultPage`.

## Tecnologías y Dependencias

- **Maven**
- **TestNG**
- **Selenium WebDriver**
- **Archivo testng.xml**: Para correr los tests en diferentes navegadores (Chrome, Firefox y Edge) usando los comandos `parallel` y `suite` de TestNG.

## Instalación

### Prerrequisitos

Asegúrate de tener Maven y Java instalados en tu sistema. Puedes descargar Maven desde [aquí](https://maven.apache.org/download.cgi) y Java desde [aquí](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Pasos de Instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/ChepeGR/mercadolibre-tests.git
   cd mercadolibre-tests
   ```

2. **Instalar dependencias con Maven**
   ```bash
   mvn clean install
   ```

### Ejecutar Pruebas

Para ejecutar las pruebas, utiliza el siguiente comando:
```bash
mvn test
```

También puedes ejecutar las pruebas específicas configuradas en `testng.xml` para diferentes navegadores:
```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Contacto

Para cualquier consulta o contribución, por favor contacta al administrador del repositorio:

- **Email**: eduardojgriboldi@gmail.com
- **LinkedIn**: [Eduardo García Riboldi](https://www.linkedin.com/in/eduardo-garcia-riboldi-36803a222)
- **GitHub**: [ChepeGR](https://github.com/ChepeGR)

