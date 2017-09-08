
Use:
# Descrição

Em contrução

# Pre-requisitos

Para executar o projeto é preciso ter o [Docker compose](https://docs.docker.com/compose/install/) e o [Apache Maven](http://maven.apache.org/install.html)
# Passos para executar

### Passo 1
 clone o projeto no [bitbucket](https://bitbucket.org/Jose_Ferreira/dac-2017.1) 

  **git clone https://Jose_Ferreira@bitbucket.org/Jose_Ferreira/dac-2017.1.git **

### Passo 2
  Dentro da pasta criada execute os seguintes comandos

``` shell
$  mvn clean install
$  docker-compose up -d
  
```
** Si tudo deu certo,  A saida será **

```
Creating bancopg
Creating coreapp
Creating webcliente

```

Acesse:

[http://localhost:8080/app-web](http://localhost:8080/app-web)

