# Projeto Iphone 2007 📱

### Introdução: 
Um projeto com a intenção de simular um sistema com as principais funcionalidades do iphone (lançamento 2007), Trazendo os recursos do ipod,
navegador e telefone. O usuário poderá interagir digitando o nome da música que deseja ouvir, selecionar sua banda favorita, e até mesmo ligar 
para um de seus contatos. 

### Requisitos do curso: 
Esse projeto foi baseado no desafio proposto pela DIO. O desafio pedia a criação de classes e interfaces para representar as funcionalidades
do iphone. Os recursos incluíam um reprodutor de música para tocar, pausar e selecionar músicas, um aparelho telefônico para fazer ligações, 
atender chamadas e iniciar o correio de voz, e um navegador de internet para exibir páginas, adicionar aba e atualizar páginas. 

### Adições e melhorias: 
Adicionei outras funcionalidades à interface ipod, como selecionar banda, selecionar álbum, avançar música e retroceder música.
Também adicionei uma nova funionalidade à interface do telefone, como adicionar contato.


Adicionei interatividade, permitindo que o usúario digite a música que deseja ouvir, selecione sua banda favorita, e até mesmo 
ligue para um de seus contatos. 

Além disso, adicionei o gêrenciamento de dêpendencias maven e a API jUnit para realizar testes unitários. Realizei testes em cada método
de cada interface. 

### Tecnologias usadas: 
#### Java versão: 17
Link: https://www.oracle.com/java/technologies/downloads/
#### Instruçoes de instalação: 
- Visite ao site oficial do oracle
- Escolha a versão do JDK17
- Clique no link de dowlond ao lado da versão do sistema operacional
- Aceite o acordo de licença e siga as instruções

#### Paradigmas: Programação orientada a objetos

 #### Maven
 versão 3.1
 Link: https://maven.apache.org/download.cgi?
 #### Instruções de intalação: 
 - visite o site
 - Na seção “Apache Maven”, escolha a versão do Maven que corresponde ao seu sistema operacional
 - Clique no link de download ao lado da versão do sistema operacional
 - siga as instruções na tela para instalar o Maven.
  
 
 #### jUnit jupiter:  
 versão: 5.7.1


```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.7.1</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```


#### Instruções: 
- Abra o arquivo pom.xml na IDE
- localize a seção dependencies no arquivo
- Dentro da seção dependencies adicione o bloco de código
- Salve o arquivo
 
### Ferramentas usadas: 
- IDE: Vs code 
- Controle de versão: Git
- Hospedagem de código: Github

### Dependências usadas: 
- maven 
- jUnit jupiter

### Rodando o Projeto: 
- Clone o repositório
 ```bash
https://github.com/AlbuquerqueRebeca/Projetoo-Iphone.git  
 ```
- Instale as dependências
```bash
mvn install
```
- Execute os testes
```bash
mvn test
```
### Exemplos de Uso: 
Exemplos de uso com as funcionalidades de interação com o usuário

#### Funcionalidade TOCAR
Nesta funcionalidade, o usuário digita o nome da música que deseja ouvir 

#### Entrada: 
```java
@Override
public void tocar(){   
System.out.println("Digite o nome da musica: ");
```
#### Saída: 
```bash
Digite o nome da musica: 
Always
Tocando Always
```
#### Funcionalidade SELECIONAR BANDA
Nesta funcionalidade, o usuário digita o nome da banda da música escolhida

#### Entrada: 
```java
@Override
    public void selecionarBanda(){
    System.out.println("Selecionar Banda: ");
```

#### Saída: 
```bash
Selecionar Banda: 
blink
Banda selecionada: blink
```
#### Funcionalidade LIGAR
Nesta funcionalidade, o usuário liga para um de seus contatos.

#### Entrada: 
```java
@Override
    public void ligar(){
    System.out.println("Ligar para: ");
```

#### Saída:
```bash
Ligar para: 
REBECA
Ligando para: REBECA
```

### Testes 
Utilizei jUnit para realizar testes unitários. 

#### Teste com interação do usuário:
O teste simula a entrada do usuário, e verifica se a música está tocando corretamente

#### Entrada: 
```java
@Test
void musicaTocando(){
Iphone iphone = new Iphone(); 
String musicaEsperada = "That´s Life"; 
iphone.tocar(musicaEsperada);
Assertions.assertEquals(musicaEsperada, iphone.estaTocando());
}
```
#### Saída: 
```bash
Tocando That´s Life
```
#### Teste sem interação do usuário
O teste verifica se a funcionalidade pausar música está funcionando corretamente.

```java
@Test
void musicaEstaPausada() {
Iphone iphone = new Iphone();
iphone.pausarMusica(); 
Assertions.assertTrue(iphone.pausandoMusica());
}
```











