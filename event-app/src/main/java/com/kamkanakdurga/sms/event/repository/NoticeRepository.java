package com.kamkanakdurga.sms.event.repository;

import java.math.BigInteger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.event.dto.NoticeDTO;
import com.kamkanakdurga.sms.library.entities.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Integer>{
	
	@Query(
			"SELECT new com.kamkanakdurga.sms.event.dto.NoticeDTO("
					+ "N.id, "
					+ "N.schoolCode, "
					+ "N.noticeTitle, "
					+ "N.noticeContent, "
					+ "N.noticeDate "
					+ ") "
					+ "FROM Notice AS N "
			)
	
	Page<NoticeDTO> findAllNoticeRecords(BigInteger schoolCode, Pageable pageable);

}
