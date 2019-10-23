package floBiz.automation.modifyIssues;

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

public class ModifyIssuesAndValidate extends BaseTest {

    @Test(groups = {Categories.UPDATE_ISSUE})
    public void modifyIssueAndValidate() throws Exception{
        CreateIssueRequest createIssueRequest = new CreateIssueBuilder()
                .withTitle("Old issue")
                .build();

        String url = configReader.getModifyIssueUrl();
        String json = RequestHelper.getJSONString(createIssueRequest);

        Response response = ResourceHelper.update(url, json);

        CreateIssueResponse createIssueResponse = (CreateIssueResponse)
                ResponseHelper.getResponseAsObject(response.asString(), CreateIssueResponse.class);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(createIssueRequest.getTitle(), createIssueResponse.getTitle());

        System.out.println(response.prettyPrint());

    }
}
