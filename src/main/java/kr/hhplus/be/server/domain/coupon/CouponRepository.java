package kr.hhplus.be.server.domain.coupon;

public interface CouponRepository {

    Coupon save(Coupon coupon);
    Coupon getById(Long couponId);
    void updateRemainingQuantity(Coupon coupon);
}
