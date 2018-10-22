package com.enzenar.enzen;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enzenar.enzen.service.IEnzenService;
import com.enzenar.enzen.serviceImpl.EnzenServiceImpl;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@SpringBootApplication
@RestController
public class EnzenController {

	IEnzenService service = EnzenServiceImpl.getInstance();
	
	@POST
	@RequestMapping("/authenticateUser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_XML})
	public String login(@RequestBody String request){
		JsonObject response = new JsonObject();
		try{
			response = service.authenicateUser(request);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(response.toString());
		return response.toString();
	}
	
	@POST
	@RequestMapping("/getTempAndAirQuality")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_XML})
	public String getTempAndAirQuality(@RequestBody String request){
		String response = null;
		try{
			response = service.getTempAndAirQuality(request);
		}catch(Exception e){
			e.printStackTrace();
		}
		//System.out.println(response.toString());
		return response;
	}
	
	@POST
	@RequestMapping("/getAboutDevice")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_XML})
	public String getAboutDevice(@RequestBody String request){
		JsonObject response = new JsonObject();
		try{
			response = service.getAboutDevice(request);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("getAboutDevice Response ---- "+new Gson().toJson(response));
		return response.toString();
	}
	@POST
	@RequestMapping("/jobToDo")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_XML})
	public String jobToDo(@RequestBody String request){
		JsonObject response = new JsonObject();
		try{
			response = service.jobToDo(request);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("jobToDo Response ---- "+new Gson().toJson(response));
		return response.toString();
	}
	@POST
	@RequestMapping("/getJobDescription")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_XML})
	public String getJobDescription(@RequestBody String request){
		JsonObject response = new JsonObject();
		try{
			response = service.getJobDescription(request);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("jobToDo Response ---- "+new Gson().toJson(response));
		return response.toString();
	}
	
	@POST
	@RequestMapping("/submitReport")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_XML})
	public String submitReport(@RequestBody String request){
		JsonObject response = new JsonObject();
		try{
			response = service.submitReport(request);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("submitReport Response ---- "+new Gson().toJson(response));
		return response.toString();
	}
	
	@GET
	@RequestMapping("/")
	public String test(){
		return "Hello world !! Test";
	}
}