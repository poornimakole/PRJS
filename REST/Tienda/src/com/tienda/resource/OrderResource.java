package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tienda.bean.Order;
import com.tienda.bean.Product;
import com.tienda.service.TiendaService;
import com.tienda.util.OrderNotFoundException;

@Path("/orders")
public class OrderResource { // sub-resource classes

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("{ord-num}")
	public Order fetchOrderDetailsForUser(@PathParam("uname") String username,
			@PathParam("ord-num") String number) throws OrderNotFoundException {
		Order order;
		order = new TiendaService().getOrderDetailsForUser(username, number);
		return order;

	}

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Set<Order> fetchAllOrdersForUser(@PathParam("uname") String username) {
		Set<Order> orders;
		orders = new TiendaService().getAllOrdersForUser(username);
		return orders;

	}
	
	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("deletes/{ord-num}")
	public Set<Order> deleteOrderDetailsForUser(@PathParam("uname") String username,
			@PathParam("ord-num") String number) throws OrderNotFoundException {
		
		TiendaService ts=new TiendaService();
		Order order;
		order = ts.getOrderDetailsForUser(username, number);
		Set<Order> orders=ts.getAllOrdersForUser(username);
		orders.remove(order);
		return orders;

	}
	
	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("updates/{ord-num}")
	public Order updateOrderDetailsForUser(@PathParam("uname") String username,
			@PathParam("ord-num") String number) throws OrderNotFoundException {
		
		TiendaService ts=new TiendaService();
		Order order;
		order = ts.getOrderDetailsForUser(username, number);
		Set<Product> cart=ts.getAllProductsForOrder(username, number);
	    List<Product> c =new ArrayList<Product>();
	    c.addAll(cart);
	    Product prod=c.get(0);
	    cart.remove(prod);
	    order.setCart(cart);
		return order;

	}


	@POST
	@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response create(Order order) throws URISyntaxException {
		System.out.println(order.getNumber());
		System.out.println(order.getOrderedOn());
		return Response.created(new URI("http://localhost:8080/Tienda"))
				.build();
	}
}