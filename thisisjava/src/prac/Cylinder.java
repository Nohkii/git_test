package prac;

public class Cylinder {
	
	
	double radius;
	double height;
	//밑넓이 pi * 반지름 제곱
	//겉넓이= 2* 및넓이 + 옆넓이= 2 pi r2+ 2 pi 높이
	//부피= 및넓이*높이
	
	double getVolume(){
		return (Math.PI*(radius*radius))*height;
	}
	
	double getArea(){
		return 2*(Math.PI*(radius*radius))+(2*Math.PI)*height;
	}
}
