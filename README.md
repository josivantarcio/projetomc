# ProjetoMC

Este repositório contém um projeto desenvolvido em Java com o framework Spring, configurado para utilizar o banco de dados H2. O projeto visa demonstrar uma aplicação básica utilizando Spring Boot com persistência de dados.

## Configuração do Ambiente

O projeto utiliza o banco de dados H2 integrado. Para acessar o console do H2, utilize as seguintes configurações:

- **URL do Console do H2:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
  - *Note que o endereço pode variar dependendo da configuração do seu ambiente.*

## Configurações do Spring

As configurações do Spring Boot estão definidas no arquivo `application.properties`:

```properties
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.datasource.url=jdbc:h2:file:~/test
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## Como Executar o Projeto

Para executar o projeto localmente, siga estes passos:

1. Clone este repositório: `git clone https://github.com/josivantarcio/projetomc.git`
2. Navegue até o diretório do projeto: `cd projetomc`
3. Execute a aplicação utilizando o Maven:
   ```
   mvn spring-boot:run
   ```
4. Após a inicialização, acesse o aplicativo em [http://localhost:8080](http://localhost:8080)
5. Para acessar o console do H2, vá para [http://localhost:8080/h2-console](http://localhost:8080/h2-console) e utilize as configurações mencionadas anteriormente.

## Contribuições

Contribuições são bem-vindas! Se você deseja melhorar este projeto, sinta-se à vontade para abrir pull requests. 

## Licença

Este projeto é licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
