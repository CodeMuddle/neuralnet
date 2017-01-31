package com.codingparadox.ann.processor;

import java.util.ArrayList;
import java.util.List;

import com.codingparadox.ann.datastructure.Layer;
import com.codingparadox.ann.model.Network;

public class NeuralNetwork implements Network {
	
	/*
	 * This stores all the layers in the network.
	 * 
	 * First layer is the input layer.
	 * Last layer is the output layer.
	 * Other layers are the hidden layers.
	 */
	private List<Layer> layers;
	
	/**
	 * The constructor accepts the overall topology
	 * of the neural network.
	 * 
	 * @param topology
	 * 			It is the size of each layer in the network
	 */
	public NeuralNetwork(List<Integer> topology){
		this.layers = new ArrayList<Layer>();
		
		int numberOfLayers = topology.size();

		// initialize all the empty layers
		for(int i=0; i< numberOfLayers; ++i ) {
			this.layers.add(new Layer());
		}
	}

	public void feedForward(List<Double> inputValues) {
		
	}

	public void backPropagate(List<Double> targetValues) {
		
	}

	public List<Double> getResults() {
		List<Double> resultValues = new ArrayList<Double>();
		return resultValues;
		
	}

}
