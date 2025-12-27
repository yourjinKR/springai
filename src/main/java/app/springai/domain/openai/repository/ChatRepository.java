package app.springai.domain.openai.repository;

import app.springai.domain.openai.entity.ChatEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<ChatEntity, Long> {

    List<ChatEntity> findByUserIdOrderByCreatedAtAsc(String userId);
}
