package com.kamkanakdurga.sms.attendance.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamkanakdurga.sms.attendance.dto.ViewAttendanceStaffDTO;
import com.kamkanakdurga.sms.library.entities.Staff;

@Repository
public interface StaffRepository  extends JpaRepository<Staff, String> {

	List<Staff> findBySchoolCode(BigInteger schoolCode);
}
