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
public class SoftwareProduct extends Product{
    private int NumberOfUsers;

    public SoftwareProduct() {
    }

    public SoftwareProduct(int NumberOfUsers, long id, String name, String Description, float pricePerUnit) {
        super(id, name, Description, pricePerUnit);
        this.NumberOfUsers = NumberOfUsers;
    }

    public int getNumberOfUsers() {
        return NumberOfUsers;
    }

    public void setNumberOfUsers(int NumberOfUsers) {
        this.NumberOfUsers = NumberOfUsers;
    }
    @Override
    float getPrice() {
        return this.getPricePerUnit()+this.NumberOfUsers;
    }

    @Override
    public String toString() {
        return "SoftwareProduct{" + "NumberOfUsers=" + NumberOfUsers + '}'+super.toString();
    }
    
}
