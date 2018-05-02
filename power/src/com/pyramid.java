package com;

public class pyramid {
	static int maxPathSum(int pyramid[][], int m, int n)
	{
		for (int i = m - 1; i >= 0; i--)
		{
			for (int j = 0; j <= i; j++)
			{
				if (pyramid[i + 1][j] > pyramid[i + 1][j + 1])
					pyramid[i][j] += pyramid[i + 1][j];
				else
					pyramid[i][j] += pyramid[i + 1][j + 1];
			}
		}

		return pyramid[0][0];
	}
	public static void main (String[] args)
	{
		int pyramid[][] = { {3, 0, 0,0},
						{7, 4, 0,0},
						{2, 4, 6,0},
						{8, 5, 9,3}};
		System.out.println ("maximum path sum="+ maxPathSum(pyramid, 3, 3));
	}
}

