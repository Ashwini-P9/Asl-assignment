package com.aslinformationservices.calculator;

public class CustomFeature {

    public double calculateMean(int n,double in[]) {
    	// TODO: Implement custom feature logic
    	  double mean;
    	  double sum=0;
    	  for(int i=0;i<n;i++) {
    		  sum=sum+in[i];
    	  }
        return mean=(sum/n);
    }

	 
	}
