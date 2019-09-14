package com.donghyeon.notifier;

public interface Notifier {

    interface EmailNotifier extends Notifier {

    }
    //이미 인터페이스가 Sns이므로 Sns동작을 할 수 있는 사실을 알 수 있다.
    interface SmsNotifier extends Notifier {
        void sendAuthNumber(String phoneNumber,String authNumber);
    }

}
