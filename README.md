# SpringBootElasticSearch

 Prerequisite : Java 8 or Later version 

### Start ElasticSearch

01) Download elasticsearch 6.2.4 from [here](https://www.elastic.co/downloads/elasticsearch)
02) Download Kibana 6.2.4 from [here] (https://www.elastic.co/downloads/kibana)
03) Extract elasticsearch-6.2.4.zip
04) Extract kibana-6.2.4.zip     
05) Run: elasticsearch-6.2.4\bin\elasticsearch.bat
06) Run: kibana-6.2.4\bin\kibana.bat


### Run project as a Sprint Boot App
    $ mvn clean install
    $ mvn spring-boot:run

### Insert data into elasticsearch USING CURL (Hardest way)

http://localhost:9200/javasampleapproach/customer/_search

     $ curl -H "Content-Type:application/json" -XPOST localhost:9200/javasampleapproach/customer   -d '{"id":30, "firstname":"Pablo", "lastname":"Silva" , "age":38}'
     $ curl -H "Content-Type:application/json" -XPOST localhost:9200/javasampleapproach/customer   -d '{"id":35, "firstname":"Carina", "lastname":"Silva" , "age":35}'
     $ curl -H "Content-Type:application/json" -XPOST localhost:9200/javasampleapproach/customer   -d '{"id":"33", "firstname":"Patricia" , "lastname":"Souza", "age":37}'
 
### Insert data into elasticsearch USING Spring boot (Easiest way)

Point your prefered browser to http://localhost:8080/loaddata

Voylà!! All 5 dummy records are inserted into /customer/_doc

P.S.: Use Kibana to search data

Useful commands:

GET /customer/_doc/_search

GET /customer/_doc/1
GET /customer/_doc/2
GET /customer/_doc/3
GET /customer/_doc/4
GET /customer/_doc/5

GET /_cat/indices?v


### Enjoy!!!

