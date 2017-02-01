package com.codingparadox.ann.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.codingparadox.ann.datastructure.Layer;
import com.codingparadox.ann.model.Network;

public class NeuralNetwork implements Network {
	private static final Logger LOGGER = Logger.getLogger( NeuralNetwork.class.getName() );


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

		LOGGER.info("Initializing neural net with topology " + topology);

		this.layers = new ArrayList<Layer>();

		int numberOfLayers = topology.size();
		
		if( numberOfLayers < 2 ) {
			throw new IllegalArgumentException(String.format("There should be atleast "
					+ "2 layers(input and output) in the network"));
		}

		// initialize all the empty layers
		for(int i=0; i< numberOfLayers; ++i ) {
			if(topology.get(i) < 1) {
				throw new IllegalArgumentException(String.format("The size of layer '%d' cannot "
						+ "be zero or negative", topology.get(i)));
			}
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
