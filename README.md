# MagicApp

**MagicApp** es una aplicación Android diseñada para ayudar a los jugadores de **Magic: The Gathering** a gestionar su colección de cartas, construir mazos y analizar estadísticas.

## 🚀 Características
- 📜 **Consulta de cartas**: Explora el catálogo de cartas de MTG desde la API de **Scryfall**.
- 📦 **Gestión de colección**: Guarda en local las cartas que posees y su cantidad.
- 🃏 **Creación de mazos**: Construye mazos respetando las reglas de los distintos formatos de juego.
- 📊 **Estadísticas de mazos**: Analiza la curva de maná, distribución de colores y cantidad de cartas.
- 💾 **Almacenamiento local**: Usa **Room** para guardar datos y evitar descargas innecesarias.
- 🖼 **Carga optimizada de imágenes**: Descarga y almacena imágenes de cartas en local, con carga eficiente mediante **Coil**.

## 📦 Tecnologías Usadas
- **Lenguaje:** Kotlin
- **Base de Datos:** Room
- **API:** Scryfall
- **Carga de imágenes:** Coil
- **Interfaz gráfica:** XML

## 📥 Instalación y Configuración
1. Clona el repositorio:
```sh
   git clone https://github.com/diegoherrub/magicapp.git
   cd magicapp
```
Abre el proyecto en Android Studio.
Asegúrate de tener configurado el emulador o un dispositivo físico.
Ejecuta la app en tu dispositivo o en el emulador.

📡 Consumo de la API de Scryfall
La aplicación obtiene datos de cartas desde Scryfall. Se realiza una primera consulta para obtener las cartas y almacenarlas en la base de datos local.

🛠 Estado del Proyecto
[ ] Conexión con la API y almacenamiento en Room.
[ ] Implementación de la gestión de colección.
[ ] Creación de mazos con validación de formatos.
[ ] Visualización de estadísticas de mazos.

📖 **Full Documentation** → [View on GitHub Pages](https://diegoherrub.github.io/magicapp/)

📜 Licencia
Este proyecto está bajo la licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.
