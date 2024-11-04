package greenTouch.domain.domains.member.domain;

import greenTouch.domain.common.model.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Getter
@SuperBuilder
@DiscriminatorColumn(name = "DTYPE")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(of = "id", callSuper = false)
@Table(name = "member")
public abstract class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String username;

    private String phoneNumber;

    private String profileImg;

    private String name;

    private String nickname;

    private LocalDate birthday;

    @Embedded
    private Address address;

//    private String social;    TODO convert type of enum

//    private String role;      TODO convert type of enum

}
