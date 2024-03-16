package com.rebeca6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IphoneTest{

    @Test
    void musicaTocando(){
    
    Iphone iphone = new Iphone();
    String musicaEsperada = "that´s life";
    iphone.tocar(musicaEsperada);
    Assertions.assertEquals(musicaEsperada, iphone.estaTocando());
    
    }

    @Test 
    void deveAtualizarPagina(){
     Iphone iphone = new Iphone();
     iphone.atualizarPagina();
     Assertions.assertTrue(iphone.estaAtualizada());
    }










}

