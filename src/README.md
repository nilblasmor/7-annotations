**Nivell 1: Anotacions bàsiques**

En aquest primer nivell aprendràs a fer servir **annotations integrades a Java**, com `@Override` i `@Deprecated`, per millorar la claredat i el manteniment del teu codi. Ho faràs dins d'una **jerarquia de classes**, posant en pràctica **l'herència** i **el polimorfisme**. A més, veuràs com marcar mètodes com a obsolets i com gestionar aquests casos des del punt de vista del desenvolupador.

Objectiu: Familiaritzar-se amb l’ús pràctic d’anotacions estàndard i entendre com afecten l’execució i la llegibilitat del codi.

**Exercici 1 - Override**

Crea una jerarquia d’objectes amb tres classes: Treballador, TreballadorOnline i TreballadorPresencial.

La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode `calcularSou()` que rep per paràmetre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure, emprant `@Override`.

Des del `main()` de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació `@Override`.

En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor d'un atribut `static` anomenat `benzina` que afegirem en aquesta classe.

En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe `TreballadorOnline`.

**Exercici 2 - Deprecated**

Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser obsolets.
