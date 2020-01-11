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

<img src="https://github.com/gitfrandu4/Kata3/blob/master/imgs/ejemplo_kata3.png" alt="ejemplo_kata3" style="zoom:75%;" />

### Kata3 versión 1

<img src="https://github.com/gitfrandu4/Kata3/blob/master/imgs/Kata3_v1.png" alt="Kata3_v1" style="zoom:75%;" />

De forma general, el esquema a seguir es el siguiente:

```
// 1 CLASE HistogramDisplay => se extiende ApplicationFrame
	// 2 Constructor de HistogramDisplay  se invoca al constructor
		de la superclase y se establece un contenedor de tipo chartPanel.
	// 3 método execute() => se hace visible el frame.
	// 4 método JPanel() => se inserta un panel.
	// 5 método createChart() => se crea un Diagrama de Barras.
	// 6 método createDataSet() => se crea el conjunto de datos.

// 7, 8 CLASE KATA3 => se instancia un objeto HistogramDisplay y sobre
	este objeto se invoca al método execute()
```



### Kata3 versión 2

<img src="https://github.com/gitfrandu4/Kata3/blob/master/imgs/Kata3_v2.png" alt="Kata3_v1" style="zoom:75%;" />

De forma general, el esquema a seguir es el siguiente:

```
// 1 CLASE Histogram
	// 2 Se define un mapa de clave genérica y valores enteros.
	// 3 método get() => para el mapa, se devuelve el valor correspondiente 
		a una clave.
	// 4 método keySet() => devuelve el conjunto de claves del mapa.
	// 5 método increment() => se rellena el mapa.

// 6 CLASE HistogramDisplay
	// se crea una variable global de tipo Histogram
	// 7, 8 se modifica constructor => se pasa como parámetro un objeto 
		Histogram y dentro del constructor se hace referencia a este objeto.
	// 9 método dataSet() => se reemplazan todos los métodos addValue por 
		uno solo dentro un bucle

// 10, 11, 12 CLASE Kata3 => se instancia un objeto Histogram y sobre este
	objeto se llama al método increment(). Se invoca al método execute()

```

