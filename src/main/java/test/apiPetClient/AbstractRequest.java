package test.apiPetClient;

import io.restassured.response.Response;

public interface AbstractRequest {

    Response getPet(String petId);
    Response postPet(Object pet);
    Response deletePet(String petId);
    Response deletePetString(String petId);
    Response putPet(Object object);

    Response getUser(String userId);

    Response deleteUser(String userId);

    Response deleteUserString(String userId);

    Response putUser(Object object);
}
