package com.ty.ams.daoimp;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.ams.dao.AttendanceDao;
import com.ty.ams.entity.Attendance;
import com.ty.ams.repository.AttendanceRepository;
import com.ty.ams.util.AttendanceStatus;

@Repository
public class AttendanceDaoImp implements AttendanceDao {

	@Autowired
	private AttendanceRepository attendanceRepository;

	public Attendance saveAttendance(Attendance attendance) {

		return attendanceRepository.save(attendance);

	}

	public Optional<Attendance> findById(int id) {

		return attendanceRepository.findById(id);
	}

	public Attendance updateAttendance(Attendance attendance) {

		return attendanceRepository.save(attendance);
	}

	public void deleteAttendance(int id) {

		Optional<Attendance> attendance = findById(id);
		attendanceRepository.delete(attendance.get());
	}

	@Override
	public List<Attendance> findAllAttendanceByAttendanceStatusAndEmployeeID(AttendanceStatus status, String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendance> findAllAttendenceByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendance> findAllAttendanceByAttendanceStatusAndDate(AttendanceStatus status, LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
