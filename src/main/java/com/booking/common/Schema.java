package com.booking.common;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Schema {
	private Map<String, Object> properties;

	private List<Object> required;
}
