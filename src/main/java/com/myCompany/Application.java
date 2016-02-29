package com.myCompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.myCompany.")
@EnableCassandraRepositories("com.myCompany.dao.")
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
/*

 
import java.net.InetAddress; 
import java.net.UnknownHostException; 

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import org.springframework.data.cassandra.core.CassandraOperations; 
import org.springframework.data.cassandra.core.CassandraTemplate; 

import com.datastax.driver.core.Cluster; 
import com.datastax.driver.core.Session; 
import com.datastax.driver.core.querybuilder.QueryBuilder; 
import com.datastax.driver.core.querybuilder.Select; 

 
public class Application { 
 
 private static final Logger LOG = LoggerFactory.getLogger(Application.class); 
 
 private static Cluster cluster; 
 private static Session session; 
 
 public static void main(String[] args) { 
 
  
 
   cluster = Cluster.builder().addContactPoints("127.0.0.1").build(); 
 
   session = cluster.connect("cmpe282SandyarathiDas4036"); 
 
   CassandraOperations cassandraOps = new CassandraTemplate(session); 
 
   cassandraOps.insert(new Person("3","Fischer", "David")); 
   QueryBuilder qb = new QueryBuilder(cluster);
   Select s = qb.select().from("person"); 
   //Select s = QueryBuilder.column("id");
   s.where(QueryBuilder.eq("id", "3"));
 
   LOG.info(cassandraOps.queryForObject(s, Person.class).getId()); 
 
   cassandraOps.truncate("person"); 
 
  
  
 
 } 
} 
*/