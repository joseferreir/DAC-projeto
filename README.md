
Use:
# Descrição

Em contrução

# Pre-requisitos

Para executar o projeto é preciso ter o [Docker compose](https://docs.docker.com/compose/install/) e o [Apache Maven](http://maven.apache.org/install.html)
# Passos para executar

### Passo 1
 clone o projeto no [github](https://github.com/joseferreir/DAC-projeto) 

  **git clone https://github.com/joseferreir/DAC-projeto.git **

### Passo 2
  Dentro da pasta bin execute os seguintes comandos

``` shell  
   -  distribuição baseada no Debian
$ ececulte: sh run.sh 

$ windows 
 ececulte:  run.bat
	 
```
** Si tudo deu certo,  A saida será **

```
Creating projeto-db
Creating projeto-core
Creating projeto-web

```

Acesse:

[http://localhost:8083/web](http://localhost:8083/web)

** Parar  Aplicação **

```
``` shell  
   -  distribuição baseada no Debian
$ ececulte: sh stop.sh 

$ windows 
 ececulte:  stop.bat

```

