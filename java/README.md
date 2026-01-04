# ☕ Java Ecosystem

Notes, concepts and practical studies focused on **Java as a production-grade language**,
covering **backend engineering, JVM internals and modern architectures**.

This section consolidates Java usage across **server-side applications, APIs, microservices and JVM-based systems**,
with emphasis on **scalability, performance, maintainability and production readiness**.

---

## 🧠 Java Language Fundamentals

### **Core Syntax & Language Features**
- Primitive types & reference types
- Variables, operators and control flow
- Methods, overload and varargs
- Strings, immutability and common pitfalls
- Exception handling (`try/catch/finally`, checked vs unchecked)
- Generics basics (`List<T>`, wildcards)
- Enums, annotations and records (when applicable)

### **Object-Oriented Java**
- Classes, interfaces and inheritance
- Encapsulation, polymorphism and composition
- Abstract classes and design by contract basics
- Immutability patterns
- Common OOP pitfalls and good practices

### **Functional Java (Modern Java)**
- Lambdas and functional interfaces
- Stream API (`map`, `filter`, `reduce`, collectors)
- `Optional` (good usage vs overuse)
- Method references
- Basic performance considerations with streams

---

## 🧬 JVM & Java Platform

- JVM fundamentals (stack/heap, class loading)
- Bytecode basics (high-level understanding)
- Garbage Collection concepts (G1, ZGC overview when applicable)
- JDK vs JRE and Java versions (LTS mindset)
- Build tools: Maven & Gradle
- Multi-module project structure
- Dependency management and BOMs

---

## 🖥️ Backend Development with Java

### **API Development**
- RESTful APIs
- Request/response modeling
- DTOs and mapping strategies
- Exception handling and API error modeling
- Validation (Jakarta Bean Validation)
- Pagination, sorting and filtering patterns

---

## 🌱 Spring Boot with Java

### **Spring Ecosystem**
- Spring Boot fundamentals
- Dependency Injection (IoC container)
- Controllers, services and repositories
- Configuration and profiles
- Spring Data JPA
- Transaction management (`@Transactional`)

### **Spring Web & Integration**
- REST controllers and serialization (Jackson)
- Filters, interceptors and middleware patterns
- Spring Security basics (authn/authz)
- Observability basics (health checks, metrics, logging)

---

## 🗄️ Persistence & Data Access

### **Relational Databases**
- JPA / Hibernate fundamentals
- Entity lifecycle and persistence context
- Relationships (`OneToOne`, `OneToMany`, `ManyToMany`)
- Transactions and isolation levels
- Pagination and performance tuning (N+1, fetch strategies)

### **Database Practices**
- Entity modeling and normalization basics
- Migrations (Flyway / Liquibase)
- Indexing, constraints and query planning (high-level)
- Handling large datasets safely

---

## 🔄 Concurrency & Asynchronous Programming

### **Java Concurrency**
- Threads and executors
- `synchronized`, locks and atomic types
- `CompletableFuture` fundamentals
- Thread-safety and common race conditions
- Performance and correctness trade-offs

### **Async & Reactive Concepts**
- Blocking vs non-blocking APIs
- When to adopt async patterns
- Intro to reactive programming (when applicable)
- Integration patterns in Spring-based systems

---

## 🧪 Testing

- Unit testing with JUnit 5
- Mocking with Mockito (and/or alternatives)
- Integration tests (Spring Boot Test)
- Testcontainers
- API tests and contract basics (when applicable)

---

## 🏗️ Architecture & Best Practices

### **Software Design**
- SOLID principles
- Clean Architecture
- Layered and modular architectures
- Separation of concerns
- Dependency Injection patterns

### **API & System Design**
- REST best practices
- Error modeling and consistent responses
- API versioning strategies
- Scalability considerations (statelessness, caching, DB constraints)

---

## 🔐 Security Basics

- Authentication and authorization concepts
- JWT fundamentals
- Spring Security foundations
- Secrets and configuration management
- CORS and HTTPS basics

---

## ⚙️ Tooling & Build

- Maven / Gradle
- Environment configuration and profiles
- Logging (SLF4J + Logback/Log4j2)
- Linting/formatting (when applicable)
- Static analysis basics

---

## 🚀 Deployment & Production

- Dockerizing Java applications
- JVM memory and performance tuning (high-level)
- Health checks and monitoring
- CI/CD pipelines
- Cloud deployment fundamentals

---

## 📚 Sources

- [Java Documentation (Oracle)](https://docs.oracle.com/en/java/)
- [DevSuperior – Bootcamp Spring React](https://devsuperior.com.br)
- [Java: Lógica de Programação e Algoritmos - Nelio Alves (Udemy)](https://www.udemy.com/course/java-curso-logica-de-programacao/)
- [Java Do Zero ao Profissional + Projetos! - Cod3r (Udemy)](https://www.udemy.com/course/fundamentos-de-programacao-com-java/)
- [Java Programação Orientada a Objetos + Projetos - Nelio Alves (Udemy)](https://www.udemy.com/course/java-curso-completo/)
- [Spring Boot Expert: JPA, REST, JWT, OAuth2 com Docker e AWS - Dougllas Sousa (Udemy)](https://www.udemy.com/course/spring-boot-expert/)
- [Aprenda JAVA com Projetos Reais - Andre Iacono (Udemy)](https://www.udemy.com/course/aprenda-java-em-7-dias-projetos-reais/)
- [Java com Spring Boot e Projetos - Arnaldo Sousa (Udemy)](https://www.udemy.com/course/curso-de-java-para-iniciantes-com-projetos/)
- [Microsserviços Java com Spring Boot e Spring Cloud - Nelio Alves (Udemy)](https://www.udemy.com/course/microsservicos-java-spring-cloud/)
- [Programação em Java do básico ao avançado - Geek University (Udemy)](https://www.udemy.com/course/programacao-em-java-essencial/)
- [Aprenda Quarkus e API's RESTful em Java - Dougllas Sousa (Udemy)](https://www.udemy.com/course/aprenda-quarkus-e-desenvolva-apis-restful-poderosas-em-java/)
- [Java Completo com Orientação a Objetos e Exercícios - Matheus Battisti (Udemy)](https://www.udemy.com/course/java-completo-com-orientacao-a-objetos-e-exercicios/)
- [API Rest com Java e Spring Boot - Luis Eduardo Marques (Udemy)](https://www.udemy.com/course/crie-apis-rest-com-spring-boot-do-iniciante-ao-especialista/)
- [Design de API's RestFul com Spring Boot, TDD, JUnit5, Mocks - Dougllas Sousa (Udemy)](https://www.udemy.com/course/design-de-apis-restful-com-tdd-spring-boot-e-junit-5/)
- [Testes Automatizados com Selenium e Java - Weberson Rodrigues (Udemy)](https://www.udemy.com/course/testes-automatizados-curso-completo-com-selenium-e-java/)
- [Testes unitários em JAVA: JUnit 4, Mockito e TDD - Francisco Wagner Costa Aquino (Udemy)](https://www.udemy.com/course/testes-unitarios-em-java/)
- [Aprenda BDD com Cucumber em JAVA - Francisco Wagner Costa Aquino (Udemy)](https://www.udemy.com/course/cucumber-java/)
- [Testes de Contrato em JAVA com PACT - Francisco Wagner Costa Aquino (Udemy)](https://www.udemy.com/course/testes-de-contrato-em-java-com-pact/)
