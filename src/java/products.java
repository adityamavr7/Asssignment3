
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya7
 */
public class products {
    private int productID;
    private String name;
    private String decription;
    private int quantity;

    public products(int productID, String name, String decription, int quantity) {
        this.productID = productID;
        this.name = name;
        this.decription = decription;
        this.quantity = quantity;
    }

        products(JsonObject obj) {
      this.setProductID(obj.getInt("id"));
      this.setName(obj.getString("name"));
      this.setQuantity(obj.getInt("quantity"));
      this.setDecription(obj.getString("decription"));
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public Object toJSON(){
        JsonObjectBuilder obj = Json.createObjectBuilder()
                .add("productId", productID)
                .add("name", name)
                .add("decription", decription)
                .add("quantity", quantity);
        return obj.build();
    }

   
    
}
