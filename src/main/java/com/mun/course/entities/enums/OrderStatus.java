package com.mun.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), 
	PAID(2), 
	SHIPPED(3), 
	DELIVERED(4), 
	CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		switch (code) {
		case 1:
			return WAITING_PAYMENT;

		case 2:
			return PAID;

		case 3:
			return SHIPPED;

		case 4:
			return DELIVERED;

		case 5:
			return CANCELED;

		default:
			throw new IllegalArgumentException("Invalid order status code!");
		}
	}

}
