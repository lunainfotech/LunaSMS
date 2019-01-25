package com.kamkanakdurga.sms.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.location.entities.Mandal;

public interface MandalRepository extends JpaRepository<Mandal, Integer> {
	@Query(
			"SELECT new com.kamkanakdurga.sms.location.entities.Mandal("
			+ "M.id, "
			+ "M.blockCode, "
			+ "M.blockName, "
			+ "M.districtCode "
			+ ") "
			+ "FROM Mandal as M"
		)
	List<Mandal> findAllMandal();

	@Query(
			"SELECT new com.kamkanakdurga.sms.location.entities.Mandal("
			+ "M.id, "
			+ "M.blockCode, "
			+ "M.blockName, "
			+ "M.districtCode "
			+ ") "
			+ "FROM Mandal as M "
			+ "WHERE M.districtCode = ?1"
		)
	List<Mandal> findMandalByBlockCode(int districtCode);
}
