/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author student
 */
public abstract class Product {
    private long id;
    private String name;
    private String Description;
    private float pricePerUnit;
    private enum type{HardwareProduct,SoftwareProduct};

    public Product() {
    }

    public Product(long id, String name, String Description, float pricePerUnit) {
        this.id = id;
        this.name = name;
        this.Description = Description;
        this.pricePerUnit = pricePerUnit;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", Description=" + Description + ", pricePerUnit=" + pricePerUnit + '}';
    }
    abstract float getPrice();
    
}
