package edu.hansol.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Event {
	//롬복 테스트
	private int id;
	private String title;
	private String startTime;
	private String endTime;
}
