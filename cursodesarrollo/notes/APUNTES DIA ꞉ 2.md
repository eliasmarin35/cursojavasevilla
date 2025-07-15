---
title: "\U0001F4D8 Apuntes Clase Iván"
created: '2025-07-02T12:29:52.741Z'
modified: '2025-07-15T07:31:55.401Z'
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
    - `br`→ (3) Salto de líbea 
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
  (Post|Get), encriptado o por URL
  - `fieldset`→ (3) Recuadro
    - `legend` → (4) Titulo recuadro
    - `label`→ (4) Etiqueta de campo
    - `input`→ (4) Campo
    - `textarea` → (4) Área de texto 
  - Tipos Inputs: text, password, date, number, email, tel, submit, reset  
  - Atributos: required, placeholder, value, min, max  

> Etiquetas semánticas. Resto de etiquetas aumentan un nivel...
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
- `style` → CSS inline  

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


## Apuntes 14-07-25
- Instalación de Docker
Docker se basa en servicios Linux, su núcleo de servicio esta basado en Linux.

Es un "portacontenedores".
Puedes tener un numero de "contenedores" hasta donde tu disco duro te llege.

Las máquinas virtuales y dockers están aislados del resto del sistema. Se pueden usar a la vez pero los conceptos son distintos:

Cada máquina virtual tiene su propio sistema operativo.
La máquina virtual tiene el hipervisor que te permite comunicar la virtual con la máquina física (eso no está en docker).
Los contenedores comparten el kernel* entre ellos, que solo contienen binarios y librerias.
El kernel* es como el gerente, que se encarga de coordinar lo que pide el software con lo que puede hacer el hardware.
El kernel (o núcleo) es el corazón del sistema operativo. Es un programa fundamental que se encarga de comunicar el hardware de tu computadora con el software que estás usando.

Para Windows 10
Estos dos comandos:

dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart

dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart

wsl --install -d ubuntu
Para Windows 11
Intalar el wsl2 (windows subsistem for linux), para instalar una distribución Linux en Windows
Abrimos powersehll > Abrimos como administrador > y ejecutamos los siguientes comandos:
wsl install
Reiniciar el PC
wsl --list --verbose
Para Linux
instalar terminal de genome:
sudo apt install gnome-terminal

actualizar
sudo apt update
sudo apt upgrade

instalamos:
sudo apt install apt-transport-https ca-certificates curl software-properties-common lsb-release

te pilla la clave privada, copiamos esto entero en la terminal:
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg

luego copiamos entero:
echo
"deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/docker-archive-keyring.gpg]
https://download.docker.com/linux/ubuntu
$(lsb_release -cs) stable" |
sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

despues este:
sudo nano /etc/apt/sources.list.d/docker.list

borramos xia, escribimos noble

ctrl + o y ctrl + x

cd Descargas

instalar cliente y demonio:
sudo apt install -y docker-ce docker-ce-cli containerd.io

el servicio del sistema que comunica:
ls /dev/kvm

OPCIONAL MANUALMENTE:
(opcional) Habilitamos manualmente KVM
modprobe kvm

Descargar:

https://www.docker.com/products/docker-desktop/

Descargar para linux
https://docs.docker.com/desktop/setup/install/linux/ubuntu/

Nos descargamos el DEB package
Luego en la terminal:

sudo apt install ./docker-desktop-amd64.deb

Seguir pasos para hacer GPG Key y así poder acceder a docker desktop.
https://docs.docker.com/desktop/setup/sign-in/#credentials-management-for-linux-users
Usuario público:
0D4E128E7C8F0C6ED259257557F8937C9DC56986
Nos vamos a la carpeta :

cd /home/angel/Documentos/Docker
Luego copiamos (current es la version 24):

docker pull node:current
Luego (si necesitamos la version 18):

docker pull node:18
Para ver que hay en el repositorio metemos en la terminal:

docker images
Para reproducir este html que escribimos en la consola:
-echo "

Hola desde Node
" > index.html
luego escribimos este comando entero en linux:

docker run -d --name nodeweb
-v "$PWD":/web
-p 3000:3000
node:current
sh -c "npm install -g http-server && http-server /web -p 3000"
Comandos para start y stop:

docker start
docker stop
Los contenedores arrancados se ven con:

docker ps
Para parar el contenedor:

docker stop (escirbir nº id sin parentesis)
Para borrar el contenedor:

docker rm (escribir id)
Antes de borrar hay que parar
Este comando sirve para ver los contenedores parados:

docker ps -a
Para eliminar la imagen:

docker rmi node:18
docker rmi node:current
Descargar mysql:

docker pull mysql:5.7

docker run -d
--name mysql57
-e MYSQL_ROOT_PASSWORD=root
-e MYSQL_DATABASE=tienda
-p 3304:3306
mysql:5.7

docker exec -it mysql57 mysql -u root -p

Para salir de mysql:

exit
Mongo DB
Base de datos no relacional
Saca datos concretos muy rapido.
Se usa en Disney, Amazon...

https://hub.docker.com/_/mongo

docker pull mongo
Inspeccionar caracteristicas de las imagenes:

docker image inspect mongo
Definir (crear) el contenedor:

docker create --name miMongo mongo:latest
Para arrancarlo:

docker start
Para pararlo:

docker stop miMongo
Para eliminarlo:

docker rm miMongo
(Hemos eliminado el contenedor pero no la imagen)

docker run -d
--name miMongoAvante
-p 27017:27017
-v mongo_data:/data/db
mongo

Para windowns es con comilla:

docker run -d --name miMongoAvante
-p 27017:27017 -v mongo_data:/data/db
mongo
Para entrar en la consola de mongodb.

docker exec -it miMongoAvante mongosh
```
