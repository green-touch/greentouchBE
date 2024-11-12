package greenTouch.domain.domains.member.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder
@DiscriminatorValue("type_senior")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Volunteer extends Member{
    @Builder.Default
    private int point = 0;
}
