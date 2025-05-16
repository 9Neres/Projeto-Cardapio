# Cardápio Digital

## Sobre
Sistema simples de cardápio desenvolvido com React (frontend), Java Spring Boot (backend) e PostgreSQL (banco de dados). Esta versão atual representa apenas a base do projeto.

## Tecnologias
- Java com Spring Boot
- PostgreSQL
- React (em desenvolvimento)

## Estrutura Backend
- Entidade `Food`: Representa itens do cardápio
- Repository: Interface para operações no banco de dados
- Controller: Endpoints REST para CRUD de alimentos
- DTOs: Objetos para transferência de dados

## API REST
- **GET /foods**: Lista todos os itens
- **GET /foods/{id}**: Busca item por ID
- **POST /foods**: Adiciona novo item
- **PUT /foods/{id}**: Atualiza item existente
- **DELETE /foods/{id}**: Remove item

## Configuração
Banco de dados PostgreSQL configurado em `application.properties`:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/food
spring.datasource.user=postgres
spring.datasource.password=12345
```

## Próximos Passos
- Desenvolvimento da interface React
- Implementação de categorias
- Sistema de busca e filtros
- Interface administrativa