
/*

Elabore Diagrama de Clases y un programa en JAVA utilizando un vector de objetos estático 
(recuerde además el uso de JFrame y JTable) registre la siguiente información 
correspondiente a un empleado:
		
ID EMPLEADO 
NOMBRE 
GENERO
SALARIO BASICO
ESTRATO 
HORAS EXTRA LABORADAS 
FECHA VINCULACION.

Realice el Objeto con los respectivo atributos y métodos, 
además de crear la clase vector que tendrá los métodos para el vector de objetos estático de los 
N empleados que se registrarán en el probador.

El probador deberá tener las siguientes opciones:

OK 1.Crear y Registrar N empleados en el vector de objetos de empleados.

2.Dado un ID Empleado el programa buscara su información en el vector y 
  si existe mostrar sus datos y el valor neto a pagar de ese empleado.
  El neto a pagar de cada empleado es calculado bajo las siguientes condiciones:

• Se debe descontar 4% del salario básico para aportes a salud, 3,75% 
    para aportes a pensión y 2% para ARL.
• Se debe sumar en el neto a pagar el devengado por horas extra 
    que se obtiene de la cantidad laborada por el valor de las H.E
• La hora extra tendrá un valor de $45.000 si el empleado tiene 
    más de 10 años en la empresa, de $35.000 si tiene entre 10 y 5 
    años, de $ 30.000 si tiene entre 5 y 3 años y de $ 25.000 si tiene menos de 3 años.
• Los empleados de ESTRATO 1 y 2 tienen un subsidio de transporte equivalente a $78.000.

Al finalizar se debe arrojar el detallado de nómina para el empleado donde 
especifica sus ganancias, descuentos y el neto a pagar así:

SUELDO BASICO			xxxxx
H.E LABORADAS			xxxxx	
VALOR H.E			xxxxx
TOTAL H.E			xxxxx
APORTE SALUD			xxxxx
APORTE PENSION			xxxxx
APORTE ARL			xxxxx	
SUBSIDIO TTE			xxxxx
NETO A PAGAR			XXXXXX

3.Generar un listado ordenando los empleados según su salario neto 
  de mayor a menor, para esto deben usar el método Quicksort.
4.Generar un listado con la información de los empleados, 
  ordenados alfabéticamente de forma ascendente por sus nombres.  
  Utilizar el método de ordenamiento por selección.
5.Generar un listado con la información de los empleados, 
  ordenados por estrato en forma descendentemente. Utilizar el método de ordenamiento Shell.
6. Salir.
*/

