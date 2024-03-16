package com.rebeca6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IphoneTest{

    
@Test
void musicaTocando(){
Iphone iphone = new Iphone(); 
String musicaEsperada = "That´s Life"; 
iphone.tocar(musicaEsperada);
Assertions.assertEquals(musicaEsperada, iphone.estaTocando());
}


@Test 
void bandaEstaTocando(){
Iphone iphone = new Iphone();
String bandaEsperada = "Frank Sinatra";
iphone.selecionarBanda(bandaEsperada);
Assertions.assertEquals(bandaEsperada, iphone.bandaTocando());
}

 
@Test
void ligandoParaContato(){
 Iphone iphone = new Iphone();
 String ligaçaoEsperada = "123456";
 iphone.ligar(ligaçaoEsperada);
 Assertions.assertEquals(ligaçaoEsperada, iphone.estaLigando());   
}










}

