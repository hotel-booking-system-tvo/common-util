package com.booking.common;

import lombok.Data;

@Data
public class HALLink {
	private String rel;
	private String title;
	private String href;
	private String method;
	private String mediaType;
	private Schema schema;
}
