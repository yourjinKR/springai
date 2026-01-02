package app.springai.domain.openai.service;

import app.springai.domain.openai.dto.UserResponseDTO;
import org.springframework.ai.tool.annotation.Tool;

public class ChatTools {

    @Tool(description = "User personal information : name, age, adress, phone, etc")
    public UserResponseDTO getUserInfoTool() {
        return new UserResponseDTO("유어진", 27L, "성남시", "010-1111-1111", "12345");
    }
}
