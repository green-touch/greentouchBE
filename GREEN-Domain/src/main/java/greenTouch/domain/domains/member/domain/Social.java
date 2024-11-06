package greenTouch.domain.domains.member.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Social {
    KAKAO("KAKAO"),
    NAVER("NAVER");

    private String value;
}
