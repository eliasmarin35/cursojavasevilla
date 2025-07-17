---
title: '#APUNTES IVÁN'
created: '2025-07-02T12:29:52.741Z'
modified: '2025-07-16T20:52:49.300Z'
---

#APUNTES IVÁN
---
title: "\U0001F4D8 Apuntes Clase Iván"
created: '2025-07-02T12:29:52.741Z'
modified: '2025-07-09T12:09:44.374Z'
---

# 📘 Apuntes Clase

- [📘 Apuntes Clase](#-apuntes-clase)
  - [🔀 Arranque dual](#-arranque-dual)
  - [💻 IDEs](#-ides)
  - [☕🖥️ Instalar Java y VSC](#️-instalar-java-y-vsc)
    - [☕ Instalar Java](#-instalar-java)
  - [🖥️ Comandos de Consola](#️-comandos-de-consola)
    - [🪟 Windows (MS-DOS/Powershell)](#-windows-ms-dospowershell)
    - [🐧 Linux](#-linux)
    - [🧑‍💻 Instalar Visual Studio Code (VSC)](#-instalar-visual-studio-code-vsc)
  - [🔧 GIT](#-git)
    - [📋 Listado de comandos](#-listado-de-comandos)
      - [🌿 Ramas GIT](#-ramas-git)
  - [👥 Roles Proyectos](#-roles-proyectos)
    - [🧑‍🎓 Junior (\< 2-4 años)](#-junior--2-4-años)
    - [🧑‍💼 Senior (\> 2-4 años)](#-senior--2-4-años)
  - [🌐 HTML](#-html)
    - [🏷️ Etiquetas HTML](#️-etiquetas-html)
    - [⚙️ Atributos HTML](#️-atributos-html)
    - [✅ Validadores HTML y CSS](#-validadores-html-y-css)
  - [CSS](#css)
    - [Incluir CSS](#incluir-css)
  - [🎯 Selectores y Estructura](#-selectores-y-estructura)
  - [🎨 Colores y Fondo](#-colores-y-fondo)
  - [🧱 Modelo de Caja (Box Model)](#-modelo-de-caja-box-model)
  - [🔡 Tipografía](#-tipografía)
  - [📐 Unidades](#-unidades)
  - [📦 Visualización y Visibilidad](#-visualización-y-visibilidad)
  - [📌 Posicionamiento](#-posicionamiento)
  - [🎨 Estilo y Tipografía](#-estilo-y-tipografía)
  - [✍️ Propiedades de Texto](#️-propiedades-de-texto)
  - [🔗 Enlaces y Listas](#-enlaces-y-listas)
  - [🗃️ Tablas](#️-tablas)
  - [📝 Formularios](#-formularios)
  - [🌈 Novedades CSS3 - Parte 1](#-novedades-css3---parte-1)
  - [🎬 Novedades CSS3 - Parte 2](#-novedades-css3---parte-2)
  - [📦 Novedades CSS3 - Parte 3](#-novedades-css3---parte-3)
  - [🧱 Novedades CSS3 - Parte 4](#-novedades-css3---parte-4)
  - [📀 Virtualización](#-virtualización)
  - [MySQL](#mysql)
  - [Instalar Workbench](#instalar-workbench)

---

## 🔀 Arranque dual
- Los SO son independientes  
- El gestor de arranque de Linux: Grub  
- El gestor de arranque de Win: MBR  
- Windows versión: 11 Pro/Home  
- Linux distribución: Mint Cinnamon → Ubuntu → Debian  
- Núcleos: GNU/Linux → Unix  

---

## 💻 IDEs
- Para MarkDown: Notable  
- Para código: Visual Studio Code  
- Oficial Java: Apache Netbeans  

---

## ☕🖥️ Instalar Java y VSC

### ☕ Instalar Java  
- LTS → Soporte extendido  
1️⃣ Ir a [🔗 Oracle Java](https://www.oracle.com/es/java/technologies/downloads/)  
2️⃣ Descargar versión *LTS (21)*  
3️⃣ Configurar **variables de entorno**  
   - ⌨️ `Win + R` → `cmd`  
   - ⚙️ `SystemPropertiesAdvanced`  
     *(📁 Panel de Control > 🖥️ Sistema > ⚙️ Configuración avanzada del sistema > 🌐 Variables de entorno)*  
   - 🧬 Variables de Entorno  
   - 🛣️ `Path` (del sistema): `C:\Program Files\Java\jdk-21`  

---

## 🖥️ Comandos de Consola

### 🪟 Windows (MS-DOS/Powershell)
- `cmd` → iniciar consola  
- `dir` → ver directorio  
- `cd` → cambiar directorio  
- `cd..` → subir nivel  
- `cls` → limpia consola  

### 🐧 Linux
- `clear` → limpia consola  
- `sudo` → privilegios superusuario  
- `apt update` → actualizar repos  
- `apt upgrade` → actualizar apps  
- `apt install paquete` → instalar paquete  
- `mkdir` → crear directorio  
- `ls` → lista contenido  
- `pwd` → ruta actual  

### 🧑‍💻 Instalar Visual Studio Code (VSC)  
1️⃣ Ir a [🔗 VS Code Download](https://code.visualstudio.com/download#)  
2️⃣ Descargar `System Installer x64`  
3️⃣ Instalar extensiones:  
   - 🌍 **Spanish**  
   - 📦 **Extension Pack for Java** (Microsoft)  
   - 📝 **Markdown All in One**  
     - F1 > markdown all in one: create table of contents  

---

## 🔧 GIT

### 📋 Listado de comandos
- `git init` → iniciar repo  
- `git clone "repo"` → clonar repo  
- `git status` → estado  
- `git add .` → añadir todo  
- `git add notes/Apuntes.md` → archivo individual  
- `git commit -m "mensaje"` → guardar  
- `git commit -a -m "mensaje"` → añadir y guardar  
- `git push` → subir repo  
- `git pull` → descargar repo  

- `git remote`  
  - `git remote add` → añadir remoto  
  - `git remote -v` → ver remotos  
- `git fetch` → descargar sin fusionar  
- `git merge` → fusionar cambios  

#### 🌿 Ramas GIT
- `git branch "rama"` → crear rama  
- `git checkout "rama"` → cambiar rama  
- `git merge rama` → fusionar ramas  

Pasos:  
1️⃣ `git checkout rama_destino`  
2️⃣ `git merge rama_a_fusionar`  
3️⃣ `git commit -m "Rama Fusionada"`  

---

## 👥 Roles Proyectos

### 🧑‍🎓 Junior (< 2-4 años)
- Front: 25k-30k  
- Back: 20k-25k  
- FullStack: 28k-32k  

### 🧑‍💼 Senior (> 2-4 años)
- Front: 30k-35k  
- Back: 25k-30k  
- FullStack: 32k-35k  

- 🧠 Analista +5k  
- 🧑‍🏫 Consultor +5-8k  
- 🏗️ Arquitecto +10-15k  

---

## 🌐 HTML

### 🏷️ Etiquetas HTML
Flechas: → , ← , ↑ , ↓ , ↗ , ↖ , ↘ , ↙
- `html` → (1) general
- `head` → (1) Cabeceras
- `body` → (1) Cuerpo
  - `h1`...`h6` → (2) secciones
  - `p` → (2) Párrafos
    - `strong` → (3) Negrita 
    - `em` → (3) Cursiva
    - `ins`→ (3) Subrayado 
    - `del` → (3) tachado  
    - `span`→ (3) fragmento texto 
  - `blockquote` → (2) Cita
  - `sup` → (3) Superindice
  - `sub`→ (3) subindice
  - `abbr` → (2) Abreviatura 
  - `dfn` → (2) Lista definición 
    - `br`→ (3) Salto de línea 
  - `pre` → (2) Texto preformateado
  - `code` → (2) Código

- `ul`→ (2) Lista sin ordenar
- `ol` → (2) Lista ordenada
  - `li` → (3) Elemento de lista

```html
<!-- Emmet: ul>li*5{Elemento 1.$} -->
<ul>
  <li>Elemento 1.1</li>
  <li>Elemento 1.2</li>
  <li>Elemento 1.3</li>
  <li>Elemento 1.4</li>
  <li>Elemento 1.5</li>
</ul>
```

Ejemplo de imagen convertida en enlace
```code
<a>
  <img>
</a>
```

- `img` → (2) Imagen
- `map` → (2) Mapa de imágenes
  - `area` → (3) Área (Circulo, polígono, rectángulo) 

- `table` → (2) Tabla 
  - `caption`→ (3) Titulo
  - `thead`→ (3)[Sem] Cabecera tabla
  - `tbody`→ (3)[Sem] Cuerpo
  - `tfoot` → (3)[Sem] Pie tabla
    - `tr` → (3-4) Fila
      - `th` → (4-5) Celda cabecera
      - `td`→ (4-5) Celda
 
- `form` → (2) Formulario 
  (Method: Post|Get), encriptado o por URL
  - `fieldset`→ (3) Recuadro
    - `legend` → (4) Titulo recuadro
    - `label`→ (4) Etiqueta de campo (enlace for->id)
    - `input`→ (4) Campo
    - `textarea` → (4) Área de texto 
  - Tipos Inputs: text, password, date, number, email, tel, submit, reset, color, radio, checkbox, range  
  - Atributos: required, placeholder, value, min, max  

> Etiquetas semánticas. Resto de etiquetas aumentan un nivel...
> NO puede haber 2 etiquetas semanticas iguales a distintos niveles seguidos ej. section... section
- `header` → (2) Cabecera de página
- `nav` → (2) Navegación
- `main` → (2) Zona principal
- `aside` → (2) Lateral
- `section` → (2) Sección
- `article` → (2) Contenido
> IMPORTANTE: Todos los section y article deben tener un h2...h6 o en su defecto un atributo aria-label
- `figure` → (2) Sección multimedia
  - `figcaption` → (3) Pie
- `footer` → (2) pie

### ⚙️ Atributos HTML
- `id` → identificador único  
- `class` → clase reutilizable  
- `style` → CSS en línea  

### ✅ Validadores HTML y CSS
- HTML → [https://validator.w3.org/](https://validator.w3.org/)  
- CSS → [https://jigsaw.w3.org/css-validator/](https://jigsaw.w3.org/css-validator/)  

---

## CSS

- https://csszengarden.com/

### Incluir CSS
1. CSS en línea
2. CSS en la cabecera (style)
3. CSS externo (link)
- `footer` → (2) pie

## 🎯 Selectores y Estructura

- `*` → Selector universal  
- `p`, `h1`, `span`, `section` → Selectores por etiqueta (,)  
- `.clase`, `#id` → Selectores por clase e ID  
- `p a` → Selector descendente  (espacio en blanco)
- `p > a` → Selector hijo  (>)
- `p + p a` → Selector hermano adyacente  (+)
- `[atributo=valor]` → Selector por atributo y/o valor

---

## 🎨 Colores y Fondo

- `color`  -> Color de la fuente
- `background-color`  -> Color de fondo
- `background-image`  -> Imagen de fondo
- `background-size`  -> Tamaño de fondo
- `background-repeat`  -> Repetición fondo (trama, imagen)
- `background-position`  ->Posición base
- `background-attachment`  -> Scroll,fixed
(NO ENTRA)
- `background-clip` ✅ CSS3  -> Hasta donde llega el fondo 
- `background-blend-mode` ✅ CSS3  -> Aplica efectos al fondo

---

## 🧱 Modelo de Caja (Box Model)

- `margin`, `margin-top`, `margin-bottom`, `margin-left`, `margin-right`  -> márgenes
- `padding`, `padding-top`, `padding-bottom`, `padding-left`, `padding-right`  -> rellenos
- `border`, `border-style`, `border-width`, `border-color` -> bordes 
- `width` -> Ancho
- `height`  -> Alto

---

## 🔡 Tipografía

- `font-family`  
- `font-size`  
- `text-decoration`  

---

## 📐 Unidades

- `em`, `ex`, `px`, `%`  -> Relativas
- `mm`, `pt`, `pc`  -> absolutas

---

## 📦 Visualización y Visibilidad

- `display`  
- `visibility`  

---

## 📌 Posicionamiento

- `position: static`  -> por defecto, flujo normal
- `position: relative`  -> Posicionas respecto al static
- `position: absolute`  -> Sales del flujo; posición respecto a su contenedor
- `position: fixed`  -> respecto a la ventana, Fijo
- `float`  -> flotante (left |right)
- `top`, `bottom`, `left`, `right`  -> Propiedades de traslado de coordenadas
- `z-index`  -> Capas
- `overflow`  -> Desbordamientos

---
 
## 🎨 Estilo y Tipografía

- `color` → Color de fuente  
- `font-family` → Fuente  (Arial, Verdana, courier)
- `@font-face` → Importar fuente personalizada  
- `font-weight` → Negrita (800/bold)
- `font-style` → Cursiva  
- `font-variant` → Versalitas (small-caps) 
- `font` → Shorthand para definir fuente completa  

---

## ✍️ Propiedades de Texto

- `text-align` → Alineación del texto  
- `line-height` → Interlineado  
- `text-decoration` → Subrayado, tachado  
- `text-transform` → Mayúsculas, minúsculas  
- `vertical-align` → Alineación vertical  
- `text-indent` → Sangría  
- `letter-spacing` → Espaciado entre letras  
- `word-spacing` → Espaciado entre palabras  
- `white-space` → Espacios en blanco  
- Pseudoelementos
  - `::first-line` -> Sangría de primera línea
  - `::first-letter` →  Letra Capital

---

## 🔗 Enlaces y Listas

Pseudoclases:
- `:link` -> Enlace NO visitado
- `:visited` -> Enlace visitado
- `:hover` -> Ratón por encima del elemento
- `:active` → Clic en el elemento

Listas: 
- `list-style-type` → Tipo de viñeta  
- `list-style-position` → Posición de la viñeta  
- `list-style-image` → Imagen como viñeta  

---

## 🗃️ Tablas

- `border-collapse` → Separación entre celdas  
- `border-spacing` → Espaciado entre celdas  
- `caption-side` → Posición del título de la tabla  
- `empty-cells` → Mostrar u ocultar celdas vacías  

---

## 📝 Formularios

- `display: inline-block` → Elemento en línea con comportamiento de bloque  
- `border-radius` → Bordes redondeados (CSS3)  
- `::placeholder` → Estilo del texto de sugerencia  
- `:focus` → Estilo al enfocar el input  

---

## 🌈 Novedades CSS3 - Parte 1

- `border-radius` → Bordes redondeados  
- `box-shadow` → Sombra de caja  
- `text-shadow` → Sombra de texto  
- `rgba()` → Colores con transparencia  
- `opacity` → Opacidad  
- `linear-gradient` → Fondo gradiente lineal
- `radial-gradient` → Fondo gradiente radial

---

## 🎬 Novedades CSS3 - Parte 2

- `transform` → Transformaciones (`scale`, `rotate`, `skew`, `translate`)  
- `transition-property` → Propiedades afectadas por transición  
- `transition-duration` → Duración  
- `transition-delay` → Retraso transición
- `transition-timing-function` → Curva de transición  

---

## 📦 Novedades CSS3 - Parte 3


- `display: flex` → Contenedor flexible (Flexbox)  
- `justify-content`, 
- `align-items` → Alineación en flex  
Nuevos selectores (Ej19)
- `:nth-child` -> Selector N hijo
- `:nth-of-type` → Selector N de tipo 

---

## 🧱 Novedades CSS3 - Parte 4

- `display: grid` → Diseño en cuadrícula (Grid Layout)  
- `grid-template-columns`, 
- `grid-template-rows` → Definir estructura  
- `gap` → Separación entre celdas  



---

## 📀 Virtualización

- 🧰 Oracle VirtualBox v7  
  - `sudo apt install virtualbox` → (7.0.16)  
  - [🔗 Linux Downloads](https://www.virtualbox.org/wiki/Linux_Downloads) (7.1.10)  
- 🖥️ VMWare  
- 🐶 Puppy Linux ISO  
  - [🔗 BookwormPup64 10.0.10](https://distro.ibiblio.org/puppylinux/puppy-bookwormpup/BookwormPup64/10.0.10/)


## MySQL

```console
sudo apt update
sudo apt upgrade
# Instalamos el servidor y el cliente
sudo apt install mysql-server mysql-client

# Para comprobar
sudo service mysql status

# Cambiar la contraseña del root
sudo mysql -u root
ALTER USER 'root'@'localhost'
IDENTIFIED WITH mysql_native_password
BY 'admin';
FLUSH PRIVILEGES;
```

## Instalar Workbench

```console
cd Descargas
wget https://dev.mysql.com/get/Downloads/MySQLGUITools/mysql-workbench-community_8.0.40-1ubuntu24.04_amd64.deb
sudo apt install ./mysql-workbench-community_8.0.40-1ubuntu24.04_amd64.deb
```
