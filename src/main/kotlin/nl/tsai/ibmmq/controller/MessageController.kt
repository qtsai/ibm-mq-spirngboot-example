package nl.tsai.ibmmq.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.jms.core.JmsTemplate
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono


@RestController
@RequestMapping("/message")
class MessageController(private val jmsTemplate: JmsTemplate) {

    @Value("\${ibm.mq.queuename}")
    lateinit var queueName: String

    @PostMapping
    fun send(@RequestParam(defaultValue = "Hello World!") message: String) =
        jmsTemplate.convertAndSend(queueName, message)

    @GetMapping
    fun receive() = Mono.just(jmsTemplate.receiveAndConvert(queueName).toString())

}