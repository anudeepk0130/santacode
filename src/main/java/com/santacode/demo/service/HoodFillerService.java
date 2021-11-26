package com.santacode.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HoodFillerService {

	private static int max(int i, int j) {
		return (i > j) ? i : j;
	}

	// Returns the maximum value with knapsack
	// of W capacity
	public static int[] hoodfillerMethod(int W, int n, int[] wt) {

		// dp[i] is going to store maximum value
		// with knapsack capacity i.
		int dp[] = new int[W + 1];

		// Fill dp[] using above recursive formula
		for (int i = 0; i <= W; i++) {
			for (int j = 0; j < n; j++) {
				if (wt[j] <= i) {
					dp[i] = max(dp[i], dp[i - wt[j]]);
				}
			}
		}
		
		
		return dp[W];
	}

}
