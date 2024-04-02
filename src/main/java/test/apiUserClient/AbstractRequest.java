package test.apiUserClient;

import io.restassured.response.Response;

public interface AbstractRequest {

    Response getUser(String userId);
    Response postUser(Object User);
    Response deleteUser(String userId);
    Response deleteUserString(String userId);
    Response putUser(Object object);
}
