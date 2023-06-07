package pl.kinx.kamilst.jobboard.postings;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostingService {
    private final PostingRepository repository;

    public PostingService(PostingRepository repository) {
        this.repository = repository;
    }

    public List<Posting> getAll() {
        return repository.findAll();
    }

    public Optional<Posting> getById(Long id) {
        return repository.findById(id);
    }

    public Posting add(Posting posting) {
        return repository.save(posting);
    }

    public Optional<Posting> update(Long id, Posting newPosting) {
        return repository.findById(id)
                .map(posting -> {
                    newPosting.setId(posting.getId());
                    return repository.save(newPosting);
                        });
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
