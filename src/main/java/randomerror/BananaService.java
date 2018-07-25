package randomerror;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class BananaService {
    private final BananaRepo repo;

    @PostConstruct
    private void init(){

        Banana b1=new Banana();
        b1.setName("peter");
        b1.setWeight(7);
        repo.save(b1);
        repo.save(b1);

        Banana b2=new Banana();
        b2.setName("peter");
        b2.setWeight(7);

        repo.save(b2);

        Banana b3=new Banana();
        b3.setName("peter");
        b3.setWeight(7);

        repo.save(b2);
    }
}
