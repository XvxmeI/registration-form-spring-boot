package org.chandima.registration.Repository;

import org.chandima.registration.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // 可以添加一些自定义查询方法，例如根据类别查找产品等
}

