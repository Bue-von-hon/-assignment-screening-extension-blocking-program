package com.example.simpleextensioncheck;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtesionRepository extends JpaRepository<ExtensionString, Long> {
    boolean existsByExpression(String expression);
    ExtensionString findByExpression(String expression);
}
