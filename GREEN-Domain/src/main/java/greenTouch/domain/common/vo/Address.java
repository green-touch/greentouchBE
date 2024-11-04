package greenTouch.domain.common.vo;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Embeddable
@RequiredArgsConstructor
public class Address {
    private final String zipcode; // 추가 우편번호
    private final String address1; // 추가 도로명 주소
    private final String address2; // 추가 상세 주소
}
