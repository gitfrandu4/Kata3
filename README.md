# Kata3
## Representación gráfica de un Histograma

**Objetivos**
* Dado un conjunto de emails calcular el histograma de los dominios y visualizarlo. 

Utilizaremos la librería **JFreeChart** para el histograma. 

### Introducción

`JFreeChart` es una biblioteca de código abierto disponible para Java que permite a los usuarios generar fácilmente gráficos. 

Los tipos de gráficos que se pueden crear con `JfreeChart`son varios: XY, diagramas de barras, diagramas de tarta, diagramas de series temporales, etc. 

* Para definir un conjunto de datos y crear con ellos un diagrama de barras hay que usar un objeto de la clase: `DefaultCategoryDataset`.
* Los valores pueden ser añadidos al conjunto de datos usando el método:
  * `addValue(double value, Comparable rowKey, Comparable columnKey)`
* Para generar un Diagrama de Barras de la clase `JFreeChart`se usa el método: 
  * `ChartFactory.createBarChart()`

En nuestra aplicación, Kata3, el orden seguido es:

1. Hacer visible una **ventana** (`Frame`)
2. Insertar un **Panel** de tipo **ChartPanel**
3. Insertar en el **Panel** un **Chart** de tipo **JFreeChart**
4. Crear un **Dataset** de tipo **DefaultCategoryDataset**

<img src="C:\Users\jdelh\Dropbox\40822 - Ingeniería de Software II\Prácticas en Laboratorio\Kata3\Kata3\imgs\ejemplo_kata3.png" alt="ejemplo_kata3" style="zoom:75%;" />

### Kata3 versión 1

<img src="C:\Users\jdelh\Dropbox\40822 - Ingeniería de Software II\Prácticas en Laboratorio\Kata3\Kata3\imgs\Kata3_v1.png" alt="Kata3_v1" style="zoom:75%;" />