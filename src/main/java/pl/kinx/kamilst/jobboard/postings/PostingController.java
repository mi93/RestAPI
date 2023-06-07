package pl.kinx.kamilst.jobboard.postings;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postings")
public class PostingController {

    @GetMapping
    public String getAll() {
        return "GET - getAll";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable String id) {
        return "OK" + id;
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
