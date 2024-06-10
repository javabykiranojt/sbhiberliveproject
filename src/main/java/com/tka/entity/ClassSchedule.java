package com.tka.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.DayOfWeek;

@Entity
@Table(name = "class_schedules")
@Data
@NoArgsConstructor
public class ClassSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "subject_id", nullable = false)
	private Long subjectId;

	@Column(name = "classroom_id", nullable = false)
	private Long classroomId;

	@Enumerated(EnumType.STRING)
	@Column(name = "day_of_week", nullable = false)
	private DayOfWeek dayOfWeek;

	@Column(name = "start_time", nullable = false)
	private Time startTime;

	@Column(name = "end_time", nullable = false)
	private Time endTime;

	// Constructors, getters, and setters
}
