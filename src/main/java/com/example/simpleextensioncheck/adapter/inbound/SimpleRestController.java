package com.example.simpleextensioncheck.adapter.inbound;

import com.example.simpleextensioncheck.application.ExtensionStringService;
import com.example.simpleextensioncheck.domain.ExtensionString;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SimpleRestController {
    private final ExtensionStringService service;

    @PostMapping("/extension-string")
    public void postExtensionString(@RequestBody @Validated ExtensionStringRequest extensionStringRequest) {
        final ExtensionString extensionString = extensionStringRequest.toExtensionString();
        service.doSave(extensionString);
    }

    @DeleteMapping("/extension-string")
    public void deleteExtensionString(@RequestBody @Validated ExtensionStringRequest extensionStringRequest) {
        final ExtensionString extensionString = extensionStringRequest.toExtensionString();
        service.delete(extensionString);
    }

    @GetMapping("/expression-list")
    public List<ExtensionString> getExpression() {
        return service.getAll();
    }
}
