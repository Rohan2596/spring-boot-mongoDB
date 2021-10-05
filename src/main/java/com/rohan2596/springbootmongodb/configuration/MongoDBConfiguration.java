package com.rohan2596.springbootmongodb.configuration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/*
 *
 *  @author : Rohan Kadam
 * @github : Rohan2596
 * @medium : https://rohankadam965.medium.com/
 *
 * */

@Configuration
public class MongoDBConfiguration {


    //database Name
    private String databaseName = "logger_test";

    //localhost
    private String serverName = "localhost";

    //port
    private String portNumber = "27017";

    /*
     * @method :- mongoClient
     * @Description :-
     * */
    @Bean
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://" + serverName + ":" + portNumber + "/" + databaseName);
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    /*
    * @method :- MongoTemplate
    * @Description :-
    * */
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoClient(), databaseName);
    }
}
