package com.donghyeon.notifier.sns;

import com.donghyeon.TestConfiguration;
import com.donghyeon.notifier.Notifier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
////@ActiveProfiles(profiles = "test")
public class SmsNotifierTest {



    @Test
    public void sendAuthNumber() {
        Notifier.SmsNotifier snsNotifier = new SmsNotifier();
        snsNotifier.sendAuthNumber("01044503070","123456");
    }
}