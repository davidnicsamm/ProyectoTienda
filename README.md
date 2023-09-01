# ProyectoTienda
TP de administración de depósito de una tienda. Implementada con colecciones.

TRABAJO PRACTICO LAB JAVA 1

Nos han pedido implementar un sistema para una tienda en la que se venderán tres tipos de productos:
envasados, bebidas y de limpieza, considerando los siguientes requerimientos:

PARTE I – MODELO DEL SISTEMA

IMPORTANTE: Podrá definir todas las clases que considere necesarias, siempre que se ajusten a los
lineamientos que se detallan a continuación.
Un producto (sin importar el tipo que sea) deberá contar con las siguientes propiedades: identificador
alfanumérico de longitud 5, descripción del producto, cantidad en stock, precio por unidad (para la venta
al público) y costo por unidad (el valor al que se compró), y si está disponible para la venta.
Para los productos envasados:

● El identificador deberá respetar el formato ABXXX, donde XXX son dígitos. Por ejemplo,
AB112, AB345 serán identificadores válidos.
● Deberán contar con las propiedades de tipo de envase (plástico, vidrio o lata) y si es
importado o no.
Para las bebidas:


● El identificador deberá respetar el formato ACXXX, donde XXX son dígitos. Por ejemplo,
AC112, AC564 serán identificadores válidos.
● Deberán contar con una propiedad que indique si es alcohólica o no, y en caso de que lo
sea, deberá contar con la propiedad graduación alcohólica (porcentaje de alcohol que
posee), y si es importado o no.

Para los productos de limpieza:

● El identificador deberá respetar el formato AZXXX, donde XXX son dígitos. Por ejemplo,
AZ112, AZ564 serán identificadores válidos.
● Deberán contar con la propiedad tipo de aplicación que tendrá 4 valores posibles
(COCINA, PISOS, ROPA, MULTIUSO).

Se definirán dos interfaces:
- La primera para productos que sean comestibles y que deberá definir métodos para setear y
obtener la fecha de vencimiento y las calorías.
- La segunda para productos a los que se pueda aplicar descuento y que deberá definir métodos
para setear y obtener el porcentaje de descuento y para obtener el precio de venta con
descuento.
Estas interfaces deberán ser implementadas de acuerdo con lo que considere adecuado y teniendo en
cuenta que cualquier tipo de producto podrá aplicar descuentos.

Por último, tendremos una clase que representará la Tienda con los siguientes atributos: nombre,
número máximo de productos en stock, saldo en la caja y una colección que contendrá los productos
que se encuentran en stock (estén o no habilitados para la venta). Dicha colección se sugiere que sea
implementada como un diccionario de manera tal de poder acceder de forma rápida al listado
correspondiente a cada uno de los tres tipos de producto.

PARTE II – OPERACIONES DE LA TIENDA

La tienda deberá poder realizar las siguientes operaciones:
IMPORTANTE: Cada operación podrá ser implementada de la manera que crea más conveniente,
cumpliendo como mínimo con los lineamientos especificados para cada caso.
Compra de productos:
- Se podrá agregar cualquier tipo de producto a la tienda, el cual deberá ser ubicado en el listado
que corresponda.
- Por defecto todos los productos agregados estarán disponibles para la venta. - Por cada producto
agregado se deberá actualizar el saldo en la caja (el importe total del producto resulta de la
multiplicación del número de unidades por el precio de cada una). Si el saldo en la caja NO resulta
suficiente para cubrir dicho monto entonces el producto no podrá ser agregado. En este caso se
deberá imprimir un mensaje, por ejemplo: “El producto no podrá ser agregado a la tienda por
saldo insuficiente en la caja”.
- Se deberá tener en cuenta es que no se podrán agregar mas productos a la tienda una vez que se
haya alcanzado el máximo de stock habilitado (sumando todas las unidades de todos los
productos).
Venta de productos:
- Cada venta podrá incluir como máximo 3 productos de cualquier tipo y hasta 10 unidades de cada
uno.
- Para cada venta se deberá imprimir el detalle de la misma incluyendo los siguientes datos:
identificador, descripción, cantidad de unidades y precio de venta por unidad para cada producto
y al final el total de la venta.

