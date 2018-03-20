package services.rest;

import services.rest.model.Todo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/todosimple")
public class TodoResourceSimple {
    @GET
    @Produces({MediaType.TEXT_XML})
    public Todo getHTML(){
        Todo todo = new Todo();
        todo.setSummary("first todo bejb");
        todo.setDescription("todo todo");
        return todo;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Todo getXML(){
        Todo todo = new Todo();
        todo.setSummary("first todo bejb");
        todo.setDescription("todo todo");
        return todo;
    }

}
