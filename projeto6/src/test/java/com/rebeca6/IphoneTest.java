package com.rebeca6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IphoneTest{

 //ipod   
@Test
void musicaTocando(){
Iphone iphone = new Iphone(); 
String musicaEsperada = "That´s Life"; 
iphone.tocar(musicaEsperada);
Assertions.assertEquals(musicaEsperada, iphone.estaTocando());
}

//ipod
@Test 
void bandaEstaTocando(){
Iphone iphone = new Iphone();
String bandaEsperada = "Frank Sinatra";
iphone.selecionarBanda(bandaEsperada);
Assertions.assertEquals(bandaEsperada, iphone.bandaTocando());
}

 //telefone
@Test
void ligandoParaContato(){
 Iphone iphone = new Iphone(); 
 String ligaçaoEsperada = "123456"; 
 iphone.ligar(ligaçaoEsperada);
 Assertions.assertEquals(ligaçaoEsperada, iphone.estaLigando());
}

//ipod 
@Test
void musicaEstaPausada() {
Iphone iphone = new Iphone();
iphone.pausarMusica(); 
Assertions.assertTrue(iphone.pausandoMusica());
}

//ipod
@Test
void musicaEstaAvançando(){
Iphone iphone = new Iphone();
iphone.avançarMusica();
Assertions.assertTrue(iphone.avançandoMusica());
}

//ipod
@Test
void musicaEstaRetrocedendo(){
 Iphone iphone = new Iphone(); 
 iphone.retrocederMusica();  
 Assertions.assertTrue(iphone.retrocedendoMusica()); 
}

//ipod
@Test
void musicaEstaSendoSelecionada(){
    
}

}