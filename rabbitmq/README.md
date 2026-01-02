# 📨 RabbitMQ & Message Queues

Hands-on notes and practical examples using **RabbitMQ** and the **AMQP protocol**  
to implement message-driven communication, service decoupling, and reliable  
asynchronous processing in distributed systems.

## 🧠 Covered Topics

### **RabbitMQ Fundamentals**
- Message broker architecture  
- Producers, consumers & queue semantics  
- Acknowledgements & delivery guarantees  
- Message durability & persistence  
- Dead-letter queues (DLQ)  
- QoS: prefetch, retries & redelivery strategies  

### **AMQP Core Concepts**
- Exchanges:
  - **Fanout**  
  - **Direct**  
  - **Topic**
- Binding keys & routing keys  
- Producer → Exchange → Queue → Consumer workflow  
- Virtual hosts, users & permissions  

### **Architecture & Messaging Patterns**
- Service decoupling via asynchronous communication  
- Work queues (competing consumers)  
- Publish/Subscribe  
- Topic-based routing  
- Request–reply (RPC-style messaging)  
- Idempotency & ordering considerations  

### **Local Development & Operations**
- Running RabbitMQ with Docker & Docker Compose  
- Management UI for observability & administration  
- Creating and managing exchanges, queues & bindings  
- Monitoring connections, channels, queue depth & consumers  
- Troubleshooting common issues (unroutable messages, consumer failures)  

### **Integrations**
- Spring Boot AMQP integration basics  
- JSON / binary payload handling  
- Shared message contract libraries (DTOs)  
- CLI Tools: `rabbitmqctl`, `rabbitmqadmin`  

## 📚 Sources

- [RabbitMQ Official Documentation](https://www.rabbitmq.com/docs)
- [RabbitMQ - Full Cycle 3.0](https://fullcycle.com.br)
- [RabbitMQ na Prática - Valdir Cezar (Udemy)](https://www.udemy.com/course/rabbitmq-na-pratica/)
