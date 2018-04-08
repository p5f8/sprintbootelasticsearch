# es-java-client-sample
 Prerequisite : Java 8 and Later version 

### Start ElasticSearch
1) Download elasticsearch from [here](https://www.elastic.co/downloads/elasticsearch)   
2) Extract downloaded elasticsearch     
3) cd elasticsearch-2.4.0       
4) $ bin/elasticsearch or bin\elasticsearch.bat     

### Insert data into elasticsearch

http://localhost:9200/javasampleapproach/customer/_search

     $ curl -H "Content-Type:application/json" -XPOST localhost:9200/javasampleapproach/customer   -d '{"id":30, "firstname":"Pablo", "lastname":"Silva" , "age":38}'
     $ curl -H "Content-Type:application/json" -XPOST localhost:9200/javasampleapproach/customer   -d '{"id":35, "firstname":"Carina", "lastname":"Silva" , "age":35}'
     $ curl -H "Content-Type:application/json" -XPOST localhost:9200/javasampleapproach/customer   -d '{"id":"33", "firstname":"Patricia" , "lastname":"Souza", "age":37}'
 

### Run project as a Sprint Boot App
    $ mvn clean package
    $ mvn spring-boot:run


### Enjoy!!!

