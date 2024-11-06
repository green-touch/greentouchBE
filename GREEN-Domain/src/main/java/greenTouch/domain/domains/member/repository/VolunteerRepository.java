package greenTouch.domain.domains.member.repository;

import greenTouch.domain.domains.member.domain.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Long> {
}
