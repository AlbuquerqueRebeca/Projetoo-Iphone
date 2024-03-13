package com.rebeca6;

import java.util.Scanner;

public class Iphone implements Ipod, Telefone, Navegador {
    
public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.tocar(); //ipod 
}







private Scanner scanner;
public Iphone(){
    this.scanner = new Scanner(System.in);
}


//ipod 
@Override
public void tocar(){
System.out.println("Digite o nome da musica: ");
}

@Override
public void pausarMusica(){
System.out.println("Pausando a musica");
}

@Override
public void avançarMusica(){
System.out.println("Avançar musica");
}

@Override
    public void retrocederMusica() {
    System.out.println("Retrocedendo a musica");
    }

    @Override
    public void selecionarMusica(){
    System.out.println("Selecionar musica");
    }

    @Override
    public void selecionarAlbum(){
    System.out.println("Selecionar Album");
    }

    @Override
    public void selecionarBanda(){

    }

    //telefone
    @Override
    public void ligar(){
    
    }

    @Override
    public void atender(){
    System.out.println("Atender contato");
    }

    @Override
    public void adicionarContato(){
    System.out.println("Adicionando contato novo");
    }

    @Override
    public void iniciarCorreioVoz(){
     System.out.println("Iniciando correio de voz"); 
    }

    //Navegador
   @Override
   public void exibirPagina(){
   System.out.println("Exibindo pagina no navegador");
   }
   
   @Override
   public void adicionarPagina(){
   System.out.println("Adicionando nova pagina"); 
   }

   @Override
   public void atualizarPagina(){
   System.out.println("Atualizando pagina"); 
   }







































}
