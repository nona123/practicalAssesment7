import io.qameta.allure.*;
import org.kohsuke.rngom.parse.host.Base;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;
import test.data.Pet;

import static test.TestUtils.*;

@Feature("Add new pet in store")
public class AddNewPetTest extends BaseTest {
    private ServicesPetSteps apiClient = ServicesPetSteps.getInstance();

    @Test(description = "Validation adding default pet to store")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePostSimplePet(){
        apiClient.uploadPetSuccessfully(pet);

    }
    @Test(description = "Validation adding pet with all fields")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePostFullPet(){
        apiClient.uploadPetSuccessfully(TestUtils.generateFullTemplate());

    }
}
