
-- categorias
insert into categorias (id, nombre, puntos) values (null, 'Primera Categoria',5 );
insert into categorias (id, nombre, puntos) values (null, 'Segunda Categoria',7 );
insert into categorias (id, nombre, puntos) values (null, 'Tercera Categoria',10 );
insert into categorias (id, nombre, puntos) values (null, 'Cuarta Categoria',15 );
insert into categorias (id, nombre, puntos) values (null, 'Quinta Categoria',20);

-- preguntas
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 1, 'cuantas vocales existen');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 1, 'que son los numeros primos');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 1, 'capital de colombia');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 1, 'quien descubrio America');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 1, 'cuales son los numero naturales');


insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 2, 'Cual es el organo mas grande del cuerpo humano');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 2, 'cual es el hueso mas pequeño en el ser humano');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 2, 'cual es el mamifero terrestre mas grande y pesado');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 2, 'cual es el hueso mas grande en el cuerpo humano');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 2, 'cuantas vertebras tiene el ser humano');


insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 3, 'cuales son las raices de una funcion');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 3, 'cuantos son los paises de la union europea');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 3, 'capital de australia');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 3, 'que es una prueba acida en economia');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 3, 'con cuantos paises tiene fronteras colombia');


insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 4, 'los paises donde queda el monte everest');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 4, 'cuantos paises de sur america');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 4, 'capital de brasil');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 4, 'cuantas fichas diferentes tiene el juego de ajedrez');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 4, 'los estados de la luna son');


insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 5, 'en dragon ball z quien mata a frizer');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 5, 'en juego de tronos quien acaba con la larga noche');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 5, 'en la telenovela nuevo rico nuevo pobre cual es el apellido de la familia rica');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 5, 'quien mato a eliza');
insert into preguntas (id, id_categoria, titulo_pregunta) values (null, 5, 'en la serie de television Lost, donde se encuentran');

--respuetas


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 1, '28');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 1, '5');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 1, '4');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 1, 'todos los naturales');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 2, 'Son todos los numeros que tienen un familiar en comun ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 2, 'los 100 primeros numeros');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 2, ' Es un numero natural mayor que 1 que tiene unicamente dos divisores positivos distintos: el mismo y el 1');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 2, 'todos los naturales');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 3, 'Metropolis');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 3, 'Nueva york');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 3, 'Monteria');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 3, 'Bogota');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 4, 'Cristobal Colon');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 4, 'Simon Bolivar ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 4, 'Noe');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 4, 'Amparo Grisales');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 5, 'Son los numeros del 1 al 9');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 5, 'Son todos los numeros que se dividen por 2');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 5, 'Son aquellos que estan en la naturaleza');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 5, 'Son aquellos numeros naturales los que sirven para contar elementos');

insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 6, 'La Piel');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 6, 'El Colon ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 6, 'EL Higado');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 6, 'Los Pulmones');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 7, 'El Femur');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 7, 'El Humero');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 7, 'EL Estribo');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 7, 'La Traquea');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 8, 'La Jirafa');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 8, 'El Cerdo ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 8, 'EL Rinoceronte');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 8, 'El Elefante Africano');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 9, 'El Femur');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 9, 'El Humero');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 9, 'EL Estribo');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 9, 'La Traquea');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 10, '45');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 10, '78 ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 10, '24');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 10, '8');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 11, 'Cuando se iguala a 0');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 11, 'Que sea cuadratica');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 11, 'DE orden alfabetico');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 11, 'ninguna de las anteriores');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 12, '23');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 12, '67 ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 12, '27');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 12, '38');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 13, 'Gotham');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 13, 'Canberra ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 13, 'Nueva York');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 13, 'Londres');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 14, 'Probar si tiene mucho acido en las cuentas ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 14, 'Medir el capital de la empresa');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 14, 'frecuentemente usados como indicador de la capacidad de la empresa para cancelar sus obligaciones corrientes, sin contar con la venta de sus existencias');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 14, 'Saber si tienen bastante limones ');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 15, '12');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 15, '8');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 15, '9');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 15, '5');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 16, 'Nepal, China, Reino del Tibet');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 16, 'Japon, Korea, Tailandia ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 16, 'Colombia, Ecuador, Peru');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 16, 'Alemania, Francia, España');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 17, '25');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 17, '16 ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 17, '13');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 17, '12');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 18, 'Gibraltar');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 18, 'Brazilia ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 18, 'Buenos Aires');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 18, 'Caracas');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 19, '16');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 19, '56 ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 19, '7');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 19, '4');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 20, '12');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 20, '56 ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 20, '8');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 20, '4');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 21, 'Bulma');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 21, 'Goku ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 21, 'Vegeta');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 21, 'trunks');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 22, 'Bran Stark');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 22, 'Hodor ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 22, 'Arya Stark');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 22, 'Jon Snow');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 23, 'Galindo');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 23, 'Pelaez ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 23, 'Ferreira');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 23, 'Sanmiguel');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 24, 'Adelaida');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 24, 'Maria Antonia ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 24, 'Cristobal');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 24, 'Vicente');


insert into respuestas (id, correcta, id_pregunta, titulo) values (null, true, 25, 'Muertos');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 25, 'En una isla ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 25, 'En un avion ');
insert into respuestas (id, correcta, id_pregunta, titulo) values (null, false, 25, 'En altamar');





