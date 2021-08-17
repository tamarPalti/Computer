/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import sun.util.resources.LocaleData;

/**
 *
 * @author student
 */
public class PurchaseOrder {
    private Customer orderingCustomer;
    private ArrayList<Product> productsList;
    private LocalDate orderDate=LocalDate.now();

    public PurchaseOrder() {
    }

    public PurchaseOrder(Customer orderingCustomer, ArrayList<Product> productsList) {
        this.orderingCustomer = orderingCustomer;
        this.productsList = productsList;
    }

    public Customer getOrderingCustomer() {
        return orderingCustomer;
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderingCustomer(Customer orderingCustomer) {
        this.orderingCustomer = orderingCustomer;
    }

    public void setProductsList(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" + "orderingCustomer=" + orderingCustomer + ", productsList=" + productsList + ", orderDate=" + orderDate + '}';
    }
    
}
