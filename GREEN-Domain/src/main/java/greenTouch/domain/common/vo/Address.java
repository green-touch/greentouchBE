package greenTouch.domain.common.vo;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Address {
    private String zipcode; // 추가 우편번호
    private String address1; // 추가 도로명 주소
    private String address2; // 추가 상세 주소
}
