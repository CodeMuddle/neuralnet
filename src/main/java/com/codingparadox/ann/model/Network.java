package com.codingparadox.ann.model;

import java.util.List;

/**
 * 
 * It is the simple interface for neural network.
 * All the subsequent classes must implement this interface.
 * 
 * A Network consists of number of neurons.
 * Each neuron is aligned in groups to form a layer.
 * 
 * So, a network is nothing but a bunch of layers.
 *
 */
public interface Network {
	/**
	 * List of input values is provided to the network
	 * through this function. All the input values go 
	 * to the input neurons.
	 * 
	 * @param inputValues 
	 * 			It is the list of floating values
	 */
	public void feedForward(List<Double> inputValues);

	/**
	 * The real back propagation algorithm happens here.
	 * In the back propagation algorithm the error is 
	 * propagated from output neuron back to the previous layers.
	 * It is because we only know expected output of the whole system
	 * and that is seen at output neuron.
	 * 
	 * We can't really know the expected output at hidden layers
	 * because whole neural network is a black box:
	 * 	<i>input</i> ===> <i>output</i>
	 * 
	 * @param targetValues
	 * 			It is the list of expected output values
	 */
	public void backPropagate(List<Double> targetValues);

	public List<Double> getResults();
}
