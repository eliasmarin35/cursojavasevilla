---
title: "Apuntes HTML \U0001F4DA"
created: '2025-06-30T08:02:49.509Z'
modified: '2025-07-03T16:24:54.735Z'
---



# **Apuntes HTML** 📚

---

### 📝 **Índice**

1.  **Etiquetas HTML** 🏷️
    * Emmet. Plantilla Base.
    * Secciones. `head`, `h1`...`h6`, etc.
    * Formato de Texto. `ins`, `em`, `strong`.
    * Texto Específico.
    * Los Enlaces. 🔗
    * Listas. 📝
    * Imágenes. 🖼️
    * Mapas de Imágenes. 🗺️
    * Tablas. 📊
    * Formularios. ✍️
    * Etiquetas Semánticas. 📚
2.  **SEO** 📈

---


## 1. **Etiquetas HTML** 🏷️

* **Emmet. Plantilla base.** Es genial para escribir código HTML más rápido. 🚀
* **Secciones.** `head`, `h1`...`h6`, etc. Ayudan a estructurar tu página. 🧱
* **Formato de texto.** `ins` (texto insertado), `em` (énfasis), `strong` (importancia). ¡Para que tu texto resalte! ✨
* **Texto específico:**
    * `` `blockquote` `` escribe citas con sangría. Ideal para destacar frases. 💬
    * **Superíndice y Subíndice**: se escribe con etiqueta `` `sup` `` y `` `sub` `` respectivamente. Como en H₂O o X³.
    * **Abreviaturas y acrónimos**: `` `abbr` ``, por ejemplo:
        `` `<abbr title="Consejo Superior de Investigaciones Científicas">CSIC</abbr>` `` ¡Una forma elegante de dar más información! 💡
    * `` `span` `` te indica un fragmento de texto para modificar o resaltarlo con `` `style` `` por ejemplo:
        `` `<abbr title="Consejo Superior de Investigaciones Científicas"><span style="color:red;">CSIC</span></abbr>` `` Útil para pequeños ajustes de estilo. 🎨
    * `` `br` `` es salto de línea. Para cuando necesitas un enter. ⏎
    * `` `pre` `` texto preformateado. Por ejemplo, en Markdown las líneas de código son texto preformateado. Perfecto para bloques de código. 💻
* **Los Enlaces**: 🔗 Existen dos tipos: internos y externos:
    * **Enlaces internos**: son en la misma página. ¡Para moverte sin salir! ➡️
        * **Ancla**: `` `<h2><a id="a3"></a>Núcleos residenciales</h2>` ``
        * **Destino o índice**: `` `<a href="#a3">Núcleos residenciales</a>` ``
    * **Enlaces externos**: apuntan a webs externas o distintas a la que estamos. Para explorar más allá. 🌍
        ```html
        <a href="[https://es.wikipedia.org/wiki/Sevilla](https://es.wikipedia.org/wiki/Sevilla)">Sevilla.[5]</a>
        ```
    * **Enlaces Relativos**: enlaces a archivos de la carpeta actual o hijos o padres, con `/` indicando carpeta y `..` para ir a carpeta padre, al igual que en consola o `` `cmd` ``. Muy prácticos para la organización. 📂
        `` `<a href="ejemplo_01.html">Hola Mundo</a>` ``
    * **En enlaces a correo** para que se abra la app por defecto de correo del sistema:
        `` `<a href="mailto:info@avante.es">Correo Avante</a>` `` ¡Facilita el contacto! ✉️

* **Listas**: 📝 existen dos tipos: no ordenadas y ordenadas:
    * **No ordenadas**: se usa con etiqueta `` `ul` `` y cada elemento con etiqueta `` `li` ``. ¡Usaremos Emmet esta vez para dejar de usar la clásica forma de hacer listas! Ponemos, por ejemplo, para una lista de 3 elementos no ordenada:
        `` `ul>li*3{Elemento 1.$}` ``
        Generará:
        ```html
        <ul>
            <li>Elemento 1.1</li>
            <li>Elemento 1.2</li>
            <li>Elemento 1.3</li>
        </ul>
        ```
        ¡Súper rápido! 💨
    * **Ordenadas**: se usa etiqueta `` `ol` `` y para elementos `` `li` ``:
        `` `ol>li*4{Apartado$}` ``
        Genera:
        ```html
          <ol>
            <li>Apartado1</li>
            <li>Apartado2</li>
            <li>Apartado3</li>
            <li>Apartado4</li>
          </ol>
        ```
        Perfecto para pasos o clasificaciones. 🔢
    * **Listas Anidadas**: son listas dentro de otras listas. ¡Aprenderemos a usarlas con Emmet y sus métodos abreviados para mejorar la rapidez a la hora de crearlas! nesting lists 🌳
        Si los elementos son equilibrados o el mismo número, todo lo hacemos con un comando de Emmet, si no, deberíamos hacerlo poco a poco. Mira el código de `` `ejemplo_05_listas` `` para verlo más claro.
        `` `ul>li*7{Texto$}` ``
        Dentro del elemento `` `li` `` 3: `` `ul>li*9{Menu 1.$}` ``
        Genera:
        ```html
        <ul>
            <li>Texto1</li>
            <li>Texto2</li>
            <li>Texto3
                <ol>
                    <li>Menu 1.1</li>
                    <li>Menu 1.2</li>
                    <li>Menu 1.3</li>
                    <li>Menu 1.4</li>
                    <li>Menu 1.5</li>
                    <li>Menu 1.6</li>
                    <li>Menu 1.7</li>
                    <li>Menu 1.8</li>
                    <li>Menu 1.9</li>
                </ol>
            </li>
            <li>Texto4</li>
            <li>Texto5</li>
            <li>Texto6</li>
            <li>Texto7</li>
        </ul>
        ```
        ¡Magia con Emmet! ✨
