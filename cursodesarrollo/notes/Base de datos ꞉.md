# 💾 Base de datos

### 📜 Índice

* [1. Introducción a la base de datos](#1-introduccion-a-la-base-de-datos-)
    * [El Modelo Entidad-Relación de Peter Chen](#el-modelo-entidad-relación-de-peter-chen)
* [2. Modelos conceptuales de bases de datos](#2-modelos-conceptuales-de-bases-de-datos-)
    * [Entidades](#-entidades)
    * [Relaciones: tipo de correspondencia, rol y grado](#-relaciones-tipo-de-correspondencia-rol-y-grado-)
    * [Atributos](#-atributos)
    * [El modelo Entidad-Relación Extendido](#el-modelo-entidad-relación-extendido)
    * [Restricciones de integridad](#restricciones-de-integridad-son-ocurrencias-no-permitidas-pueden-ser-inherentes-y-explicitas)
    * [Control de redundancia](#control-de-redundancia)
* [3. El modelo relacional](#3el-modelo-relacional-)
    * [Estructura del modelo relacional](#estructura-del-modelo-relacional)
    * [Atributos y dominios de los atributos](#atributos-y-dominios-de-los-atributos)
    * [Claves en el modelo relacional](#claves-en-el-modelo-relacional-)
    * [Restricciones de integridad](#restricciones-de-integridad)

---

## 1. Introducción a la base de datos 📖

Un sistema de base de datos es, en esencia, una colección organizada de datos diseñada para ser fácilmente accesible, gestionada y actualizada. Su objetivo principal es almacenar y recuperar información de manera eficiente y segura.

__Antes de las bases de datos modernas__, la información se almacenaba en sistemas de ficheros. Este método presentaba serios problemas:

* **Redundancia e inconsistencia**: Los mismos datos se repetían en diferentes ficheros, y si se actualizaba en un lugar, no se actualizaba en los otros, creando inconsistencias.
* **Dificultad de acceso**: Para obtener datos específicos, se necesitaban programas complejos y a medida para cada consulta. No había un lenguaje estándar para hacer preguntas a los datos.
* **Aislamiento de los datos**: Los datos estaban dispersos en diferentes ficheros con formatos distintos, lo que dificultaba enormemente relacionar información (por ejemplo, conectar un cliente con sus pedidos).
* **Problemas de integridad y seguridad**: Era complicado asegurar que los datos cumplieran ciertas reglas (por ejemplo, que el stock no fuera negativo) o establecer permisos de acceso diferenciados.

#### El Modelo Entidad-Relación de Peter Chen

En 1976, Peter Chen propuso el modelo entidad-relación (ER) como una solución a este caos. Su genialidad fue crear un método para modelar la estructura de los datos desde un punto de vista conceptual, antes de implementarlos físicamente en una base de datos.

El modelo ER se basa en tres conceptos simples:

* __Entidades__: Objetos del mundo real sobre los que queremos guardar información (ej: "Cliente", "Producto").
* __Atributos__: Las propiedades o características de esas entidades (ej: para "Cliente", sus atributos serían "Nombre", "Dirección", "Teléfono").
* __Relaciones__: Cómo se conectan o asocian las entidades entre sí (ej: un "Cliente" `compra` un "Producto").

La principal ventaja del modelo de Chen fue que permitió a los diseñadores y desarrolladores visualizar y acordar la estructura de los datos de una manera clara y estandarizada, centrándose en el significado de los datos y sus relaciones, en lugar de en los detalles técnicos de su almacenamiento. Este enfoque conceptual solucionaba los problemas de los ficheros al proporcionar un plano único y coherente que garantizaba la integridad, consistencia y facilidad de acceso a la información en los nuevos sistemas de bases de datos relacionales que estaban surgiendo.

---

## 2. Modelos conceptuales de bases de datos 🧠

El modelo de datos más empleado en la actualidad para llevar a cabo el diseño o modelado conceptual de bases de datos es el modelo **Entidad-Relación** o modelo E-R. Los elementos fundamentales del modelo E-R son las **entidades**, las **interrelaciones** o **relaciones** y los **atributos**.

#### 📦 Entidades:
Podemos definir una **entidad** como cualquier objeto sobre el que se desea almacenar información en la base de datos. También debemos tener claro el concepto de **ocurrencia** de una entidad, que se refiere a cada una de las realizaciones concretas de esa entidad en el mundo real o cada instancia de esa entidad. Por ejemplo, en la entidad `LIBRO` una ocurrencia podría ser el libro titulado "Diseño de base de datos".

*Imagen de ejemplo de entidades.*

#### 🔗 Relaciones: tipo de correspondencia, rol y grado:
Se puede definir como **asociación** o **correspondencia** entre entidades. Toda relación tiene las siguientes características:

* **Nombre**: Toda relación debe tener un nombre único en su esquema E-R.
* **Grado**: Hace referencia al número de entidades que participan en la relación:
    * **Relaciones binarias (grado 2)**: Son las más comunes y en ellas se relacionan dos entidades.
    * **Relaciones reflexivas (grado 1)**: Son aquellas que relacionan una entidad consigo misma.
    * **Relaciones ternarias, cuaternarias... (grado 3, 4...)**: Relacionan tres, cuatro o más entidades respectivamente.
* **Tipo de correspondencia**: Se refiere al número máximo de ocurrencias de una entidad que pueden estar asociadas con una ocurrencia de la otra entidad. Para relaciones binarias y reflexivas pueden ser:
    * **1:1**: Cada ocurrencia de una entidad solo puede estar asociada como máximo con una ocurrencia de la otra.
    * **1:N**: Una ocurrencia de una entidad puede estar asociada con varias de la otra, pero no al revés.
    * **N:M**: Una ocurrencia de una entidad puede estar asociada con varias de la otra, y viceversa.
* **Rol**: Opcionalmente, se puede identificar el rol que desempeña cada entidad en la relación. Es útil sobre todo en relaciones reflexivas.

> 💡 **Nota**: Las relaciones más utilizadas son las **binarias** y las **reflexivas**. Las ternarias o de grado superior son mucho menos comunes.

*Imagen de ejemplo de relaciones.*

#### 🏷️ Atributos:
Un **atributo** es una característica o propiedad de una entidad o de una relación. Existen varios tipos:
* **Atributos multievaluados**: Se representan con un doble círculo.
* **Atributos derivados**: Se generan a partir de otros atributos y se representan con un óvalo de línea discontinua.
* **Atributo principal (o identificador)**: Se dibuja con el texto subrayado.
* **Atributos alternativos**: Se dibujan con un subrayado discontinuo.

> 📝 **Definición**: Un **Atributo Identificador Candidato (AIC)** es un conjunto de posibles atributos principales. Finalmente, solo se elige un **Atributo Identificador Principal (AIP)**, y los demás se convierten en **Atributos Identificadores Alternativos (AIA)**.

Los atributos tienen un **Dominio**, que es el conjunto de valores que puede tomar.

*Imágenes de ejemplo de atributos y su representación alternativa.*

### El modelo Entidad-Relación Extendido 🚀

Diversos autores han complementado el modelo de Peter Chen, añadiendo conceptos como la cardinalidad y las entidades débiles.

* __Cardinalidad de las relaciones__: Se define como el número **mínimo** y **máximo** de ocurrencias de una entidad que pueden estar relacionadas con una ocurrencia de la otra. Se representa con las etiquetas `(0,1)`, `(1,1)`, `(0,n)` o `(1,n)`.
    > El primer dígito indica la **obligatoriedad** (1) o no (0) de la relación. El segundo indica la correspondencia.

* __Entidades fuertes y débiles__:
    * **Fuertes (o regulares)**: Tienen existencia propia.
    * **Débiles**: Su existencia depende de una entidad fuerte. Si la fuerte se elimina, la débil también.

* __Atributos en relaciones__: Los atributos pueden pertenecer tanto a entidades como a relaciones.

* __Jerarquías de tipos y subtipos__: Permite generalizar entidades con atributos comunes (subtipos) en una entidad supertipo.

* __Agregación__: Es una abstracción que permite tratar una relación y las entidades que la componen como un único objeto, permitiendo así establecer relaciones sobre relaciones.

### Restricciones de integridad:
Son reglas que impiden la existencia de ocurrencias no permitidas.
* **Inherentes**: Impuestas por el propio modelo (ej: no puede haber dos filas idénticas).
* **Explícitas**: Definidas por el usuario (ej: la edad debe estar entre 0 y 120).

### Control de redundancia:
Se deben evitar y eliminar relaciones redundantes en el modelo, especialmente las que forman ciclos cerrados innecesarios.

---

## 3.El modelo relacional ⛓️

Fue propuesto por Codd en 1970 para sustituir modelos más antiguos (jerárquico y en red). Sus objetivos son:
* Independencia física y lógica.
* Flexibilidad.
* Uniformidad.
* Sencillez.

### Estructura del modelo relacional:
Los datos se almacenan en **tablas** (relaciones) conectadas entre sí.
* Las **columnas** son los **atributos**.
* Las **filas** son las **tuplas**.

Una relación tiene las siguientes propiedades:
* Nombre único.
* Valores de atributos atómicos.
* Nombres de atributos únicos dentro de la misma tabla.
* Ni las tuplas ni los atributos tienen un orden específico.
* No hay dos tuplas idénticas.

### Atributos y dominios de los atributos:
Los **atributos** son las propiedades (columnas) y el **dominio** es el conjunto de valores permitidos para ese atributo.

### Claves en el modelo relacional 🔑:

* __Claves candidatas__: Conjunto de atributos que identifican de forma única y mínima cada tupla.
* __Clave primaria (Primary Key - PK)__: La clave candidata elegida para identificar las tuplas.
* __Claves alternativas__: Claves candidatas que no fueron elegidas como primarias.
* __Claves ajenas o foráneas (Foreign Key - FK)__: Un conjunto de atributos cuyos valores deben coincidir con los valores de la clave primaria de otra tabla, estableciendo una relación.

### Restricciones de integridad:
Son las reglas que garantizan la consistencia de los datos en el modelo relacional.
* __Clave primaria (PRIMARY KEY)__: Sus valores no pueden repetirse ni ser nulos.
* __Unicidad (UNIQUE)__: Los valores de un atributo no se pueden repetir.
* __Obligatoriedad (NOT NULL)__: El atributo no puede tener un valor nulo.
* __Integridad referencial (FOREIGN KEY)__: Garantiza que un valor de una clave foránea exista como valor en la clave primaria de la tabla referenciada.
* __Aserciones o de validación (CHECK)__: Permiten definir condiciones personalizadas que los datos deben cumplir.

> Estas **restricciones** son el pilar fundamental del modelo de base de datos relacional.