Ejemplo de la impresión de una venta:

AB122 CAFÉ 2 x 1,50
AB455 ACEITE 2 x 20
TOTAL VENTA: 64,50

- En el caso de que el número de unidades vendidas de alguno de los productos sea mayor al que se
tenga en stock, se venderá solo el número de unidades disponibles y se deberá actualizar el
producto para que quede fuera de venta. Además, si se da el caso, se deberá agregar el siguiente
mensaje informativo luego del detalle de la venta “Hay productos con stock disponible menor al solicitado”.
- Solo podrán venderse productos que estén habilitados para la venta, caso contrario el producto
deberá ser eliminado de la venta y mostrar un mensaje al respecto. Por ejemplo: “El producto
AB122 CAFÉ no se encuentra disponible”.
Se deberán cumplir las siguientes consideraciones especiales:
- El porcentaje de ganancia de los productos comestibles no podrá superar el 20% y el de los
productos de limpieza no podrá ser menor del 10% ni mayor al 25%, excepto los de tipo ROPA y
MULTIUSO que no tendrán mínimo.
- El porcentaje de descuento de las bebidas no podrá superar el 15%, el de los envasados el 20% y el
de los productos de limpieza el 25%. Si el descuento a aplicar genera pérdidas por el producto
(su valor final de venta es inferior al valor por el que se compró) éste no se aplicará. Cuando esto
suceda, imprimir un mensaje como por ejemplo “El descuento registrado para el producto
AC123 no pudo ser aplicado”.
- Para los productos importados se aplicará un impuesto del 10% sobre el precio de venta.

PARTE III – REQUERIMIENTOS ADICIONALES
Se desea conocer la lista de productos comestibles NO importados cuyo descuento sea menor a un
determinado porcentaje.
Para ello se pide implementar un método llamado
obtenerComestiblesConMenorDescuento(porcentaje_descuento) que devolverá una lista de productos
comestibles (descripción) NO importados cuyo descuento sea menor al porcentaje pasado como
parámetro.
La lista deberá devolverse ordenada en forma ascendente de acuerdo con el precio de venta y con todas
las descripciones en mayúsculas.
Un resultado válido podría ser: “ACEITE, VINO, ARROZ”

También se desea conocer los productos que de cualquier tipo que estén generando ganancias inferiores
a un porcentaje determinado y la cantidad de ellos en stock. Para ello deberá implementar un método
llamado listarProductosConUtilidadesInferiores(porcentaje_utilidad). El resultado de esta será una lista
que indique el código, la descripción y la cantidad en stock de cada producto resultante, e imprimirlo.
BONUS (opcional): No utilizar bucles (for, while, do-while) ni tampoco condicionales (if-else) para
resolver el punto anterior, sino apoyarse en la API de Streams de Java.

PARTE IV - EJECUCION
Crear un programa ApplicacionTienda que cree productos de distinto tipo y realice operaciones con ellos
(generar combinaciones de prueba que permitan probar los diferentes casos planteados en los puntos
anteriores). Cada vez que se realice una operación de compra/venta se deberán imprimir los datos de
stock de el/los productos involucrados y el saldo resultante en la caja luego de realizarla. Se valorará que
se ilustren todos los casos posibles mediante ejemplos y que cada ejemplo se pueda ejecutar en forma independiente.

CONSIDERACIONES GENERALES

● La solución de este trabajo tendrá que ser subida a un repositorio git personal. Pueden utilizar
los servicios de GitHub o de Gitlab, y compartir el enlace a él en el classroom.
● Asígnele un nombre a su tienda y utilice éste para el nombramiento de los paquetes o clases, de
acuerdo a su preferencia. Recuerde que no puede utilizar el nombre de Neoris en ningún
elemento de la solución.
● La entrega será realizada hasta las 00:00 hrs del sábado 26 de agosto, horario de Bs. As.. Es decir,
la media noche del viernes.
● Asegúrese de que el repositorio al cual comparte su solución sea de acceso público.

