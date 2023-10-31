package com.alana.jersey.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.alana.jersey.model.User;
import com.alana.jersey.service.UserService;

@Path("/users")
public class UserResource {
	private UserService userService = new UserService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> fetchAll() {
		return userService.fetchAll();
	}
	
	@GET
	@Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") int id) {
		return Response.ok().entity(new User(100, "me", "me@gmail.com")).build();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(User user) {
//		create notification
		userService.create(user);
		return Response.status(Status.CREATED).build();
	}
	
	
	@PUT
	@Path("/users/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") long id, User user) {
		userService.update(user);
		return Response.noContent().build();
	}
	
	@DELETE
	@path("/users/{id}")
	public Response delete(@PathParam("id") long id) {
		userService.delete(id);
		return Response.status(202).entity("User deleted Successfully").build();
	}
	}
}
