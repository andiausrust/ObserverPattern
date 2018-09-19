package com.andi;

import com.andi.interfaces.Observer;
import com.andi.model.EmailTopic;
import com.andi.model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        // create Observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");

        // register them
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        // check for updates
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        // Provider/ Subject (broadcaster)
        firstObserver.update();
        topic.postMessage("Hello Subscriber");



    }
}