* **Imágenes**: 🖼️ Se usa hoy en día normalmente que se carguen desde el servidor local o de forma externa. Usaremos la etiqueta `` `img` ``, `` `src` `` para la dirección donde está localizada la imagen y `` `alt` `` para el texto alternativo de la imagen, ¡es muy recomendable ponerlo! Ver `` `ejercicio_6_imagenes` ``. Para imágenes externas usamos recortadores de URL como TinyURL. ¡Imprescindible para tu contenido visual! 👀

* **Mapas de Imágenes**: 🗺️ Es una imagen que contiene varios enlaces dentro de ella. Mediante coordenadas se eligen zonas que harán de área interactiva para crear un enlace activo.
    * Usaremos un programa para calcular coordenadas como `` `image-map.net` ``.
    * La teoría es que debemos calcular la coordenada indicada con el atributo `` `coords` `` de la zona e indicar con el atributo `` `shape` `` la forma (`` `circle` ``, `` `rect` ``, etc.). Ver `` `ejemplo 6 imagenes` ``. ¡Crea experiencias interactivas! 🎯
    ```html
    <h2>Mapas de imagen</h2>
        <img src="imagen-mapa.png" usemap="#image-map">
        <map name="image-map" >
            <area target="_blank" alt="html5" title="html5" href="[https://es.wikipedia.org/wiki/HTML5](https://es.wikipedia.org/wiki/HTML5)" coords="64,86,168,197" shape="rect">
            <area target="_blank" alt="javascript" title="javascript" href="[https://developer.mozilla.org/es/docs/Web/JavaScript](https://developer.mozilla.org/es/docs/Web/JavaScript)" coords="204,43,364,205" shape="rect">
            <area target="_blank" alt="grafos" title="grafos" href="[https://es.wikipedia.org/wiki/Grafo](https://es.wikipedia.org/wiki/Grafo)" coords="383,38,540,218" shape="rect">
            <area target="_blank" alt="git" title="git" href="[https://git-scm.com/](https://git-scm.com/)" coords="577,53,682,186" shape="rect">
        </map>
    ```

* **Tablas**: 📊 Es la mejor forma de presentar información mediante HTML al usuario. Lo primero es calcular su tamaño en Fila x Columna.
    * Debemos usar Emmet, pero veremos las etiquetas principales primero.
    * Usaremos las etiquetas `` `<table>` `` que engloba toda la tabla.
    * La etiqueta `` `<caption>` `` que engloba el título de la tabla. 📝
    * La etiqueta `` `<tr>` `` es la fila de la tabla. Dentro de esta etiqueta tenemos dos opciones de nivel 4, que son `` `<th>` `` (de cabecera) y `` `<td>` `` (de celdas de la tabla).
    * `` `<thead>` `` filas de cabecera de la tabla.
    * `` `<tbody>` `` fila del cuerpo de la tabla.
    * `` `<tfoot>` `` filas del pie de la tabla.
    * Existen dos tipos de fusiones: la fusión vertical y la horizontal:
        * **La fusión horizontal**: `` `colspan` `` siempre es igual a 1. Si ponemos 2, la celda se "come" la siguiente y eliminamos la celda siguiente. ↔️
        * **La fusión vertical**: `` `rowspan` ``. ↕️
    ¡Organiza tus datos de forma impecable! 📈

