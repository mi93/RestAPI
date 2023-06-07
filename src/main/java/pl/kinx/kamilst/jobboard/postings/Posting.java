package pl.kinx.kamilst.jobboard.postings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
class Posting {
    private Long id;
    private String description;
    private BigDecimal salary;
    private LocalDate expiresAt;
}
