# ADOPET - Consulta de animais abandonados

## Sobre o projeto
Adopet é uma API Rest, que responde requisições via Jason e é capaz de realizar consultas de perfis de animais abandonados de um banco de dados. A API também permite criar um novo usuário e adicionar um novo pet no banco de dados, criando assim, uma nova possibilidade de adoção.

<br />

Obs.: Este projeto começou a ser desenvolvido no desafio "challenge back-end", evento organizado pela escola Alura.

<br />  

## Tecnologias e Frameworks
- Java
- Spring Boot
- JPA / Hibernate
- Maven (Gerenciador de dependências)
- Postman: Testador de requisições
- Perfil de teste: Banco de dados e banco H2 inserido nas dependências do projeto
- Perfil de Dev: Consulta ao banco de dados local. Obs.: Utilizado banco de dados postgres atraves de container utilizando o docker-compose
- Perfil de Produção: Perfil configurado. Não realizado deploy até o momento.

<br />  

## Utilização
<br />
A consulta é realizada através de requisições Get, Post, Put e Del. 
<br />
Obs.: Busca Get é realizada por id ou busca total paginada. Os testes foram realizados via Postman.

<br />
<br />

![postmanpets](https://github.com/leoabrantes/adopet-backend-api-java/blob/main/imgs/postmanpets.jpg)

<br />
<br />

![postmanusers](https://github.com/leoabrantes/adopet-backend-api-java/blob/main/imgs/postmanusers.jpg)

<br />
<br />

A API tem um esquema de segurança utilizando token, e de acordo com a autorização do usuário (Admin ou tutor), o sistema restringe ou disponibiliza certas operações.
<br />
<br />

![postman_token](https://github.com/leoabrantes/adopet-backend-api-java/blob/main/imgs/postman_token.jpg)

<br />
<br />


## Estruturação e código
### O projeto foi construido respeitando o sistema de padrão camadas: Controller, Service e repository
![spring](https://github.com/leoabrantes/adopet-backend-api-java/blob/main/imgs/spring.jpg)
<br />
<br />



## Perfis de Testes
Para testar as requisições do projeto, foram criados 3 perfis:

1) Perfil de teste
- Inseridos informações ao banco H2 local para testes iniciais
  <br />
![bancoh2](https://github.com/leoabrantes/adopet-backend-api-java/blob/main/imgs/bancoh2.jpg)
<br />
<br />

2) Perfil de dev
- Utilização do banco de dados postgres, utilizando pgadmin via Docker <br />
- ![pgadmin](https://github.com/leoabrantes/adopet-backend-api-java/blob/main/imgs/pgadmin.jpg)
  
<br />
<br />
   
3) Perfil de produção
   Implementação do deploy na nuvem, em fase de implementação.

<br />
<br />

## Diagrama UML
<br />
![uml](https://github.com/leoabrantes/adopet-backend-api-java/blob/main/imgs/uml.jpg)

<br />
<br />


## Instalação / Execução
1. Necessário possuir o ambiente JDK/JVM instalado
2. Necessário SpringBoot ou alguma IDE capaz de rodar projetos maven
3. Git clone https://github.com/leoabrantes/dslist.git

<br />
<br />


## Melhorias futuras da API
-  Efetuar o perfil de produção e realizar deploy na nuvem

<br />
<br />


# Autor

Leonardo Abrantes
https://www.linkedin.com/in/leoabrantesmelo
