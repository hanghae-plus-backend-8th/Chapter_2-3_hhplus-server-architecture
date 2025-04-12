package kr.hhplus.be.server.domain.coupon;

import java.util.Optional;

public interface CouponRepository {

    Optional<Coupon> findById(Long id);
    void update(long couponId, int remainingQuantity);
}
