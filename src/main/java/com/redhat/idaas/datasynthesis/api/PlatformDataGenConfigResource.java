package com.redhat.idaas.datasynthesis.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.redhat.idaas.datasynthesis.models.PlatformDatagenconfigEntity;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/api/v1/platformdatagenconfig")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlatformDataGenConfigResource {

    @GET
    @Path("all")
    public List<PlatformDatagenconfigEntity> get() {
        return PlatformDatagenconfigEntity.listAll();
    }

    @GET
    @Path("{status}")
    public List<PlatformDatagenconfigEntity> getByStatus(@PathParam String status) {
        return PlatformDatagenconfigEntity.findByStatusId(status);
    }
}
