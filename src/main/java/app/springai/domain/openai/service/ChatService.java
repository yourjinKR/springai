package app.springai.domain.openai.service;

import app.springai.domain.openai.entity.ChatEntity;
import app.springai.domain.openai.repository.ChatRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatRepository chatRepository;

    @Transactional(readOnly = true)
    public List<ChatEntity> readAllChats(String userId) {
        return chatRepository.findByUserIdOrderByCreatedAtAsc(userId);
    }
}
