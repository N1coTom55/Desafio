package Desafios;

/* 
Simulador de Evaluación de Estudiantes “CodeChads Academy”

Escenario del ejercicio:
CodeChads Academy, una academia de programación en donde los estudiantes compiten para convertirse en el próximo Stone Chad del Backend. Cada estudiante rinde 5 pruebas diferentes a lo largo del curso, y recibe un puntaje entre 0 y 100 en cada una.

------------------------1era Parte--------------------------
El estudiante debe rendir 5 exámenes. Los primeros 3 puntajes ya están disponibles, pero los dos últimos se deben calcular automáticamente:
●	Si la nota 2 fue menor a 60, la nota 4 será 100 (porque hizo un trabajo práctico extra). Si fue mayor a 60 entonces la nota 4 será igual a la nota 2.
●	Si la suma de las notas 1 y 3 supera 150, la nota 5 será 95, sino 70.



-----------------------2da Parte---------------------------
Teniendo ya precargados los valores de las primeros 5 examenes, continua el flujo : 
✅ 1. Verificar si aprobó todas:
●	Una nota es aprobada si es mayor o igual a 60. Mostrar si el alumno aprobó todas, ninguna o algunas.
"Resultado: Aprobaste todas. ¡Backend Sensei!"
"Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!"
"Resultado: Algunas aprobadas. Sos un refactor en progreso."

✅ 2. Prueba más inconsistente:
Detectar cuál fue la mayor variación entre dos pruebas consecutivas y en qué lugar ocurrió.
●	"Mayor salto fue de 35 puntos entre la prueba 2 y la prueba 3."

✅ 3. Bonus por progreso:
●	Si el alumno mejora su nota en cada prueba respecto a la anterior, mostrar:
○	"¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈"

✅ 4. Mostrar notas ordenadas (sin usar sort):
●	Imprimí las notas ordenadas de mayor a menor sin usar Arrays.sort()

✅ 5. Evaluación final por nivel
●	Según el total acumulado, mostrar un rango personalizado:
●	Total < 250 → "Normie total 😢"
●	250–349 → "Soft Chad"
●	350–449 → "Chad"
●	450+ → "Stone Chad definitivo 💪"

✅ 6. (Desafío final) Ranking entre varios alumnos
●	Simulá una clase con 4 estudiantes, cada uno con sus 5 notas. Mostrá:
●	Qué estudiante obtuvo el promedio más alto
●	Cuál fue el más regular (menor desviación entre notas).
●	Quién tuvo el peor rendimiento en la tercera prueba.

Considera aplicar:
●	int[][]
●	Acumuladores
●	Arrays auxiliares
●	Bucles dobles
*/

public class CodeChadsAcademy {
    // 1ra Parte: Cálculo de Notas de un Estudiante Individual 
    public static void main(String[] args) {
        // Notas iniciales del estudiante
        // Nota 2 (nota2 = 55) activa el bonus de la nota 4 (nota4)
        int nota1 = 85, nota2 = 55, nota3 = 70, nota4 = 0, nota5 = 0;

        System.out.println("Simulador de Evaluación de Estudiantes 'CodeChads Academy'\n");
        System.out.println("1ra Parte: Cálculo de Notas Individuales\n");

        // Lógica para calcular la Nota 4 
        // Si la nota 2 fue menor a 60, la nota 4 será 100 
        if (nota2 < 60) {
            nota4 = 100;
        } else {
            // Si fue mayor o igual a 60, la nota 4 será igual a la nota 2 
            nota4 = nota2;
        }
        System.out.println("Nota 4 (condicional a Nota 2): " + nota4);

        // Lógica para calcular la Nota 5
        // Si la suma de las notas 1 y 3 supera 150, la nota 5 será 95, sino 70
        if ((nota1 + nota3) > 150) {
            nota5 = 95;
        } else {
            nota5 = 70;
        }
        System.out.println("Nota 5 (condicional a Nota 1 + Nota 3): " + nota5);

        // Array que contiene las 5 notas finales
        int[] notas = {nota1, nota2, nota3, nota4, nota5};
        System.out.println("Notas finales del estudiante: ");
        for (int nota: notas) {
            System.out.print(nota + " ");
        }

        System.out.println("\n----------------------------------------");

        // 2da Parte: Evaluación y Métricas
        System.out.println("\n 2da Parte: Evaluación y Métricas \n");
        // ✅ 1. Verificar si aprobó todas
        // Una nota es aprobada si es mayor o igual a 60.
        int notasAprobadas = 0;
        for (int nota: notas) {
            if (nota >= 60) {
                notasAprobadas++;
            }
        }

        if (notasAprobadas == notas.length) {
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (notasAprobadas == 0) {
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        } else {
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
        }
        System.out.println("----------------------------------------");

        // 2. Prueba más inconsistente
        int mayorSalto = 0, saltoDePruebaIndex = 0; // saltoDePruebaIndex - Índice de la segunda prueba del salto (ej. 1 para salto entre prueba 1 y 2)

        // Iteramos de la segunda nota (índice 1) a la última
        for (int i = 1; i < notas.length; i++) {
            // Se usa Math.abs() para obtener el valor positivo (valor absoluto)
            int salto = Math.abs(notas[i] - notas[i - 1]);
            if (salto > mayorSalto) {
                mayorSalto = salto;
                saltoDePruebaIndex = 1;
            }
        }
        // Mostramos la prueba (índice + 1) y la siguiente
        System.out.println("Mayor salto: " + mayorSalto + " puntos entre la prueba " + saltoDePruebaIndex + " y la prueba " + (saltoDePruebaIndex + 1) + ".");
        System.out.println("----------------------------------------");

        // ✅ 3. Bonus por progreso 
        boolean esProgresivo = true;
        for (int i = 1; i < notas.length; i++) {
            // Si la nota actual NO mejora estrictamente a la anterior
            if (notas[i] <= notas[i - 1]) {
                esProgresivo = false;
                break;
            }
        }

        if (esProgresivo) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
        } else {
            System.out.println("Progreso no constante.");
        }
        System.out.println("----------------------------------------");

        // ✅ 4. Mostrar notas ordenadas (sin usar sort)
        int[] notasOrdenadas = notas.clone(); // Creamos una copia para no alterar el array original
        int n = notasOrdenadas.length;

        //Bucle para pases
        for (int i = 0; i < n - 1; i++) {
            // Bucle de comparación
            for (int j = 0; j < n - 1; j++) {
                // Si el elemento actual es menor que el siguiente, se intercambian
                if (notasOrdenadas[j] < notasOrdenadas[j + 1]) {
                    int temp = notasOrdenadas[j];
                    notasOrdenadas[j] = notasOrdenadas[j + 1];
                    notasOrdenadas[j + 1] = temp;
                }
            }
        }

        System.out.println("Notas ordenadas (Mayor a Menor): ");
        for (int nota : notasOrdenadas) {
            System.out.print(nota + " ");
        }
        System.out.println("\n----------------------------------------");

        // ✅ 5. Evaluación final por nivel
        int totalAcumulado = 0; 
        for (int nota : notas) {
            totalAcumulado += nota;
        }

        System.out.println(" Total acumulado: " + totalAcumulado);

        // Clasificación según el total acumulado
        if (totalAcumulado < 250) {
            System.out.println("Evaluación: Normie total 😢");
        } else if (totalAcumulado < 349) {
            System.out.println("Evaluación: Soft Chad 😎");
        } else if (totalAcumulado < 449) {
            System.out.println("Evaluación: Chad 🗿");
        } else { // totalAcumulado >= 450
            System.out.println("Evaluación: Stone Chad definitivo 💪");
        }
        System.out.println("----------------------------------------");

        // Llamada al Desafío Final
        rankingFinal();
    }

