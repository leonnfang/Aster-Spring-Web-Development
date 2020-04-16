package com.Aster.Database;

import com.Aster.Model.*;

public interface FloristRepository {
    boolean addFlorist(Florist florist) throws Exception;

    boolean deleteFlorist(String email) throws Exception;

    Florist getFlorist(String email);

    String getUser_name(String email) throws Exception;

    boolean isvalid(String email);

    boolean addProduct(String email, Product product, int quantity) throws Exception;

    boolean removeProduct(String email, Product product) throws Exception;

    boolean updateInventory(String floristEmail, Product product, int quantity) throws Exception;

    Inventory viewInventory(String email) throws Exception;

    int updateHistory(Order order, String email);

    History getHistory(String email);

    int addOrder(Order order);

    int cancelOrder(Order order);
}
