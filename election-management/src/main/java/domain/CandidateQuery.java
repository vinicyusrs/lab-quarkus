package domain;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public interface CandidateQuery {
	class Builder extends CandidateQuery_Builder {}

}
