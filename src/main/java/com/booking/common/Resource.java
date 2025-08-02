package com.booking.common;

import java.util.Map;

import lombok.Data;

@Data
public class Resource<T> {
	private Object model;

	private Map<String, Object> _links;

	private HALOptions _options;
}
