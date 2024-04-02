package test.data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data(staticConstructor = "category")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
//nama constructor
public class Category {
    // request dari body post endpoint /pet https://petstore.swagger.io/#/store/placeOrder
    private String id;
    private String name;
}
