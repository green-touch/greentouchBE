package greenTouch.domain.domains.senior.domain;

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
public class Senior {
    @Builder.Default
    private int rejectedCount = 0;
}
