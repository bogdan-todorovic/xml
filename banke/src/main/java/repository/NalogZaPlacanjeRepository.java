package repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import model.NalogZaPlacanje;

public interface NalogZaPlacanjeRepository extends CrudRepository<NalogZaPlacanje, Integer>{

	@Query("select n " +
		   "from NalogZaPlacanje n " +
		   "where n.datumNaloga = :datumNaloga AND (n.racunDuznika = :brojRacuna OR n.racunPrimaoca = :brojRacuna)")
	public List<NalogZaPlacanje> nadjiPoDatumuIBrojuRacuna(Date datumNaloga, String brojRacuna);
}