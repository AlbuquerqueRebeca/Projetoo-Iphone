package com.rebeca6;

public class Iphone implements Ipod, Telefone, Navegador {
    





//ipod 
@Override
public void tocar(){

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

   }
   
   @Override
   public void adicionarPagina(){

   }

   @Override
   public void atualizarPagina(){

   }







































}
