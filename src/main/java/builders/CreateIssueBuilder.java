package builders;

import entities.request.CreateIssueRequest;

public class CreateIssueBuilder {

    private CreateIssueRequest createIssueRequest = new CreateIssueRequest();

    public CreateIssueBuilder withDescription(String description) {
        createIssueRequest.setDescription(description);
        return this;
    }

    public CreateIssueBuilder withformemail(String formemail) {
        createIssueRequest.setFromemail(formemail);
        return this;
    }

    public CreateIssueBuilder withTitle(String title) {
        createIssueRequest.settitle(title);
        return this;
    }

    public CreateIssueBuilder withID(int id) {
        createIssueRequest.setId(id);
        return this;
    }


    public CreateIssueRequest build(){
        return createIssueRequest;
    }
}
