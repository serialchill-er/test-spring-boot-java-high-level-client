package com.example.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person {

	private String firstName;
	private String lastName;
}
