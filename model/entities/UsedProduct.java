package model.entities;

import model.entities.enums.ProductTag;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufractureDate;

    public Date getManufractureDate(){
        return manufractureDate;
    }
    public UsedProduct(String name, Double price, ProductTag tag, Date manufractureDate){
        super(name, price, tag);
        this.manufractureDate = manufractureDate;
    }
}
