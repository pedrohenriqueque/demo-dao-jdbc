package model.dao;

import db.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller seller);
    void update(Seller seller);
    void deletByID(Integer id);
    Seller findByID(Integer id);
    List<Seller> findAll();
}
