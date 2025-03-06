# kafka-demo
Kafka Producer and Consumer demo using Spring Boot + Apache Kafka + Docker

# Kafka-producer

1. Start Zookeeper, Kafka Broker and Kafka UI: ```docker compose -f kafka-producer/docker-compose.yml up -d```  

2. Kafka UI endpoint: http://localhost:8086/  
   - Click = Configure New Cluster
   - Cluster name = ```localhost```
   - Bootstrap Servers = ```broker```, Port = ```29092```
   - Click Validate
   - Click Submit

3. Start Kafka producer spring boot application
4. Endpoints:
   1. POST: ```http://localhost:9001/api/v1/employee```
       ```
       {
           "name":"lokesh"
       }
       ```   
   2. GET: ```http://localhost:9001/api/v1/employee```
   3. GET: ```http://localhost:9001/api/v1/employee/69833```

# Kafka-consumer

1. Start Kafka consumer spring boot application
2. It will start consuming messages from topic `create-employee-topic`
