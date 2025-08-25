## overbank

Yes, this project is about overengineering. It's been created from a university project to learn about microservices. And I'll use it to play and learn about different technologies that I don't know nothing about. For instance, this project will be all about refactoring, wish me luck :)
It was first created using Java, Angular and NodeJS.

### Running locally

1. First, you need to build the images
```bash
docker compose build
```
2. Then, you can start the services
```bash
docker compose up -d
```


### API Gateway
Pasta do front

2. Instalando os módulos do pacote do API Gateway
```
npm install http express morgan helmet express-http-proxy cookie-parser body-parser jsonwebtoken dotenv-safe
```

4. Executando o node
```
node index.js
```