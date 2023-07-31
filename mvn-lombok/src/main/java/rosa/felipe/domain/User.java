package rosa.felipe.domain;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String email;
}
