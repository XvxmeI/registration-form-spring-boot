package org.chandima.registration.Service.impl;

import org.chandima.registration.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductImpl {

    // 添加新产品
    Product addProduct(Product product);

    // 获取所有产品
    List<Product> getAllProducts();

    // 根据ID获取产品
    Optional<Product> getProductById(Long id);

    // 更新产品信息
    Product updateProduct(Long id, Product product);

    // 删除产品
    void deleteProduct(Long id);
}
