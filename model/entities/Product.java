package model.entities;
import model.entities.enums.ProductTag;

public class Product {
    protected String name;
    protected Double price;
    private ProductTag tag;

    public Product(){

    }

    public Product(String name, Double price, ProductTag tag){
        this.name = name;
        this.price = price;
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public ProductTag getTag() {
        return tag;
    }
}
