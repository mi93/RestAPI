package pl.kinx.kamilst.jobboard.postings;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
class Posting {
    private Long id;

    @NotNull
    @Length(min = 1, max = 2560)
    private String description;

    @NotNull
    @DecimalMin("1.00")
    private BigDecimal salary;

    @Future
    @NotNull
    private LocalDate expiresAt;

    @NotNull
    @Valid
    private Company company;
}
