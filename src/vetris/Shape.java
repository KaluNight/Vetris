package vetris;

public class Shape {
	private final boolean shape[][] = new boolean[4][4];
	private int nShape = 0;
	private int rotation = 0;

	Shape() {
		clear();
	}

	private void clear() {
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				shape[x][y] = false;
			}
		}
	}

	public boolean[][] getShape() {
		return shape;
	}

	public int maxDown() {
		for (int a = 3; a > 0; a--) {
			for (int b = 0; b < 4; b++) {
				if (shape[b][a]) {
					return a;
				}
			}
		}
		return 0;
	}

	public int maxLeft() {
		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 4; b++) {
				if (shape[a][b]) {
					return a;
				}
			}
		}
		return 0;
	}

	public int maxRight() {
		for (int a = 3; a > 0; a--) {
			for (int b = 0; b < 4; b++) {
				if (shape[a][b]) {
					return a;
				}
			}
		}
		return 0;
	}

	public int maxUp() {
		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 4; b++) {
				if (shape[b][a]) {
					return a;
				}
			}
		}
		return 0;
	}

	public void rotate() {
		rotation++;
		if (rotation > 3) {
			rotation = 0;
		}
	}

	public void setRandomShape() {
		rotation = ValMath.randInt(0, 4);
		nShape = ValMath.randInt(0, 7);
	}

	public void setShapeI() {
		clear();
		shape[1][1] = true;
		if (rotation == 0 || rotation == 2) {
			shape[0][1] = true;
			shape[2][1] = true;
			shape[3][1] = true;
		} else if (rotation == 1 || rotation == 3) {
			shape[1][0] = true;
			shape[1][2] = true;
			shape[1][3] = true;
		}
	}

	public void setShapeJ() {
		clear();
		shape[1][1] = true;
		if (rotation == 0) {
			shape[0][1] = true;
			shape[2][1] = true;
			shape[2][2] = true;
		} else if (rotation == 1) {
			shape[1][0] = true;
			shape[1][2] = true;
			shape[0][2] = true;
		} else if (rotation == 2) {
			shape[0][0] = true;
			shape[0][1] = true;
			shape[2][1] = true;
		} else if (rotation == 3) {
			shape[2][0] = true;
			shape[1][0] = true;
			shape[1][2] = true;
		}
	}

	public void setShapeL() {
		clear();
		shape[1][1] = true;
		if (rotation == 0) {
			shape[0][2] = true;
			shape[0][1] = true;
			shape[2][1] = true;
		} else if (rotation == 1) {
			shape[0][0] = true;
			shape[1][0] = true;
			shape[1][2] = true;
		} else if (rotation == 2) {
			shape[0][1] = true;
			shape[2][1] = true;
			shape[2][0] = true;
		} else if (rotation == 3) {
			shape[1][0] = true;
			shape[1][2] = true;
			shape[2][2] = true;
		}
	}

	public void setShapeO() {
		clear();
		shape[0][0] = true;
		shape[1][0] = true;
		shape[0][1] = true;
		shape[1][1] = true;
	}

	public void setShapeS() {
		clear();
		shape[0][1] = true;
		shape[1][1] = true;
		if (rotation == 0 || rotation == 2) {
			shape[1][0] = true;
			shape[2][0] = true;
		} else if (rotation == 1 || rotation == 3) {
			shape[0][0] = true;
			shape[1][2] = true;
		}
	}

	public void setShapeT() {
		clear();
		shape[1][1] = true;
		if (rotation == 0) {
			shape[0][1] = true;
			shape[1][2] = true;
			shape[2][1] = true;
		} else if (rotation == 1) {
			shape[1][0] = true;
			shape[0][1] = true;
			shape[1][2] = true;
		} else if (rotation == 2) {
			shape[0][1] = true;
			shape[1][0] = true;
			shape[2][1] = true;
		} else if (rotation == 3) {
			shape[1][0] = true;
			shape[2][1] = true;
			shape[1][2] = true;
		}
	}

	public void setShapeZ() {
		clear();
		shape[1][0] = true;
		shape[1][1] = true;
		if (rotation == 0 || rotation == 2) {
			shape[0][0] = true;
			shape[2][1] = true;
		} else if (rotation == 1 || rotation == 3) {
			shape[0][1] = true;
			shape[0][2] = true;
		}
	}

	public void setTinyShape() {
		clear();
		shape[0][0] = true;
	}

	public void unrotate() {
		rotation--;
		if (rotation < 0) {
			rotation = 3;
		}
	}

	public void update() {
		if (nShape == 0) {
			setShapeI();
		} else if (nShape == 1) {
			setShapeJ();
		} else if (nShape == 2) {
			setShapeL();
		} else if (nShape == 3) {
			setShapeO();
		} else if (nShape == 4) {
			setShapeS();
		} else if (nShape == 5) {
			setShapeT();
		} else if (nShape == 6) {
			setShapeZ();
		}
	}
}