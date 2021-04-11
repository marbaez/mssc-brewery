package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto findById(UUID id) {
        return CustomerDto.builder()
                .id(id)
                .name("John MacLaughlin")
                .build();
    }
}
