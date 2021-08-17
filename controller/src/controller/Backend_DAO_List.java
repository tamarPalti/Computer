/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import model.Customer;
import model.Product;
import model.PurchaseOrder;

/**
 *
 * @author student
 */
public class Backend_DAO_List implements Backend {

    private Map<Long, Customer> _Customers;
    private Set<Product> _Products;
    private List<PurchaseOrder> _PurchaseOrders;

    private static Backend_DAO_List singelton;
    public static Backend_DAO_List get_bdl_singelton()
    {
        if(singelton==null)
        {
            singelton= new Backend_DAO_List();
        }
        return singelton;
    }
   private Backend_DAO_List() {
        _Customers = new HashMap<>();
        _Products = new HashSet<>();
        _PurchaseOrders = new ArrayList<>();

    }
    @Override
    public void AddCustomer(Customer c) throws Exception {
        _Customers.put(c.getId(), c);
    }

    @Override
    public void AddProduct(Product c) throws Exception {
        _Products.add(c);
    }
@Override
    public void PlaceOrder(PurchaseOrder po) throws Exception {
        _PurchaseOrders.add(po);
    }
    @Override
    public HashMap<Long, Customer> getAllCustomers() throws Exception {
           return (HashMap<Long,Customer>) _Customers;
    }
    @Override
    public HashSet<Product> getAllProducts() throws Exception {
        return (HashSet<Product>) _Products;
    }
    @Override
    public void RemoveProduct(Product c) throws Exception {
        _Products.remove(c);
    }

    @Override
    public ArrayList<Product> getCustomersOrders(Customer c) throws Exception {
        ArrayList <Product> ret = new ArrayList<Product>(); 
        _PurchaseOrders.stream().filter((po) -> (po.getOrderingCustomer().equals(c))).forEach((po) -> {
            ret.addAll(po.getProductsList());
        });
        return ret;
    }

    @Override
    public Float CalcProductsTotalCost(Product[] products) throws Exception {
        float sum=0;
        for(Product product:products)
        {
            sum+=product.getPricePerUnit();
        }
        return sum;
    }

}
