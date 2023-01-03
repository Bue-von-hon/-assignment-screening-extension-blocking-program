package com.example.simpleextensioncheck.application;

import com.example.simpleextensioncheck.adapter.outbound.ExtesionRepository;
import com.example.simpleextensioncheck.domain.ExtensionString;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExtensionStringService {

    private final ExtesionRepository repository;

    public void doSave(final ExtensionString extensionString) {
        final boolean isExist = repository.existsByExpression(extensionString.getExpression());
        final long count = repository.count();
        if (count >= 200) {
            return;
        }
        if (isExist) {
            return;
        }
        repository.save(extensionString);
    }

    public void delete(final ExtensionString extensionString) {
        final ExtensionString save = repository.findByExpression(extensionString.getExpression());
        if (save == null) {
            return;
        }
        repository.delete(save);
    }

    public List<ExtensionString> getAll() {
        return repository.findAll();
    }
}
