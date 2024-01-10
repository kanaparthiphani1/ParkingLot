package Controllers;


import DTO.GenerateTicketRequestDto;
import DTO.GenerateTicketResponseDto;
import Models.GenerateTicketResponseStatus;
import Models.Ticket;
import Services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) {
        Ticket ticket = null;
        try {
            ticket = ticketService.generateTicket(requestDto.getVehicleNumber(), requestDto.getVehicleType(),
                    requestDto.getGateId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);
        responseDto.setStatus(GenerateTicketResponseStatus.SUCCESS);

        return responseDto;
    }

}