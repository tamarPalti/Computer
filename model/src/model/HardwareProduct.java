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
public class HardwareProduct extends Product{
    private int WarrantyPeriod;

    public HardwareProduct() {
    }
    public HardwareProduct(int WarrantyPeriod, long id, String name, String Description, float pricePerUnit) {
        super(id, name, Description, pricePerUnit);
        this.WarrantyPeriod = WarrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return WarrantyPeriod;
    }

    public void setWarrantyPeriod(int WarrantyPeriod) {
        this.WarrantyPeriod = WarrantyPeriod;
    }
    
    @Override
    float getPrice() {
        return this.getPricePerUnit()+this.WarrantyPeriod;
    }

    @Override
    public String toString() {
        return "HardwareProduct{" + "WarrantyPeriod=" + WarrantyPeriod + '}'+super.toString();
    }

   
    
    
}
