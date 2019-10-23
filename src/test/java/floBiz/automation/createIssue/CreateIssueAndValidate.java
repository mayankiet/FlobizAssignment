package floBiz.automation.createIssue;

import builders.CreateIssueBuilder;
import entities.request.CreateIssueRequest;
import entities.response.CreateIssueResponse;
import floBiz.automation.baseTest.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.RequestHelper;
import utilities.ResourceHelper;
import utilities.ResponseHelper;
import utils.Categories;

public class CreateIssueAndValidate extends BaseTest {

    @Test(groups = {Categories.CREATE_ISSUES})
    public void createIssueAndValidate() throws Exception {
        CreateIssueRequest createIssueRequest = new CreateIssueBuilder()
                .withDescription("This is a new issue 4")
                .withformemail("test123@gmail.com")
                .withTitle("New issue 4")
                .build();

        String url = configReader.getEndpoint();
        String json = RequestHelper.getJSONString(createIssueRequest);

        Response response = ResourceHelper.create(url, json);

        CreateIssueResponse createIssueResponse = (CreateIssueResponse)
                ResponseHelper.getResponseAsObject(response.asString(), CreateIssueResponse.class);

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(createIssueRequest.getDescription(), createIssueResponse.getDescription());
        Assert.assertEquals(createIssueRequest.getFromemail(), createIssueResponse.getFromemail());
        Assert.assertEquals(createIssueRequest.getTitle(), createIssueResponse.getTitle());

        System.out.println(response.prettyPrint());
    }
}
