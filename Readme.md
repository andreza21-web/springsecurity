

<h1 align="center">
 Serviço de Mensagens com Spring Security + JWT
</h1>


<p align="center">

  <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-%2304D361">
  <img alt="Language: Java" src="https://img.shields.io/badge/language-java-green">
  <img alt="Version: 1.0" src="https://img.shields.io/badge/version-1.0-yellowgreen">

</p>

##  Tecnologias utilizadas

* Java 21
* Spring web
* Spring Data mysql
* OAuth2 Resource Server
* Spring Security 6
* Docker

## Ferramentas utilizadas
* dbeaver (Para visualizar a tabela criada)
* Insomnia
* Intellij IDEA

### Como rodar o container

Entrar na pasta docker com  `cd docker` rodar o comando
` docker compose up`

## Documentação

Desenho da solução  [clicando aqui](./springSecurity.drawio.pdf).


Collection com os endpoints desenvolvidos [clicando aqui](./spring.postman_collection.json).


# Documentação da API

## Endpoints

### **POST /login**

Este endpoint faz login com o usuario cadastrado.

- **URL:** `/login`
- **Método:** `POST`


#### Requisição

```bash
curl -X POST "http://localhost:8080/login" 
-H "Content-Type: application/json" 
-d '{"username": "Carlos Souza", "password": "123456"}"

````
### **POST /users**

Este endpoint cria um usuario sem acesso ADMIN (perfil BASIC).

- **URL:** `/users`
- **Método:** `POST`


#### Requisição

```bash
curl -X POST "http://localhost:8080/users" 
-H "Content-Type: application/json" 
-d '{"username": "Carlos Souza", "password": "123456"}"

````
### **GET /users**

Este endpoint lista todos os usuarios cadastrados (somente perfil admin possui permissão).

- **URL:** `/users`
- **Método:** `GET`


#### Requisição

```bash
curl -X GET "http://localhost:8080/users" 
-H "Content-Type: application/json" 
-H "Authorization: Bearer {token}""

````

### **POST /tweet**

Este endpoint publica uma mensagem com o token gerado do login.

- **URL:** `/tweet`
- **Método:** `POST`
```bash

curl -X POST "http://localhost:8080/tweet" \
-H "Authorization: Bearer {token}" \
-H "Content-Type: application/json" \
-d '{"content": "Ola mundo"'

````