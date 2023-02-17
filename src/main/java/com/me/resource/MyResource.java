package com.me.resource;

import com.me.entity.MyMongoEntity;
import com.me.resource.api.ResultApi;
import io.quarkus.logging.Log;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("fasta_dbs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    @Path("/")
    public ResultApi upload() {
        // Save these metadata into fasta_db_tmp
        MyMongoEntity myMongoEntity = new MyMongoEntity();
        myMongoEntity.name = "random name";
        myMongoEntity.persist();

        Log.error("coucou");
        Log.error(myMongoEntity.id);

        // Return these infos
        return new ResultApi(
                myMongoEntity.id.toString(),
                myMongoEntity.name
        );
    }

}