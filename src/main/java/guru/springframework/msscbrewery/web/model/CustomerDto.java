package guru.springframework.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Value
@RequiredArgsConstructor
@Builder(toBuilder = true)
public class CustomerDto {
    UUID id;
    String name;
}
