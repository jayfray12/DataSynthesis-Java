package com.redhat.idaas.datasynthesis.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.idaas.datasynthesis.models.RefdataStatusEntity;

@Path("/api/v1/refdatastatus")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RefdataStatusResource {

    @GET
    @Path("all")
    public List<RefdataStatusEntity> get() {
        return RefdataStatusEntity.listAll();
    }
}
