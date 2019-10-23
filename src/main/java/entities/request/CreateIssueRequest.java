package entities.request;

public class CreateIssueRequest {

    private String description;
    private String fromemail;
    private String title;
    private int id;

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setFromemail(String fromemail){
        this.fromemail = fromemail;
    }

    public String getFromemail(){
        return fromemail;
    }

    public void settitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return  title;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