* **Formularios**: ✍️ Es la única forma de pedir datos al usuario. Desde HTML5 se añadieron validaciones. Se usa la etiqueta `` `form` ``, y pueden ser mediante método `` `get` `` o `` `post` ``. El método `` `get` `` no tiene encriptación y los datos del formulario son visibles en la URL (menos seguro). El método `` `post` `` está encriptado y no se ve en la URL, pero es más "pesado" para el servidor web. ¡La interacción con el usuario es clave! 🧑‍💻
    * El campo `` `action` `` contiene la dirección de la web del servidor que valida los datos del formulario al enviarlos.
    * La etiqueta `` `fieldset` `` agrupa campos del formulario. Para una mejor organización. 📦
    * Usaremos abreviaturas de Emmet; mira el `` `ejemplo_8` ``.
    * `` `placeholder` `` es un valor temporal guía para el usuario. ¡Ayuda visual! ✨
    * `` `value` `` en un `` `input` `` es como un valor por defecto que se inicia al cargar el formulario.
    * `` `required` `` se añade en los `` `input` `` para obligar al usuario a introducir datos. ¡Para que no se te escape nada! ✅
    * Las propiedades de las etiquetas `` `min` `` y `` `max` `` obligan a poner un valor mínimo o máximo respectivamente.
    * `` `select` `` para un desplegable con varias opciones. Con Emmet sería `` `label+select>option*n` ``, donde `` `n` `` es el número de opciones deseadas. También tenemos la opción `` `optgroup` `` para agrupar opciones dentro de nuestro `` `select` ``. ¡Menús desplegables ordenados! 🔽
    * Etiqueta `` `radio` `` con Emmet se pone después del `` `label` ``. Sería así: `` `(input:radio+label)*2` ``. En este ejemplo de Emmet se crean dos radios; solo puedes elegir uno. El `` `name` `` es el mismo, pero solo podemos elegir uno. 🔘
    * La etiqueta `` `checkbox` `` sí permite elegir más de una opción. Lo más importante que la diferencia es que en la propiedad `` `name` `` debe ir `` `nombrevariable[]` `` (tipo array). ✅✅
    * `` `input` `` tipo `` `color` `` que es como un panel RGB. Con el Emmet `` `label+input:color` ``. ¡Para elegir colores directamente! 🌈
    * **Adjuntar archivos** en formulario: hay que poner en la etiqueta `` `form` `` la propiedad `` `enctype="multipart/form-data"` `` y en Emmet la abreviatura para el `` `input` `` de adjuntar es `` `label+input:file` ``. 📎
    * El `` `input range` ``. Para selectores de rango. ↔️
    * `` `Input hidden` ``: el Emmet es: `` `input:hidden` `` y sirve para ocultar el campo en el formulario. Se suele usar para comunicar formularios o guardar datos que se enviarán en el formulario con datos anteriores, pero el usuario no tiene por qué verlo en ese momento. ¡Información discreta! 🤫
    * Etiqueta `` `legend` `` se usa para poner un título en el recuadro de `` `fieldset` ``. Se coloca justo después del inicio de la etiqueta `` `fieldset` ``.
    * Se usa poco, pero también existe la **selección múltiple de `` `select` ``** como una propiedad `` `multiple="multiple"` `` en la etiqueta de nuestro `` `select` `` y la variable sería un array, no una variable básica. 📋

* **Etiquetas Semánticas**: 📚
    > El resto de etiquetas aumenta un nivel. ¡Para una estructura con significado!
    * `` `header` `` (nivel 2): es la cabecera de la página. 🔝
    * `` `nav` `` (nivel 2): navegación. 🧭
    * `` `aside` `` (nivel 2): esta etiqueta semántica se utiliza para la barra lateral. ➡️
    * `` `article` `` (nivel 2): se suele usar para identificar contenido dentro de las `` `sections` ``. 📝
    * `` `figure` `` (sección multimedia). 📸
    * `` `figcaption` `` (nivel 3): es un pie que suele venir con el `` `figure` ``.
    * `` `main` `` (zona principal, nivel 2). 🏠
    * `` `section` `` (nivel 2): contiene la información principal. 📄
    * `` `footer` `` (nivel): pie de página. ⬇️

    __Importante__
    > No existe una sola solución única para etiquetas semánticas, es decir, no hay una solución única, ¡pero debemos seguir unas normas! 📏
    > No se puede tener una `` `section` `` dentro de otra `` `section` ``, pero sí un `` `article` `` con varias `` `sections` ``. 💡
    > Todos los `` `section` `` y `` `article` `` deben tener un `` `h2` ``...`` `h6` `` o, en su defecto, un atributo `` `aria-label` ``. ¡Para una buena accesibilidad! ♿

---

## 2. **SEO** 📈

* **Validación**. ¡Asegúrate de que tu código sea válido! ✅
* **Palabras Clave**. ¡Las que te ayudarán a ser encontrado! 🔑
* **Links externos** (que te referencien y las redes sociales). ¡Construye tu red! 🌐
* **Ratio**: el ratio entre contenido y código es un porcentaje entre los dos valores de contenido y código. El SEO nos pide un objetivo del 5% de ratio. ¡Un buen equilibrio es clave! ⚖️
