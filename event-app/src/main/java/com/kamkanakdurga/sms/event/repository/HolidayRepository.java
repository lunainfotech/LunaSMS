package com.kamkanakdurga.sms.event.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.event.dto.HolidayDTO;
import com.kamkanakdurga.sms.library.entities.Holiday;


public interface HolidayRepository  extends JpaRepository<Holiday, Integer> {
	
	@Query(
			"SELECT new com.kamkanakdurga.sms.event.dto.HolidayDTO("
					+ "H.id, "
					+ "H.holidayName, "
					+ "H.holidayFrom, "
					+ "H.holidayTo, "
					+ "H.active "
					+ ") "
					+ "FROM Holiday AS H "
			)
	
	Page<HolidayDTO> findAllHolidayRecords(Pageable pageable);

}
