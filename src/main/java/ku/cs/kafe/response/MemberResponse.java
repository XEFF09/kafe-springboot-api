package ku.cs.kafe.response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
public class MemberResponse {
    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String name;
    private String role;
}
