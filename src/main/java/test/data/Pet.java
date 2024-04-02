package test.data;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
//nama constructor
public class Pet {
    // request dari body post endpoint /pet https://petstore.swagger.io/#/store/placeOrder
    private String id;
    private Category category;// call id and name dari file Category
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private Status status;
}