    // ✅ 6. (Desafío final) Ranking entre varios alumnos
    public static void rankingFinal() {
        System.out.println("\n--- 6. Desafío Final: Ranking entre 4 Alumnos (int[][]) ---\n");

        // Nombres de los estudiantes para la salida
        String[] nombres = {"Estudiante A", "Estudiante B", "Estudiante C", "Estudiante D"};

        // Array Bidimensional (int[][]): 4 filas (estudiantes), 5 columnas (notas)
        int[][] notasClase = {
            // N1, N2, N3, N4, N5
            {85, 55, 70, 100, 70}, 
            {90, 80, 75, 80, 95}, 
            {60, 60, 60, 60, 60}, // El más regular
            {100, 20, 50, 20, 100} // El de peor rendimiento en N3
        };

        // 1. Qué estudiante obtuvo el promedio más alto 
        double maxPromedio = -1.0;
        String mejorEstudiante = "";
        
        // Uso de bucles dobles para recorrer estudiantes y sus notas
        for (int i = 0; i < notasClase.length; i++) { // Bucle exterior: Recorre estudiantes
            int total = 0; // Acumulador para la suma
            for (int nota : notasClase[i]) { // Bucle interior: Recorre las 5 notas
                total += nota;
            }
            // Se realiza la conversión a double para obtener el promedio
            double promedio = (double) total / notasClase[i].length; 

            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                mejorEstudiante = nombres[i];
            }
        }
        System.out.println("✅ Estudiante con el promedio más alto: " + mejorEstudiante + " con un promedio de " + String.format("%.2f", maxPromedio));


        // 2. Cuál fue el más regular (menor desviación entre notas)
        // Medida simplificada de regularidad: Menor diferencia entre la nota Máxima y la Mínima del estudiante.
        int minDiferencia = 101; // Inicializado mayor que la diferencia máxima posible (100)
        String masRegular = "";

        for (int i = 0; i < notasClase.length; i++) {
            int maxNota = -1; // Inicializado menor que cualquier nota posible (0-100)
            int minNota = 101; // Inicializado mayor que cualquier nota posible (0-100)

            // Encontramos la nota más alta y la más baja del estudiante
            for (int nota : notasClase[i]) {
                if (nota > maxNota) {
                    maxNota = nota;
                }
                if (nota < minNota) {
                    minNota = nota;
                }
            }

            int diferencia = maxNota - minNota;
            if (diferencia < minDiferencia) {
                minDiferencia = diferencia;
                masRegular = nombres[i];
            }
        }
        System.out.println("✅ Estudiante más regular (Menor diferencia Max/Min): " + masRegular + " con una diferencia de " + minDiferencia + " puntos.");


        // 3. Quién tuvo el peor rendimiento en la tercera prueba 
        // La tercera prueba se encuentra en el índice 2 (índices: 0, 1, 2, 3, 4)
        final int INDICE_TERCERA_PRUEBA = 2; // Buena práctica: usar constante para el índice
        int peorNotaTercera = 101; // Inicializado mayor que cualquier nota posible
        String peorEstudianteTercera = "";

        for (int i = 0; i < notasClase.length; i++) {
            // Accedemos directamente a la columna del índice 2 para cada estudiante (fila i)
            int notaTercera = notasClase[i][INDICE_TERCERA_PRUEBA];

            if (notaTercera < peorNotaTercera) {
                peorNotaTercera = notaTercera;
                peorEstudianteTercera = nombres[i];
            }
        }
        System.out.println("✅ Estudiante con el peor rendimiento en la tercera prueba: " + peorEstudianteTercera + " con una nota de " + peorNotaTercera + ".");
        System.out.println("------------------------------------------------------------------");
    }
}
