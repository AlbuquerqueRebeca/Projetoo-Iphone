package com.rebeca6;

import java.util.Scanner;



public class Iphone implements Ipod, Telefone, Navegador {
    private String musicaAtual; //teste
    

    
public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.tocar(); //ipod 
    iphone.selecionarBanda(); //ipod
    iphone.ligar(); //telefone
    
    
   //testes
   iphone.tocar("that´s life");
   iphone.selecionarBanda("frank sinatra");
   iphone.ligar("123456");
   
}

 
private Scanner scanner;
public Iphone(){
    this.scanner = new Scanner(System.in);
}


//ipod 
@Override
public void tocar(){   
System.out.println("Digite o nome da musica: ");
String musica = scanner.nextLine();
System.out.println("Tocando " + musica);
}

//teste
public void tocar(String musica){
  this.musicaAtual = musica;
System.out.println("Tocando " + musica); 
}
  //teste
 public String estaTocando(){
    
 }


@Override
public void pausarMusica(){
}

@Override
public void avançarMusica(){
}

@Override
    public void retrocederMusica() {
    }

    @Override
    public void selecionarMusica(){
    }

    @Override
    public void selecionarAlbum(){
    }

    @Override
    public void selecionarBanda(){
    System.out.println("Selecionar Banda: ");
    String banda = scanner.nextLine();
    System.out.println("Banda selecionada: " + banda);

    }
    //teste
    public void selecionarBanda(String banda){
    System.out.println("Banda selecionada: " + banda);
    }

    //telefone
    @Override
    public void ligar(){
    System.out.println("Ligar para: ");
    String contato = scanner.nextLine();
    System.out.println("Ligando para: " + contato);
    }
   //teste
    public void ligar(String contato){
     System.out.println("Ligando para: " + contato);
    }

    @Override
    public void atender(){
    }

    @Override
    public void adicionarContato(){
    
    }

    @Override
    public void iniciarCorreioVoz(){
     
    }

    //Navegador
   @Override
   public void exibirPagina(){
   
   }
   
   @Override
   public void adicionarPagina(){
    }

   @Override
   public void atualizarPagina(){
    
   }
 
   














































}
