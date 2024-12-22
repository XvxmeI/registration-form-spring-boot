package org.chandima.registration.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // 产品ID，自动生成

    private String name;  // 产品名称

    private String category;  // 产品类别

    private BigDecimal price;  // 产品价格

    private Integer quantity;  // 产品库存数量

    // 无需额外方法，因为 Lombok 提供了 getter 和 setter。
}
