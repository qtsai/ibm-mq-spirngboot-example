package nl.tsai.ibmmq

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jms.annotation.EnableJms

@SpringBootApplication
@EnableJms
class IbmmqDemoApplication

fun main(args: Array<String>) {
    runApplication<IbmmqDemoApplication>(*args)
}
