/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author gcsadmin
 */
//@WebService(serviceName = "TestingWS")
@Path("/webhook")
public class TestingWS {

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public String TakeData(@FormParam(value = "POST body") String object) {
        System.out.println(object);
        String response = "{'speech': 'Barack Hussein Obama II is the 44th and current President of the United States.'"
                + "'displayText': 'Barack Hussein Obama II is the 44th and current President of the United States, and the first African American to hold the office. Born in Honolulu, Hawaii, Obama is a graduate of Columbia University   and Harvard Law School, where '}";
        return response;
    }
}
