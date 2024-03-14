package com.rebeca6;

import java.util.Scanner;


public class Iphone implements Ipod, Telefone, Navegador {
    
public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.tocar(); //ipod 
    iphone.selecionarBanda(); //ipod
    iphone.ligar(); //telefone 
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
    String musica = scanner.nextLine();
    System.out.println("Banda selecionada: " + musica);
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
