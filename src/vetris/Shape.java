package vetris;

import vetris.ValMath;

public class Shape {
	public boolean shape[][] = new boolean[4][4];
	public int nShape = 0;
	public int rotation = 0;

	Shape(){
		clear();
	}

	Shape(boolean p_shape[][],int p_nShape,int p_rotation){
		shape = p_shape;
		nShape = p_nShape;
		rotation = p_rotation;
	}

	public void clear(){
		for(int x = 0;x < 4;x++){
			for(int y = 0;y < 4;y++){
				shape[x][y] = false;
			}
		}
	}
	
	public void rotate(){
		rotation++;
		if(rotation > 3){
			rotation = 0;
		}
	}
	
	public void unrotate(){
		rotation--;
		if(rotation < 0){
			rotation = 3;
		}
	}
	
	public void setNShape(int n){
		nShape = n;
	}
	
	public void setRandomShape(){
		rotation = ValMath.randInt(0,4);
		setNShape(ValMath.randInt(0, 7));
	}
	
	public void update(){
		if(nShape == 0){
			setShapeI();
		}
		else if(nShape == 1){
			setShapeJ();
		}
		else if(nShape == 2){
			setShapeL();
		}
		else if(nShape == 3){
			setShapeO();
		}
		else if(nShape == 4){
			setShapeS();
		}
		else if(nShape == 5){
			setShapeT();
		}
		else if(nShape == 6){
			setShapeZ();
		}
	}

	public void setShapeI(){
		clear();
		shape[0][0] = true;
		if(rotation == 0 || rotation == 2){
			shape[0][1] = true;
			shape[0][2] = true;
			shape[0][3] = true;
		}
		else if(rotation == 1 || rotation == 3){
			shape[1][0] = true;
			shape[2][0] = true;
			shape[3][0] = true;
		}
	}
	
	public void setShapeJ(){
		clear();
		if(rotation == 0){
			shape[0][0] = true;
			shape[1][0] = true;
			shape[2][0] = true;
			shape[2][1] = true;
		}
		else if(rotation == 1){
			shape[1][0] = true;
			shape[1][1] = true;
			shape[1][2] = true;
			shape[0][2] = true;
		}
		else if(rotation == 2){
			shape[0][0] = true;
			shape[0][1] = true;
			shape[1][1] = true;
			shape[2][1] = true;
		}
		else if(rotation == 3){
			shape[1][0] = true;
			shape[0][0] = true;
			shape[0][1] = true;
			shape[0][2] = true;
		}
	}
	
	public void setShapeL(){
		clear();
		if(rotation == 0){
			shape[0][1] = true;
			shape[0][0] = true;
			shape[1][0] = true;
			shape[2][0] = true;
		}
		else if(rotation == 1){
			shape[0][0] = true;
			shape[1][0] = true;
			shape[1][1] = true;
			shape[1][2] = true;
		}
		else if(rotation == 2){
			shape[0][1] = true;
			shape[1][1] = true;
			shape[2][1] = true;
			shape[2][0] = true;
		}
		else if(rotation == 3){
			shape[0][0] = true;
			shape[0][1] = true;
			shape[0][2] = true;
			shape[1][2] = true;
		}
	}
	
	public void setShapeO(){
		clear();
		shape[0][0] = true;
		shape[1][0] = true;
		shape[0][1] = true;
		shape[1][1] = true;
	}

	public void setShapeS(){
		clear();
		shape[0][1] = true;
		shape[1][1] = true;
		if(rotation == 0 || rotation == 2){
			shape[1][0] = true;
			shape[2][0] = true;
		}
		else if(rotation == 1 || rotation == 3){
			shape[0][0] = true;
			shape[1][2] = true;
		}
	}

	public void setShapeT(){
		clear();
		shape[1][1] = true;
		if(rotation == 0){
			shape[0][0] = true;
			shape[1][0] = true;
			shape[2][0] = true;
		}
		else if(rotation == 1){
			shape[1][0] = true;
			shape[0][1] = true;
			shape[1][2] = true;
		}
		else if(rotation == 2){
			shape[0][1] = true;
			shape[1][0] = true;
			shape[2][1] = true;
		}
		else if(rotation == 3){
			shape[0][0] = true;
			shape[0][1] = true;
			shape[0][2] = true;
		}
	}

	public void setShapeZ(){
		clear();
		shape[1][0] = true;
		shape[1][1] = true;
		if(rotation == 0 || rotation == 2){
			shape[0][0] = true;
			shape[2][1] = true;
		}
		else if(rotation == 1 || rotation == 3){
			shape[0][1] = true;
			shape[0][2] = true;
		}
	}
}