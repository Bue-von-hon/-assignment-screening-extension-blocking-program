package com.example.simpleextensioncheck.adapter.outbound;

import com.example.simpleextensioncheck.domain.ExtensionString;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtesionRepository extends JpaRepository<ExtensionString, Long> {
    boolean existsByExpression(String expression);
    ExtensionString findByExpression(String expression);
}
