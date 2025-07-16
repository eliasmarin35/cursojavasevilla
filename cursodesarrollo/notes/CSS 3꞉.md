---
title: 'CSS 3:'
created: '2025-07-03T11:07:57.574Z'
modified: '2025-07-16T10:52:34.059Z'
---

# CSS 3:
## Incluir CSS:
Existen 3 formas de incluir CSS en nuestra página:
1. __CSS en Linea__:

  Mediante este método se incluye dentro de la propia etiqueta:

  `<p style="color: blue;">Esto es un parrafo</p>`

2. __CSS en cabecera__:

  Mediante la etiqueta `style`se agregan las propiedadees css con sus selectores.

  ```
  <style>
        /* Este es el metodo de incluir en cabecera */
        p{
            color: red;
        }
  </style>
  ```
3. Mediante un archivo externo CSS:

  Se añade la direccion del archivo `*.css`en la cabecera de la pagina con :

  `<link rel="stylesheet" href="estilos.css">`

  En el archivo css se definen los estilos a cambiar, este metodo de archivo externo es el mas recomendado sobre todo en grandes proyectos profesionales, en clase se verá el método 2 por comodidad.

> Una regla CSS empieza por un selector como por ejemplo p y luego una propiedad como color y su valor de codigo o nombre de color.

## Los Selectores:
Es importante porque deben estar bien, sino no funciona, existen varios tipo de selectores y veremos algunos de los mas importantes como:

1.  __Selectores Basicos__ :

- El selector universal, se representa con * y sus reglas de css se aplican a toda la página, no se suele usar habitaulmenbte por razones obvidas de diseño pero es importante para formatear inicialmente la página web al comenzar el código CSS, echad un vistazo a la web de Reset CSS.

- Selectores tipo etiqueta, se utiliza para dar estilo a las etiquetas básicas del DOM de HTML, tambien pueden usarse de forma combinada separadas por `,`para dar estilo similar a etiquetas o elementos distintos de la página.

````
h1, p {
            font-size: x-large;
            font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
        }
````
- Selector descendente: Es una forma de combiar las etiquetas, pero asociadas a su nivel o familia:

```
p span a {
            text-decoration: none;
        }
```
- Selectores de clase e id, se usa en todas las etiquetas o elementos si es necesario, las id se hace referencia por `#`y las clases por el `.`

2. __Selectores avanzados__:

  - Selectores de Hijos:
  - Selecto adyascente o hermanos:
 
 3.__Selector atributo__: 
 - Selecto Herencia: (mira la organizacion).
 

4. __Unidades de Medida__;

  - Unidades Absolutas:
  - Unidades Relativas:
  - Porcentajes:

5.__Colores__;

  - Palabras clave de colores, ver manual.
  -  RGB Decimal:
  - Hexadecimal de 3 o 6 cifras
  - RGB porcentaje:

6. __Modelo de Cajas:__
  - border: bordes de las cajas contenedoras, emgloba hasta 15 propiedades entre estilos, ancho, etc.
  - margin:
  - padding: relleno.
  - width es ancho
  - height es alto

  > Ojo por defecto los span ocupa de fondo lo que tiene el contenido, pero se puede moficicar en Css.

  7. __Fondos__ :

    - Se usa la etiqueta `background-image: url(xxx);`
    - background-size.
    - background-repeat.
    - background-position.
    - background-atachment.

8. __Posicionamiento__;

  - - position : static (flujo natural) 
  - position: relative (se posiciona respecto a su posicion original)
      top botton left right
  - position: fixed (se posiciona respecto a la ventana del navegador)

  - position: absolute (respecto a su contenedor y sale de flujo).

9. __Propiedades de texto:__

  - `font-variant`se usa para variar el comportamiento de una fuente en un elemento en concreto, pueden ser small-caps o llamado versalitas que es minusculas mas grandes, ver ejemplo.
  - `@font-face` para importar fuentes externa y cargarla desde local  o llamando a una direccion desde internet. Se usa normalmente google fonts.
  - 'text-aling' - alineación.
  - 'line-height' - interlineado
  - 'text-decporation' - techado, sobrerayado, ...
  - 'text-transform' - modo (mayusculas, minusculas. oración, etc)
  - 'vertical-align' - alineacion vertical
  - text -indent - sangria
  - letter-spacing - espaciado entre letras
  - word-spacing - espacio entre palabras
  - white-space - espacios en blanco

  ---
  #### Aqui copia lo que suba Ivan de CSS a sus apuntes para tener ambas versiones en este documento.
  ---




