package com.rebeca6;

import java.util.Scanner;



public class Iphone implements Ipod, Telefone, Navegador {
    private String musicaAtual; //teste 
    private String Banda;  //teste
    private String ligar;  //teste
    private boolean pausada; //teste
    private boolean avançar; //teste 
    private boolean retroceder; //teste  

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
    return this.musicaAtual;
    }

 @Override
 public void pausarMusica(){
   this.pausada = true;
 }

 //teste
 public boolean pausandoMusica(){
    return this.pausada; 
 }


@Override
public void avançarMusica(){
  this.avançar = true;   
}

//teste
public boolean avançandoMusica(){
   return this.avançar; 
}

   @Override
    public void retrocederMusica() {
      this.retroceder = true;  
    }

    //teste
    public boolean retrocedendoMusica(){ 
      return this.retroceder;
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
    this.Banda = banda;
    System.out.println("Banda selecionada: " + banda);
    }
   
    //teste
    public String bandaTocando(){
        return this.Banda;
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
     this.ligar = contato;
     System.out.println("Ligando para: " + contato);
    }
    
    //teste
    public String estaLigando(){
      return this.ligar;  
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
