package com.baeldung.um;

import com.baeldung.um.spring.UmPersistenceJpaConfig;
import com.baeldung.um.spring.UmServiceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {UmPersistenceJpaConfig.class, UmServiceConfig.class})
public class SpringBootIntegrationTest {
    @Test
    public void whenContextLoaded_thenNoException() {

    }
}
