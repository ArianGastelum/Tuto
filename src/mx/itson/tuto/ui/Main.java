/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tuto.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.frankie.enumeradores.Tipo;
import mx.itson.tuto.entidades.Herramienta;
import mx.itson.tuto.entidades.Paso;
import mx.itson.tuto.entidades.Tutorial;

/**
 * Se asignan los valores a cada uno de las variables y listas y se imprimen en consola
 * 
 */
public class Main {
     public static void main (String[] args) {
         Tutorial tutorial = new Tutorial();
       tutorial.setNombre("Tutorial de como armar tu PC Gamer");
       tutorial.setDescripción("Armar una pc desde cero es todo lo que un buen técnico en Informática debería dominar. Es una habilidad única que debe adquirir para ser un experto en el área. Por ello, te mostramos los pasos de como hacerlo tú mismo. Los componentes pueden varias según los componentes que elegiste, por lo que deberás determinar el uso que le darás para escogerlos, cabe mencionar que esta guía es general para computadoras gamers actuales, ya que los pasos podrían variar según el tipo de ordenador");
         
       List<Herramienta> herramientas = new ArrayList<>();
       
       Herramienta herramienta1 = new Herramienta();
       herramienta1.setNombre("Una mesa con espacio suficiente para colocar todos los componentes");
       
       Herramienta herramienta2 = new Herramienta();
       herramienta2.setNombre("Un destornillador tipo estrella");
       
       Herramienta herramienta3 = new Herramienta();
       herramienta3.setNombre("El hardware que vamos a ensamblar");
       
        Herramienta herramienta4 = new Herramienta();
       herramienta4.setNombre("Pulsera anti-estática");
         
       herramientas.add(herramienta1);
       herramientas.add(herramienta2);
       herramientas.add(herramienta3);
       herramientas.add(herramienta4);
       
       tutorial.setHerramientas(herramientas);
       
        List<Paso> pasos = new ArrayList<>();
       Paso pasos1 = new Paso();
       pasos1.setOrden(1);
       pasos1.setDescripcion("Retira la placa base de su embalaje antiestático y colócala sobre la superficie de trabajo. Encuentra el zócalo de la CPU, que estará cubierto por una tapa protectora de plástico. En una esquina de la tapa de plástico, o más comúnmente, en el zócalo mismo, verás una flecha pequeña. Registra dónde se encuentra la flecha.\n" +
"\n" +
"Junto al zócalo de la CPU, verás una pequeña palanca de metal. Oprime la palanca hacia abajo y jala suavemente hacia un lado (alejándola del zócalo) para abrir la bandeja del zócalo.");
       
       Paso pasos2 = new Paso();
       pasos2.setOrden(2);
       pasos2.setDescripcion("Abre la CPU y retira el embalaje. Ten mucho cuidado al manipular la CPU, ya que tanto la CPU como el zócalo de la CPU son extremadamente susceptibles de sufrir daños físicos. Sostén la CPU por los bordes. Nunca toques los conectores en la parte inferior del chip, porque los dedos pueden imprimirles polvo o aceite e intenta no tocar tampoco la parte superior del chip.\n" +
"\n" +
"En la esquina de la CPU verás una flecha. Alinea esta flecha con la flecha en el zócalo y coloca suavemente la CPU en el zócalo.\n" +
"\n" +
"Una vez que hayas asentado suavemente la CPU, puedes bajar la palanca de retención y volver a colocarla en su sitio. Bajar la palanca requiere un poco de fuerza, pero la colocación de la CPU no.");
       
       Paso pasos3 = new Paso();
       pasos3.setOrden(3);
       pasos3.setDescripcion("Si deseas instalar una SSD M.2, este es un buen momento para hacerlo. Primero localiza la ranura de M.2 en la placa base. Es una ranura pequeña, horizontal, con un tornillo diminuto que la cruza. Si no la encuentras, si encuentras varias ranuras M.2 o si planeas instalar más de una SSD M.2, consulta el manual del usuario que vino con la placa base.");
       
       Paso pasos4 = new Paso();
       pasos4.setOrden(4);
       pasos4.setDescripcion("Instalar la refrigeración del CPU, Existen diferentes tipos de refrigeradores de CPU. Para conocer las instrucciones de instalación exactas, te recomendamos que consultes el manual que vino con el refrigerador de la CPU. ");
       
       Paso pasos5 = new Paso();
       pasos5.setOrden(5);
       pasos5.setDescripcion("Instalar la memoria RAM, Determina cuántas ranuras RAM tiene la placa base (la mayoría tienen dos o cuatro). Si vas a utilizar todas las ranuras RAM disponibles, simplemente inserta la RAM en su lugar. Si no vas a utilizar todas las ranuras RAM, consulta el manual del usuario para descubrir cuál es la configuración correcta y utiliza las ranuras RAM de manera apropiada.");
       
       Paso pasos6 = new Paso();
       pasos6.setOrden(6);
       pasos6.setDescripcion("Montar fuente de alimentación, Echa una mirada al gabinete y deduce dónde debería ir la PSU (probablemente en la parte inferior, cerca de la parte de atrás) y cómo podría ir orientada. Idealmente, querrás orientar la PSU de modo tal que el ventilador mira hacia afuera del gabinete (a través de una ventilación). Si el gabinete tiene un respiradero en la parte de abajo, puedes montar la PSU al revés, siempre que el respiradero en la parte de abajo reciba un flujo de aire decente cuando la PC esté terminada. ");
       
       Paso pasos7 = new Paso();
       pasos7.setOrden(7);
       pasos7.setDescripcion("Instalar placa madre en el gabinete, Cuando hayas colocado el protector de E/S, puedes instalar la placa base. Vuelve a verificar para estar seguro de que todos los cables estén pasados por el lugar correcto, y luego coloca la placa base (alinéala con el protector de E/S primero)onecta la fuente de alimentación a la placa base. Hay dos conexiones principales: un conector de CPU de 8 pines en la parte superior de la placa y un conector de 24 pines a un costado.. ");
       
       Paso pasos8 = new Paso();
       pasos8.setOrden(8);
       pasos8.setDescripcion(" Instalar GPU, Encuentra la ranura PCIe x16 en tu placa base. Será la ranura PCIe más larga y podría tener un color diferente a las otras. Si la placa base tiene más de una ranura PCIe x16, consulta el manual del usuario para ver si es necesario priorizar alguna ranura. Si se puede utilizar cualquier ranura, determina qué ranura utilizarás según dónde se coloquen los componentes. Es recomendable que la GPU tenga algo se espacio para ventilar. Retira la GPU de su embalaje antiestático y alinéala cuidadosamente con la abrazadera de retención posterior y la ranura en sí, luego empújala suavemente dentro de la ranura PCIe x16 (posiblemente escuches un clic). La pestaña de la PCIe en la placa base puede moverse a posición bloqueada, en caso de que tuvieras que volver a colocar la GPU.");
       
       Paso pasos9 = new Paso();
       pasos9.setOrden(9);
       pasos9.setDescripcion("Instalar el almacenamiento, El almacenamiento en general viene en dos tamaños, 2,5 pulgadas (HDD y SSD) y 3,5 pulgadas (HDD). La mayoría de los compartimientos de 3,5 pulgadas pueden aceptar unidades de 2,5 pulgadas, pero no a la . Cuando las unidades estén todas en su sitio, conéctalas a la placa base (utilizando un cable SATA, que debería haber venido con la unidad o con la placa base) y la fuente de alimentación. ");
       
       Paso pasos10 = new Paso();
       pasos10.setOrden(10);
       pasos10.setDescripcion("Instalar el sistema operativo de su preferencia, Conecta la unidad flash USB que contiene el sistema operativo, además de un monitor, mouse y teclado, y enciende la PC.\n" +
"\n" +
"La primera pantalla que veas te dirá que oprimas una tecla para ingresar a la configuración del sistema o el BIOS. Oprime la tecla para abrir el BIOS. (Si la pantalla titila muy rápidamente como para ver la clave, consulta el manual del usuario de la placa base.).  explora el BIOS hasta que encuentres la página de Arranque (podría llamarse \"Orden de arranque\" o \"Prioridad de arranque\"). Cambia el orden de arranque para que tu unidad flash USB esté en primer lugar" +
" ");
       
       Paso pasos11 = new Paso();
       pasos11.setOrden(11);
       pasos11.setDescripcion("Reinicia la computadora. La computadora se iniciará desde la unidad USB y aparecerá el instalador del sistema operativo. Sigue las instrucciones para finalizar la instalación. ");
       
       pasos.add(pasos1);
       pasos.add(pasos2);
       pasos.add(pasos3);
       pasos.add(pasos4);
       pasos.add(pasos5);
       pasos.add(pasos6);
       pasos.add(pasos7);
       pasos.add(pasos8);
       pasos.add(pasos9);
       pasos.add(pasos10);
       pasos.add(pasos11);
       tutorial.setPasos(pasos);
       
        tutorial.setUso(Tipo.GAMING);
       
         System.out.println("--Tutorial para armar una computadora--");
         System.out.println(tutorial.getUso());
         System.out.println("Descripción del tutorial:");
         System.out.println(tutorial.getDescripción());
         System.out.println("Herramientas que utilizarás:");
          
         for(Herramienta elem : herramientas){
        
    }
         System.out.println(herramientas);
         
         for(int i = 0; i < herramientas.size(); i++) {   
    System.out.print(herramientas.get(i));
} 
          
     }
}
