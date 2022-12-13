# Tasca_s1_05
Java Utils

NIVELL 1:

- Exercici 1 --> 
Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

•	Obrim la terminal de Windows escrivint “cmd” en el buscador de la barra d’eines.

•	Compilem l’arxiu de la classe que hem creat (“Directory.java”) amb el comandament “javac”, seguit de la ruta on es troba en el nostre ordinador, i afegint “\Directory.java” al final de la ruta:

![image](https://user-images.githubusercontent.com/118254693/207462395-2f8b3119-f6c3-448b-9bb5-99b30a51f0c3.png)

•	Al compilar-se, es crea un arxiu .class amb el nom de la classe (“Directory.class”):

![image](https://user-images.githubusercontent.com/118254693/207462470-710d5213-4ba6-4edf-a42b-f73acd904806.png)

•	Utilitzant el comandament “java”, seguit de la ruta on es troba l’arxiu “Directory.java”, afegim la ruta del nostre ordinador que volem ordenar alfabèticament, en aquest cas la carpeta “GIT”. Així s’executarà la classe “Directory”, passant la ruta d’on es troba la carpeta “GIT” com a paràmetre, fent que s’imprimeixi en la terminal el contingut d’aquesta carpeta ordenat alfabèticament: 

![image](https://user-images.githubusercontent.com/118254693/207462512-1b4d40bd-43c6-4ce8-b015-d45c93f82c99.png)

- Exercici 2 --> 
Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.

•	Repetim el procés previ amb l’arxiu “Directory2.java”. El compilem amb javac per a generar l’arxiu .class (“Directory2.class”) i l’executem amb el comandament java, seguit de la ruta on es troba l’arxiu “Directory2.java” al nostre ordinador, i amb la ruta on volem que s’executi el codi. Aquest cop executarem el codi amb la ruta de l’escriptori de l’ordinador.   

•	Al executar , se’ns llista alfabèticament tot el contingut de l’escriptori, classificat amb una “F” els arxius, i amb una “D” els directoris. Alhora, en el cas dels directoris, també se’ns mostra el contingut de tots els seus nivells (recursivament). Finalment, s’indica la data de l’última modificació.

![image](https://user-images.githubusercontent.com/118254693/207462693-179236b0-d5da-45bf-8957-b95b376d1c18.png)

- Exercici 3 --> 
Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.

•	Repetim el mateix procés de compilar i executar amb l’arxiu “Directory3.java”. 

•	A diferència del cas anterior, se’ns imprimeix els directoris i arxius en un “fitxer.txt” que se’ns guarda en la ruta especificada.

![image](https://user-images.githubusercontent.com/118254693/207462874-79949d40-66f4-4fdf-99dc-7e87ca3c0712.png)

![image](https://user-images.githubusercontent.com/118254693/207462884-0457f495-d51c-4d61-8822-5598bf65bd2b.png)

![image](https://user-images.githubusercontent.com/118254693/207462907-0ee7860f-b244-48cf-b227-b1dad5831eb8.png)

- Exercici 4 --> 
Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

•	Seguint tots els passos prèviament indicats en els exercicis anteriors, imprimeix per terminal el contingut del document .txt indicat. En aquest cas, el creat en l’exercici anterior (“fitxer.txt”):

![image](https://user-images.githubusercontent.com/118254693/207463028-0f71c1b0-30bb-440d-a887-2e9a5133c5a7.png)

- Exercici 5 --> 
Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.

•	Tornem a compilar i executar l’arxiu “Main_Ser.java”. Aquest cop serialitza l’array de persones en el “fitxer.ser”, després la deserialitza i la imprimeix pel terminal:

![image](https://user-images.githubusercontent.com/118254693/207463122-d4664455-42c4-4946-bf76-a7842bddea40.png)

NIVELL 2:

- Exercici 1 -->
Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un fitxer de configuració.
Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons Configuration si ho prefereixes.
De l'exercici anterior, parametritza el següent:
1. Directori a llegir.
2. Nom i directori del fitxer TXT resultant.

•	En aquest cas, se’ns genera el “fitxer.txt” mitjançant un arxiu Java Properties anomenat “configuration.properties”.

![image](https://user-images.githubusercontent.com/118254693/207463318-60525dda-e798-4faa-ad4a-915526f9d5dd.png)

![image](https://user-images.githubusercontent.com/118254693/207463339-f578f7d5-4aa7-403e-ba58-8c6eee994c22.png)

![image](https://user-images.githubusercontent.com/118254693/207463359-fc1f5ece-f295-42eb-81e5-5d76cab883af.png)







