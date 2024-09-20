package com.upc.cargasinestres.chat_management_service.ChatManagement.model.dto.Message.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponseDto {

    private Long id;

    private String content;

    private LocalDateTime messageDate;

    private String userType;
}
