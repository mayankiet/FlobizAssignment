package floBiz.automation.getListOfIssues;

import floBiz.automation.baseTest.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ResourceHelper;
import utils.Categories;

public class GetIssuesListAndValidate extends BaseTest {

    @Test(groups = {Categories.GET_ISSUES_LIST})
    public void sendGetRequestAndValidateResponse(){
        Response response = ResourceHelper.get(configReader.getEndpoint());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(groups = {Categories.GET_ISSUES_LIST})
    public void sendGetRequestByIdAndValidateResponse(){
        Response response = ResourceHelper.get(configReader.getIssueByIDUrl());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(groups = {Categories.GET_ISSUES_LIST})
    public void sendGetRequestUsingQueryParameterAndValidateResponse(){
        Response response = ResourceHelper.get(configReader.getIssueByQueryUrl());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
