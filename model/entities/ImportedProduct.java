package model.entities;

import model.entities.enums.ProductTag;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee, ProductTag tag) {
        super(name, price, tag);
        this.customsFee = customsFee;

    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public Double totalPrice(){
        return  customsFee + price;
    }
}
