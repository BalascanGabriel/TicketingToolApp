package service;

import org.springframework.stereotype.Service;
import model.Ticket;
import model.TicketStatus;
import model.TicketPriority;
import repository.TicketRepository;

import java.util.List;

@Service
public class TicketService {
    
    // Inject the TicketRepository
    private final TicketRepository ticketRepository;
    
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
    
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
    
    public Ticket getTicketById(int id) {
        return ticketRepository.findById(id).orElse(null);
    }
    
    public List<Ticket> getTicketsByStatus(TicketStatus status) {
        return ticketRepository.findByTicketStatus(status);
    }
    
    public List<Ticket> getTicketsByPriority(TicketPriority priority) {
        return ticketRepository.findByTicketPriority(priority);
    }
    
    // Other methods for creating, updating, and deleting tickets
    
}

