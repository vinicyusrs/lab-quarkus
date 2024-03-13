package infrastructure.repositories.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity(name = "election_candidate")
public class ElectionCandidate {
	// Java composta tem que criar um nova classe ElectionCandidateId
	@EmbeddedId
    private ElectionCandidateId id;

    private Integer votes;

    public ElectionCandidateId getId() {
        return id;
    }

    public void setId(ElectionCandidateId id) {
        this.id = id;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public static Object fromDomain(domain.Election election, domain.Candidate candidate, Integer votes) {
        var entity = new ElectionCandidate();

        ElectionCandidateId id = new ElectionCandidateId();
        id.setElectionId(election.id());
        id.setCandidateId(candidate.id());

        entity.setId(id);
        entity.setVotes(votes);

        return entity;
    }

}
