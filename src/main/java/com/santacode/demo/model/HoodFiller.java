package com.santacode.demo.model;

import java.util.List;

import lombok.Data;

@Data
public class HoodFiller {

	private Integer hood_capacity;

	private int[] present_weights;

	public Integer getHood_capacity() {
		return hood_capacity;
	}

	public void setHood_capacity(Integer hood_capacity) {
		this.hood_capacity = hood_capacity;
	}

	public int[] getPresent_weights() {
		return present_weights;
	}

	public void setPresent_weights(int[] present_weights) {
		this.present_weights = present_weights;
	}
}