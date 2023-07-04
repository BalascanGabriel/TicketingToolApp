package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import model.Ticket;
import model.TicketPriority;
import model.TicketStatus;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

    // Additional query methods can be declared here if needed
	  List<Ticket> findByTicketStatus(TicketStatus status);

	  List<Ticket> findByTicketPriority(TicketPriority priority);
	  
	  List<Ticket> findAll() ;
}
