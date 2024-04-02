import io.qameta.allure.*;
import org.kohsuke.rngom.parse.host.Base;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;
import test.data.Pet;

@Feature("test with existing Pets")
public class CheckExistingPetTest extends BaseTest{
    private ServicesPetSteps apiClient = ServicesPetSteps.getInstance();

    @Test(description = "Check all fields for existing simple default Pet")
    public void checkExistingSimplePet(){
       apiClient.uploadPetSuccessfully(pet).checkAllPetFields(pet);
    }
}
