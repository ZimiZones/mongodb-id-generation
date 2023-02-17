package com.me.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "fasta_db_tmp")
public class MyMongoEntity extends PanacheMongoEntity {

    public String name;
}
