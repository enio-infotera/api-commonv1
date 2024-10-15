package br.com.infotravel.api.commonv1.responses;

import br.com.infotravel.api.commonv1.dto.ApiCoupon;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author enioj
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckCouponRS {

    private ApiCoupon coupon;

    public CheckCouponRS() {
    }

    public CheckCouponRS(ApiCoupon coupon) {
        this.coupon = coupon;
    }

    public ApiCoupon getCoupon() {
        return coupon;
    }

    public void setCoupon(ApiCoupon coupon) {
        this.coupon = coupon;
    }

}
