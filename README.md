## Imersão Java - Api de Linguagens

## Sobre o projeto
Projeto feito durante a Imersão Java da Alura. O objetivo era criar uma API com Spring Boot, parecido com as API's de filme, mas com linguagens de programação.


# Vitrine


| 🪧 Vitrine.Dev |     |
| -------------  | --- |
| ✨ Nome        | Api Linguagens
| 🏷️ Tecnologias | Java, Spring, MongoDB, Git
| 🤿 Desafio | https://www.alura.com.br/imersao-java



## 🔨 Tecnologias
- ``Java - 17.0.3 2022-04-19``
- ``Git``
- ``Spring Boot - 3.0``
- ``MongoDB``

## 4º Dia 

Criado uma API REST com Spring Boot e com conexão com o MongoDB. 


## Endpoints

A seguir, estão listados os endpoints disponíveis nesta API:

### 1. Listar Linguagens de Programação

**Endpoint:** `GET /linguagens`

Este endpoint retorna uma lista contendo todas as linguagens de programação cadastradas na API.

#### Exemplo de resposta:

```json
[
  {
    "id": "1",
    "title": "Java",
    "image": "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
    "ranking": 1
  },
  {
    "id": "2",
    "title": "JavaScript",
    "image": "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png",
    "ranking": 2
  }

]
```

### 2. Obter Linguagem de Programação por ID

**Endpoint:** `GET /linguagens/{id}`

Este endpoint permite obter informações detalhadas sobre uma linguagem de programação específica, com base no seu ID.

#### Exemplo de resposta:

```json
 {
    "id": "1",
    "title": "Java",
    "image": "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
    "ranking": 1
  }
```

### 3. Cadastrar Nova Linguagem de Programação

**Endpoint:** `POST /linguagens`

Este endpoint permite cadastrar uma nova linguagem de programação na API. Os atributos da linguagem devem ser enviados no corpo da requisição.

#### Exemplo de corpo da requisição:

```json
{
  "title": "GO",
  "image": "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/go/go_256x256.png",
  "ranking": 10
}
```

#### Exemplo de resposta (caso seja bem-sucedido):

```json
{
  "id": "4",
  "title": "GO",
  "image": "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/go/go_256x256.png",
  "ranking": 10
}
```

### 4. Editar Linguagem de Programação por ID

**Endpoint:** `PUT /linguagens/{id}`

Este endpoint permite editar os atributos de uma linguagem de programação existente, com base no seu ID. Os atributos atualizados devem ser enviados no corpo da requisição.

#### Exemplo de corpo da requisição:

```json
{
  "id": "4",
  "title": "GO",
  "image": "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/go/go_256x256.png",
  "ranking": 5
}
```

#### Exemplo de resposta (caso seja bem-sucedido):

```json
{
  "id": "4",
  "title": "Ruby",
  "image": "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/ruby/ruby_256x256.png",
  "ranking": 5
}
```

### 5. Excluir Linguagem de Programação por ID

**Endpoint:** `DELETE /linguagens/{id}`

Este endpoint permite excluir uma linguagem de programação da API com base no seu ID.

#### Exemplo de resposta (caso seja bem-sucedido):

```json
{
  "message": "Linguagem excluída com sucesso."
}
```




