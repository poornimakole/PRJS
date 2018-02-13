package com.psl.q5;

public class XOGame {

	public char check(char alpha, char[][] mat) {
		for (int i = 0; i < 3; i++) {
			if (mat[i][0] == alpha && mat[i][1] == alpha && mat[i][2] == alpha)
				return alpha;
			if (mat[0][i] == alpha && mat[1][i] == alpha && mat[2][i] == alpha)
				return alpha;
		}

		boolean count = true;
		for (int i = 0; i < 3; i++) {
			if (mat[i][i] != alpha) {
				count = false;
				break;
			}
		}
		if (count)
			return alpha;

		count = true;
		for (int i = 0; i < 3; i++) {
			if (mat[i][2 - i] != alpha) {
				count = false;
				break;
			}
		}
		if (count)
			return alpha;
		else
			return 0;

	}

	char findWinner(char[][] mat) {
		char result = 0;
		result = check('x', mat);
		if (result == 0)
			result = check('o', mat);
		return result;

	}

	void startGame() {
		boolean count = true;
		char matrix[][] = { { 'x', 'o', 'o' }, { 'o', 'x', 'o' },
				{ 'o', 'o', 'x' } };
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] != 'o' && matrix[i][j] != 'x') {
					count = false;
					break;
				}
			}
		if (count) {
			char result = findWinner(matrix);
			if (result == 'o')
				System.out.println("o wins");
			else if (result == 'x')
				System.out.println("x wins");
			else
				System.out.println("draw");
		}

		else
			System.out
					.println("characters other then o and x are not acceptable!!! ");
	}

	public static void main(String[] args) {
		XOGame g = new XOGame();
		g.startGame();

	}

}
