package services.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo {
    private String id;
    private String summary;
    private String description;

    public Todo(){
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {

        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public Todo(String id, String summary) {

        this.id = id;
        this.summary = summary;
    }

}
