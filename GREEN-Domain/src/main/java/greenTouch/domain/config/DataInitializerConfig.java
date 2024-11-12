package greenTouch.domain.config;

import greenTouch.domain.domains.week.domain.SelectableDay;
import greenTouch.domain.domains.week.repository.SelectableDayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.time.DayOfWeek;
import java.util.List;

import static java.util.List.of;

@RequiredArgsConstructor
@Configuration
public class DataInitializerConfig {

    private final SelectableDayRepository selectableDayRepository;

    @Bean
    @Transactional
    public ApplicationRunner DayOfWeekInitializer() {
        return args -> {
            if (selectableDayRepository.count() != 7) {     //TODO 서버에서 유실없이 사용 가능한지(생성이후 변경이 "절대" 없어야함)
                initializeDaysWeek();
            }
        };
    }

    private void initializeDaysWeek() {
        selectableDayRepository.deleteAll();
        selectableDayRepository.saveAll(List.of(
                of(DayOfWeek.MONDAY),
                of(DayOfWeek.TUESDAY),
                of(DayOfWeek.WEDNESDAY),
                of(DayOfWeek.THURSDAY),
                of(DayOfWeek.FRIDAY),
                of(DayOfWeek.SATURDAY),
                of(DayOfWeek.SUNDAY)
        ));
    }

    private SelectableDay of(DayOfWeek dayOfWeek) {
        return SelectableDay.builder()
                .dayOfWeek(dayOfWeek)
                .build();
    }
}
