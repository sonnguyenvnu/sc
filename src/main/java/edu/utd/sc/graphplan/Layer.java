package edu.utd.sc.graphplan;

import java.util.Set;

import edu.utd.swsc.planning.problem.Action;

public abstract class Layer {
	int id;
	// nullable
	public Layer prev;
	public Layer next;
	public Set<Action> remainingActions;

	public abstract void computeMu();
}