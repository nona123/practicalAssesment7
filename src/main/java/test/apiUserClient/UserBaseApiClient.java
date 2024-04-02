package test.apiUserClient;

import io.restassured.response.Response;
import test.apiPetClient.AbstractRequest;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class UserBaseApiClient implements AbstractRequest {

    public Response getUsername(String getUsername) {
        return given()
                .log()
                .all()
                .contentType(JSON)
                .when()
                .log()
                .all()
                .get(getUsername);
    }

    public Response postUser(Object user) {
        return given()
                .log()
                .all()
                .contentType(JSON)
                .when()
                .log()
                .all()
                .body(user)
                .post();
    }

    @Override
    public Response getUser(String userId) {
        return null;
    }

    @Override
    public Response deleteUser(String userId) {
        return null;
    }

    @Override
    public Response deleteUserString(String userId) {
        return null;
    }

    @Override
    public Response putUser(Object object) {
        return null;
    }
}
