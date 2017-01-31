package com.codingparadox.ann.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Layer {
	List<Neuron> layer;
	
	public Layer(){
		this.layer = new ArrayList<Neuron>();
	}
}
