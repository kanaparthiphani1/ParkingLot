package DTO;

import Models.GenerateTicketResponseStatus;
import Models.Ticket;

public class GenerateTicketResponseDto {
    private Ticket ticket;

    private GenerateTicketResponseStatus status;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public GenerateTicketResponseStatus getStatus() {
        return status;
    }

    public void setStatus(GenerateTicketResponseStatus status) {
        this.status = status;
    }
}
