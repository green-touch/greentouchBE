package greenTouch.domain.domains.week.repository;

import greenTouch.domain.domains.week.domain.SelectableDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SelectableDayRepository extends JpaRepository<SelectableDay, Long> {
}
