package com.codingparadox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.codingparadox.ann.processor.NeuralNetwork;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("test");
		
		testANN();
	}
	
	public static void testANN(){
		List<Integer> topology = new ArrayList<Integer>(Arrays.asList(3, 2, 1));
		NeuralNetwork neuralNet = new NeuralNetwork(topology);
		
		List<Double> inputValues = new ArrayList<Double>();
		neuralNet.feedForward(inputValues);

		List<Double> targetValues = new ArrayList<Double>();
		neuralNet.backPropagate(targetValues);

		List<Double> resultValues = neuralNet.getResults();
	}

}
