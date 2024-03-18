package com.projetosix.projetosix.router;

import jdk.jfr.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class PingRouterTest {
    @InjectMocks
    PingRouter instancia;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);
        // Inicializa os mocks
        // Configure o comportamento do mock
    }

    @Test
    void pingTestRouter (){

         String result =  instancia.ping();


         assertEquals("pong", result);



    }



}