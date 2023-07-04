package model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Long ticketId;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "ticket_description", nullable = false, columnDefinition = "TEXT")
    private String ticketDescription;

    @Enumerated(EnumType.STRING)
    @Column(name = "ticket_status", nullable = false)
    private TicketStatus ticketStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "ticket_priority", nullable = false)
    private TicketPriority ticketPriority;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private Administrator assignedTo;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
    
    public Ticket() {
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public TicketPriority getTicketPriority() {
		return ticketPriority;
	}

	public void setTicketPriority(TicketPriority ticketPriority) {
		this.ticketPriority = ticketPriority;
	}

	public Administrator getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(Administrator assignedTo) {
		this.assignedTo = assignedTo;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Ticket(Long ticketId, String customerName, String ticketDescription, TicketStatus ticketStatus,
			TicketPriority ticketPriority, Administrator assignedTo, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.ticketId = ticketId;
		this.customerName = customerName;
		this.ticketDescription = ticketDescription;
		this.ticketStatus = ticketStatus;
		this.ticketPriority = ticketPriority;
		this.assignedTo = assignedTo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}



    // Constructors, getters, and setters

    // ...
}