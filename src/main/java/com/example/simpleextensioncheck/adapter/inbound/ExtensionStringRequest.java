package com.example.simpleextensioncheck.adapter.inbound;

import com.example.simpleextensioncheck.domain.ExtensionString;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ExtensionStringRequest {

    @Size(min = 1, max = 20)
    private String expression;
    private boolean regularExpression;

    public ExtensionString toExtensionString() {
        return new ExtensionString(null, expression, regularExpression);
    }
}
