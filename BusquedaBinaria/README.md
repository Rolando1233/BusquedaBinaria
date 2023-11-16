La búsqueda binaria es un tipo de búsqueda primaria que se aplica a arreglos ordenados. Consiste en comparar el elemento buscado con el elemento del medio del arreglo, y descartar la mitad en la que no puede estar. Luego se repite el proceso con la mitad restante, hasta encontrar el elemento o determinar que no está. La búsqueda binaria es más eficiente que la búsqueda secuencial, ya que reduce el número de comparaciones necesarias.

Proceso:
1. Ordenar la lista: La búsqueda binaria funciona mejor en listas ordenadas, ya que se basa en la capacidad de dividir la lista en partes iguales.

2. Establecer límites iniciales: Inicialmente, el algoritmo establece dos índices, uno al principio de la lista y otro al final. Estos índices delimitan la sección de la lista en la que se está buscando.

3. Calcular el punto medio: Se calcula el índice intermedio entre los límites actuales.

4. Comparar con el elemento buscado: Se compara el elemento en el índice intermedio con el elemento que se está buscando.

5. Ajustar los límites: Dependiendo del resultado de la comparación, se ajustan los límites de búsqueda. Si el elemento en el índice intermedio es igual al elemento buscado, se ha encontrado la posición. Si es menor, se ajusta el límite inferior para buscar en la mitad superior de la lista. Si es mayor, se ajusta el límite superior para buscar en la mitad inferior de la lista.

6. Repetir: El proceso se repite hasta que se encuentra el elemento o hasta que los límites de búsqueda se cruzan.

Algoritmo:

Dado un vector A de n elementos con valores A0 ... An−1, ordenados tal que A0 ≤ ... ≤ An−1, y un valor buscado T, el siguiente procedimiento usa búsqueda binaria para encontrar el índice de T en A.

Asignar 0 a L y a R (n − 1).
Si L > R, la búsqueda termina sin encontrar el valor.
Sea m (la posición del elemento del medio) igual a la parte entera de (L + R) / 2.
Si Am < T, igualar L a m + 1 e ir al paso 2.
Si Am > T, igualar R a m – 1 e ir al paso 2.
Si Am = T, la búsqueda terminó, retornar m.

    Inicializar dos índices, L y R, al principio y al final del vector, respectivamente.

    Si L es mayor que R, la búsqueda termina sin encontrar el valor. Esto significa que el valor buscado no está en la lista.

    Calcular el índice medio, m, como la parte entera de (L + R) / 2.

    Comparar el elemento en la posición m (Am) con el valor buscado, T.

    Si Am es menor que T, ajustar "L(limite inferior)" a "m" + 1 e ir al paso 2. Esto reduce la búsqueda a la mitad superior del vector.

    Si Am es mayor que T, ajustar "R(limite superior)" a "m" – 1 e ir al paso 2. Esto reduce la búsqueda a la mitad inferior del vector.

    Si Am es igual a T, la búsqueda ha terminado y se retorna el índice m, que es la posición del valor buscado en el vector.

Este algoritmo se repite hasta que se encuentra el valor o hasta que L es mayor que R, indicando que el valor no está presente en el vector. La búsqueda binaria tiene una complejidad de tiempo de O(log n), lo que la hace muy eficiente en comparación con métodos de búsqueda lineal, especialmente para listas grandes.

La complejidad de tiempo de O(log n) significa que, a medida que el tamaño de la lista crece, el tiempo de ejecución del algoritmo de búsqueda binaria crecerá de manera logarítmica. Este es un comportamiento altamente eficiente en comparación con algoritmos de complejidad lineal (O(n)) u otros de mayor complejidad.

Esto significa que la búsqueda binaria puede manejar listas muy grandes de manera eficiente, ya que el tiempo de ejecución no aumenta de manera proporcional al tamaño de la lista, sino de manera logarítmica. Este rendimiento hace que la búsqueda binaria sea una opción eficiente para la búsqueda en listas ordenadas.
