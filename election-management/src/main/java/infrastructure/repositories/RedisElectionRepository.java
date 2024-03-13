package infrastructure.repositories;

import java.util.Map;
import java.util.stream.Collectors;

import domain.Election;
import domain.ElectionRepository;
import io.quarkus.redis.datasource.RedisDataSource;
import io.quarkus.redis.datasource.pubsub.PubSubCommands;
import io.quarkus.redis.datasource.sortedset.SortedSetCommands;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RedisElectionRepository implements ElectionRepository{
	// essa classse é para salvar as votações no Redis
	private final PubSubCommands<String> pubSubCommands;
    private final SortedSetCommands<String, String> commands;

    public RedisElectionRepository(RedisDataSource dataSource) {
        commands = dataSource.sortedSet(String.class, String.class);
        pubSubCommands = dataSource.pubsub(String.class);
    }

    @Override
    public void submit(Election election) {
        Map<String, Double> rank = election.votes().entrySet().stream()
                                           .collect(Collectors.toMap(entry -> entry.getKey().id(),
                                                                     entry -> entry.getValue().doubleValue()));

        commands.zadd("election:" + election.id(), rank);
        pubSubCommands.publish("elections", election.id());
    }


}