package com.java1234.repository;

import com.java1234.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * 订单Repository接口
 *
 * @author Administrator
 */
public interface OrderRepository extends JpaRepository<Order, Integer>, JpaSpecificationExecutor<Order> {

    @Query(value = "select * from t_order where order_no=?1", nativeQuery = true)
    public Order getByOrderNo(String orderNo);
}
