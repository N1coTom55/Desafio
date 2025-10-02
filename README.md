# 🏆 Simulador de Evaluación de Estudiantes – CodeChads Academy

**Escenario:**
En CodeChads Academy, los estudiantes compiten para convertirse en el próximo *Stone Chad del Backend*.
Cada estudiante rinde **5 pruebas** durante el curso, con puntajes entre `0` y `100`.

---

## 📌 Primera Parte: Cálculo de notas

El estudiante debe rendir 5 exámenes.

* Los **primeros 3 puntajes** se cargan manualmente.
* Las **notas 4 y 5** se calculan automáticamente:

### 🔹 Nota 4

* Si la **nota 2 < 60**, la nota 4 = `100` (por trabajo práctico extra).
* Si la **nota 2 ≥ 60**, la nota 4 = nota 2.

### 🔹 Nota 5

* Si **nota 1 + nota 3 > 150**, la nota 5 = `95`.
* En otro caso, la nota 5 = `70`.

---

## 📌 Segunda Parte: Análisis de resultados

Con las 5 notas completas, realizar:

### ✅ 1. Verificar aprobaciones

Una nota se aprueba si es `≥ 60`.
Mostrar si el alumno aprobó **todas**, **ninguna** o **algunas**.

* `"Resultado: Aprobaste todas. ¡Backend Sensei!"`
* `"Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!"`
* `"Resultado: Algunas aprobadas. Sos un refactor en progreso."`

---

### ✅ 2. Prueba más inconsistente

Detectar la **mayor variación** entre dos pruebas consecutivas y mostrar:

```
Mayor salto fue de 35 puntos entre la prueba 2 y la prueba 3.
```

---

### ✅ 3. Bonus por progreso

Si el alumno **mejora en cada prueba respecto a la anterior**, mostrar:

```
¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈
```

---

### ✅ 4. Mostrar notas ordenadas (sin usar sort)

Imprimir las notas **de mayor a menor**, implementando un ordenamiento manual.

---

### ✅ 5. Evaluación final por nivel

Según el total acumulado de las 5 notas:

* **Total < 250** → `"Normie total 😢"`
* **250–349** → `"Soft Chad"`
* **350–449** → `"Chad"`
* **450+** → `"Stone Chad definitivo 💪"`

---

### ✅ 6. (Desafío final) Ranking de varios alumnos

Simular una clase con **4 estudiantes**, cada uno con sus 5 notas. Mostrar:

1. Qué estudiante obtuvo el **promedio más alto**.
2. Cuál fue el **más regular** (menor desviación entre notas).
3. Quién tuvo el **peor rendimiento en la tercera prueba**.

👉 Se recomienda usar:

* `int[][]` (matrices para almacenar las notas)
* Acumuladores
* Arrays auxiliares
* Bucles dobles

---

## 📚 Conceptos de Java aplicados

* Arrays (`int[]`) y matrices (`int[][]`)
* Condicionales (`if`, `else if`, `else`)
* Bucles (`for`, `foreach`)
* Funciones auxiliares (`métodos estáticos`)
* Algoritmos de ordenamiento (ej. burbuja)
* Entrada de datos (`Scanner`) o valores fijos

---

## 🚀 Objetivo

Este simulador permite practicar:

* **Estructuras de control**
* **Manejo de arrays**
* **Pensamiento algorítmico**
* **Buenas prácticas de programación**

El desafío está pensado para consolidar fundamentos de Java de forma divertida.

---
