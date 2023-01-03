package com.example.simpleextensioncheck;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExtensionStringService {

    private final ExtesionRepository repository;

    public void doSave(ExtensionString extensionString) {
        final boolean isExist = repository.existsByExpression(extensionString.getExpression());
        if (isExist) {
            return;
        }
        repository.save(extensionString);
    }

    public void delete(ExtensionString extensionString) {
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
