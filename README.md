# Taller 2 [ICC-490]
### Nombres: David Baez - Emilio Jaramillo

#### Se deben desarrollar las siguientes funciones generales:
#### - 1. Crear matriz personas
#### - 2. Agregar personas
#### - 3. Contar la cantidad de personas con edad mayor o igual a 18
#### - 4. Contar la cantidad de personas con edad menor a 18.
#### - 5. Menu
#### - 6. Contar cantidad de personas de tercera
#### - 7. Contar cantidad de personas segun un estado civil

### En conjunto:
#### - 1. Crear matriz y crear menu.

### David Baez:
#### - 1. Cantidad de personas mayor,menor a 18 y tercera edad.
#### - 2. Pruebas unitarias de cantidad de personas mayor, menor a 18 y tercera edad.

### Emilio Jaramillo:
#### - 1. Agregar personas
#### - 2. Mostrar la cantidad de personas segun un estado civil.
#### - 3. Respectivas pruebas unitarias

## Errores encontrados:
#### - 1. La matriz de personas esta mal incializada, debido a que se define como string pero luego se indica que es un double
#### - 2. La mayoria de funciones se encuentran en el main, por lo que se encuentran variables globales, lo que no es correcto segun buenas practicas
#### - 3. Al estar mal declarado registro ninguna funcion que lo utilice funciona.
#### - 4. En las lineas 50, 63, 76 se encuentra una mala gestion de errores, ya que, se indica que debe ingresar un string y se encuentra una gestion de errores por si la entrada es invalida, pero al ser un string la entrada nunca se invalida.
#### - 5. En la linea 78 se intenta ingresar un string a una variable que es un int.
#### - 6. En la linea 102 la condicion double[] persona esta mal declarada.
#### - 7. En la linea 112 la variable queSera no sigue las buenas practicas de nombramiento.
#### - 8. En la linea 10 la opcion "a" es erronea, ya que es una opcion fuera de los limites establecidos.
#### - 9. En la linea 126 no se siguen las buenas practicas de nombramiento.
#### - 10. En la linea 132, el for se encuentra mal declarado y tambien se encuentra una declaracion redundante.
#### - 11. En las lineas 140 y 141, hay dos variables mal declaradas en base a las buenas practicas aprendidas.
#### - 12. En la linea 142 el for esta mal declarado.
#### - 13. En la linea 178 opa no sigue las buenas practicas de nombramiento ya que es un nombre que no explica lo que hace.
#### - 14. La funcion opa intenta devolver la cantidad de espacion ocupados, pero al encontrar el primer espacio devolvera el largo de la matriz menos 1 automaticamente.
#### - 15. la funcion obtenerUltimoEspacio, estaria correcta si la funcion opa funcionara.
#### - 16. En la linea 153 la variable "d" añade personas solteras pero en el print dice que son las personas casadas.





