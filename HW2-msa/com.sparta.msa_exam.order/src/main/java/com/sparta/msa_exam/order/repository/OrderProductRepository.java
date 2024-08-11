package com.sparta.msa_exam.order.repository;

import com.sparta.msa_exam.order.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
    // 추가적인 쿼리 메서드가 필요하면 여기에 정의합니다.
}