package com.rebeca6;





import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class IphoneTest {

   
    @Test
      void atendendligaçao() {
     Iphone iphone = new Iphone(); //criando o objeto iphone
     iphone.atender();; //o metodo 
    Assertions.assertTrue(true, "atendendo telefone");
}
    
}
