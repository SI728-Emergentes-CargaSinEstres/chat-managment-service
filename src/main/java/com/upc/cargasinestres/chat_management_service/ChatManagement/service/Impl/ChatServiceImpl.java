package com.upc.cargasinestres.chat_management_service.ChatManagement.service.Impl;
import com.upc.cargasinestres.chat_management_service.ChatManagement.model.entity.Chat;
import com.upc.cargasinestres.chat_management_service.ChatManagement.repository.IChatRepository;
import com.upc.cargasinestres.chat_management_service.ChatManagement.service.IChatService;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements IChatService {

    private final IChatRepository chatRepository;

    public ChatServiceImpl(IChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    @Override
    public Long getChatByReservationId(Long reservationId) {
        var chat = chatRepository.findByReservationId(reservationId);
        return chat.getId();
    }

    @Override
    public Chat createChat(Long reservationId) {
        var chat = chatRepository.findByReservationId(reservationId);
        if (chat != null) {
            throw new RuntimeException("Ya existe un chat para esta empresa");
        }
        chat = new Chat();

        chat.setReservationId(reservationId);

        chatRepository.save(chat);

        return chat; // se envia un objeto chat con el companyId ya seteado
    }


}
