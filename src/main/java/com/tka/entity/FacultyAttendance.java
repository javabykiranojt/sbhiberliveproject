package com.tka.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "faculty_attendance")
@Data
@NoArgsConstructor
public class FacultyAttendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "faculty_id", nullable = false)
	private Faculty faculty;

	@ManyToOne
	@JoinColumn(name = "class_schedule_id", nullable = false)
	private ClassSchedule classSchedule;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String status;

	
}
