# <p align="center">Calculo de ventas en almacenes éxito enfocado en el área de dispositivos electrónicos.</p>

**INTRODUCCION**
* * *
  
*En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que requiere un creador del sistema operativo, que desea calcular      las   ventas en 3 meses de dispositivos electrónicos en almacenes éxito. Este almacén evalúa las compras realizadas en el almacén en el área tecnológica y            calcula el resultado final en las compras, además al final se tendrán en cuenta los descuentos y demás áreas de promoción empleadas en el almacén. Como        requerimiento básico para el programa se empleará el código del artículo, nombre, valor, y el descuento.*


**ACLARACIONES**
* * *

-	*Lo principal para el programa es calcular las ventas en 3 meses realizados en los almacenes éxitos en el área de dispositivos electrónicos.*
* *Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.*
+ *Como adherido al programa, en la finalización se empleare los descuentos de los dispositivos y se realizara un énfasis si se obtuvieron ganancias o pérdidas en las ventas.*

**ANALISIS DEL EJERCICIO**
* * *

> ***Generalidad:***

*Yo como creador del sistema operativo. 
Quiero realizar y crear un programa en el que se realice el cálculo en 3 meses de dispositivos electrónicos en almacenes éxito incluyendo sus descuentos u promociones. 
Todo en exclusividad para ver si al observar los descuentos se obtienen ganancias o pérdidas para los almacenes éxito.*

>***Escenarios:***

**Escenario 1:** *Ingresar la información correspondiente de los dispositivos electrónicos:*

**Given:** *Que soy el creador del sistema operativo.*

  1.  *Ingreso principalmente el código del producto.*
  2.  *Ingreso correctamente el nombre del producto.*
  3.  *Ingreso correctamente el valor del producto.*
  4.  *Ingreso como finalización el descuento del producto.*
  
**When:** *Seleccione la opción de calcular ganancias o pérdidas en los 3 meses.*
  
 **Then:** *Guardar exitosamente los valores de los 3 meses totales del almacén:*

  1.  *Incluyendo todos los datos principales mencionados anteriormente.*
  2.  *Incluyendo Descuentos.*
  3.  *Obtener datos de los cálculos.*
  4.  *Obtener resultado de las ganancias y pérdidas.*
  5.  *Obtener valores finales del programa.*

* * *
**COMPROBACION  DEL ANALISIS DEL EJERCICIO REALIZADO EN JIRASOFTWARE:**

![Image 1](Imagenes/PRUEBA_JIRA.png)


**APROXIMACION CASO DE USO**
* * *

*Descripcion caso de uso:*

- *Nombre: Calculo con descuentos de dispositivos electrónicos.*
* *Actores: Creador del Sistema Operativo.*
* *Propósito: Guardar código, nombre, valor y descuento del dispositivo para calcular el valor total de las ganancias y pérdidas.*
* **Curso Normal de Eventos:**

1.	El creador ingresa la cantidad de productos
2.	El creador ingresa el código, nombre, valor, descuento, mes 1, mes 2 y el mes 3 del producto en el Almacén. 
3.	Se calcula el valor total a partir de:   
( ∑((mes 1*descuento),( mes 2* descuento),( mes 3* descuento) / Total Productos) / Cant_Productos 
4.	Se Muestra el valor total de los productos en los tres meses.

* *Postcondiciones: Sistema de ganancias y pérdidas en Almacenes éxitos con descuentos en los tres meses calculado.*

* * *
**IMAGEN REFERENTE A LA APROXIMACION DEL CASO DE USO**
![Image 2](Imagenes/Caso%20de%20Uso.png)


**APROXIMACION DIAGRAMA DE FLUJO**
* * *

![Image 3](Imagenes/Diagrama%20en%20blanco.png)

*Entender el anterior diagrama no debe presentar mayores problemas. Sin embargo, es conveniente realizar las siguientes aclaraciones y comentarios:*

* *Aunque se puede condensar el código incluyendo las instrucciones del segundo “Para” dentro del primero, de manera intencional se ha dejado así intencionalmente para delimitar funcionalmente cada bloque de código.*
* *En el algoritmo se captura información, como el código, el nombre, el valor y el descuento, que no se utiliza; sin embargo, esta información se mantiene porque posteriormente puede ser útil para ampliar la funcionalidad de la aplicación. Inicialmente el algoritmo no contempla validaciones como impedir el doble ingreso de un mismo código del producto.*

**APROXIMACION PSEUDOCODIGO**
* * *

INICIO

      Caracteres: Codigos [50], Nombres [50], Valores [50], Descuentos [50] 
      
      Real: Mesuno [50], Mesdos [50], Mestres [50] 
      
      Caracteres: Codigo, Nombre, Valor, Descuento Entero: Cant_ProductoS, x 
      
      Real: Mes1, Mes2, Mes3, TOTAL <- 0 
      
      Imprimir: ‘Digite la cantidad de productos:’ 
      
      Asignar: Cant_Productos 
      
      Para x=0 hasta Cant_Productos - 1, 1 
      
      Imprimir: ‘Digite el codigo del producto:’ 
      
      Asignar: Codigo 
      
      Imprimir: ‘Digite el nombre del producto:’ 
      
      Asignar: Nombre 
      
      Imprimir: ‘Digite el valor del producto:’ 
      
      Asignar: Valor
      
      Imprimir: ‘Digite el valor del mes1:’ 
      
      Asignar: Mes1 
      
      Imprimir: ‘Digite el valor del mes2:’ 
      
      Asignar: Mes2 
      
      Imprimir: ‘Digite el valor del mes3:’ 
      
      Asignar: Mes3 
      
      Codigos_Producto [x]<-Codigo
      
      Nombres [x] <- Nombre 
      
      Valores [x] <- Valor
      
      Descuentos [x] <- Descuento 
      
      Mesuno[x] <- Mes1
      
      Mesdos[x] <- Mes2 
      
      Mestres[x] <- Mes3 
      
      finPara 
      
      Para x=0 hasta Cant_Productos -1, 1
      
      TOTALl+(((Mesuno[x]*Descuentos[x])+(Mesdos[x]*Descuentos[x])+(Mestres[x]*Descuentos[x]))/3)/ Cant_Productos 
      
      finPara 
      
      Imprimir: ‘El Total con descuento incorporado es:’ + TOTAL 
      
FIN

* * *
