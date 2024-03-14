package infrastructure.schedulers;

import java.util.List;

import domain.Election;
import infrastructure.repositories.RedisElectionRepository;
import infrastructure.repositories.SQLElectionRepository;
import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Sync {
	
	private final SQLElectionRepository sqlRepository;
    private final RedisElectionRepository redisRepository;

    public Sync(SQLElectionRepository sqlRepository, RedisElectionRepository redisRepository) {
        this.sqlRepository = sqlRepository;
        this.redisRepository = redisRepository;
    }

    @Scheduled(cron = "*/10 * * * * ?")
    void sync() {
//    	List<Election> elections = sqlRepository.findAll(); 
    	
//    	elections.forEach(election -> {
//    		Election updated = redisRepository.sync(election);
//    		sqlRepository.sync(updated);
//    	});
//      
    	
    	sqlRepository.findAll().forEach(election -> sqlRepository.sync(redisRepository.sync(election)));
    }

}
