package com.upc.cargasinestres.chat_management_service.ChatManagement.service;


import com.upc.cargasinestres.chat_management_service.ChatManagement.model.entity.Chat;

public interface IChatService {

    public abstract Long getChatByReservationId(Long reservationId);

    public abstract Chat createChat(Long companyId);

}
