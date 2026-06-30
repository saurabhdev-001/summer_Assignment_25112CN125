
import java.io.Serializable;

public class product implements Serializable {

    String productId;
    String productName;
    String category;
    double price;
    int quantity;
    String supplier;
    static int tot;

    product() {
        tot++;
    }
}
