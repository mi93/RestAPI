package pl.kinx.kamilst.jobboard.postings;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/postings")
public class PostingController {

    @GetMapping
    public String getAll() {
        return "GET - getAll";
    }

    @GetMapping("/{id}")
    public Posting getById(@PathVariable Long id) {
        return new Posting(
                id,
                "Praca jako...",
                new BigDecimal(15000),
                LocalDate.now().plusMonths(1)
        );
    }

    @PostMapping
    public String add() {
        return "OK";
    }

    @PutMapping
    public String update() {
        return "OK";
    }

    @DeleteMapping
    public String delete() {
        return "OK";
    }
}
