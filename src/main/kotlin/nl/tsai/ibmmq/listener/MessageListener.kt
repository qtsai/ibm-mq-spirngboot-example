package nl.tsai.ibmmq.listener

import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component
import javax.jms.Message
import javax.jms.TextMessage

//@Component
class MessageListener {

//    @JmsListener(destination = "DEV.QUEUE.1")
    fun onMessage(p0: Message) {
        if (p0 is TextMessage) {
            println(p0.text)
        }
    }
}