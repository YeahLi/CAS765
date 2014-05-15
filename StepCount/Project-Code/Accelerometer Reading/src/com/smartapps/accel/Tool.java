package com.smartapps.accel;

//A class for some common tools
public class Tool {
	public double norm(double x, double y, double z){
		double res = (x*x)+(y*y)+(z*z);
		return Math.sqrt(res);
	}
	
	public double clamp(double v, double min, double max){
		if(v > max)
			return max;
		else if (v < min)
			return min;
		else 
			return v;
	}
}
