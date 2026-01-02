# ⚡ Apache Kafka & Event Streaming

Hands-on notes and experiments with **Apache Kafka** for building  
event-driven architectures, data streaming pipelines and decoupled services.

## 🧠 Covered Topics

### **Kafka Fundamentals**
- Kafka as a distributed log / event streaming platform  
- Brokers, topics, partitions, replicas  
- Producers, consumers & consumer groups  
- Offsets, consumer lag & delivery semantics  
- Retention, compaction & data lifecycle  

### **Core Concepts & Patterns**
- Topics design: keying, partitioning strategies  
- At-most-once, at-least-once & effectively-once processing  
- Event sourcing & CQRS with Kafka  
- Work queues vs event streams  
- Rebalancing, group coordination & scaling consumers  

### **Local Development & Tooling**
- Running Kafka with Docker / Docker Compose  
- Zookeeper vs KRaft (new metadata mode)  
- CLI tools: `kafka-topics.sh`, `kafka-console-producer.sh`, `kafka-console-consumer.sh`,  
  `kafka-consumer-groups.sh`  
- Lightweight UIs for local debugging (Kafka UI, etc.)  

### **Ecosystem & Integrations**
- **Kafka Connect**
  - Source & Sink connectors  
  - Config, tasks & workers  
- **Schema Management**
  - Avro / JSON Schema / Protobuf  
  - Schema Registry & schema evolution  
- **Stream Processing**
  - Kafka Streams API basics  
  - Stateless vs stateful operators  
  - Windowing & aggregations  
- Integration with:
  - Java / Spring Kafka  
  - Go / Python clients  
  - Databases, data lakes & analytics tools  

### **Operations & Reliability**
- Cluster sizing & partition strategy  
- Replication factor, min in-sync replicas (ISR)  
- Monitoring: consumer lag, throughput, errors  
- Observability: metrics, logs & alerts  
- Security:
  - TLS encryption  
  - SASL (SCRAM / OAuth)  
  - ACLs & multi-tenant setups  

## 📚 Sources

- [Apache Kafka Official Documentation](https://kafka.apache.org/documentation)
- [Apache Kafka - Full Cycle 3.0](https://fullcycle.com.br)
- [APACHE KAFKA e NIFI - Grimaldo Lopes & Fernando Amaral (Udemy)](https://www.udemy.com/course/apache-kafka-e-nifi-distribua-dados-e-crie-fluxos-de-dados/)
- [APACHE KAFKA e Databricks - Grimaldo Lopes & Fernando Amaral (Udemy)](https://www.udemy.com/course/apache-kafka-e-databricks-streaming-e-processamento/)
- [Apache Kafka - Norbert Waage Junior (Udemy)](https://www.udemy.com/course/apache-kafka-para-iniciantes/)
- [Apache Kafka - Valdir Cezar (Udemy)](https://www.udemy.com/course/apache-kafka-valdir/)
- [Domine Apache Kafka - Fernando Amaral (Udemy)](https://www.udemy.com/course/aprenda-apache-kafka/)
