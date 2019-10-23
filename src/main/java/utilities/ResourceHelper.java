package utilities;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class ResourceHelper {

    protected ConfigReader configReader = new ConfigReader();

    public static Response get(String url){
        return given()
                .header("x-apikey", "5da6fb5d3cbe87164d4bb35d")
                .header("Content-Type", "application/json")
                .when()
                .get(url);
    }

    public static Response create(String url, String Json){
        return given()
                .header("x-apikey", "5da6fb5d3cbe87164d4bb35d")
                .header("Content-Type", "application/json")
                .when()
                .body(Json)
                .post(url);
    }

    public static Response update(String url, String Json){
        return given()
                .header("x-apikey", "5da6fb5d3cbe87164d4bb35d")
                .header("Content-Type", "application/json")
                .when()
                .body(Json)
                .put(url);
    }
}
