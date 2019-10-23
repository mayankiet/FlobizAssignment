package entities.request;

public class CreateIssueRequest {

    String description;
    String fromemail;
    String title;

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
}
