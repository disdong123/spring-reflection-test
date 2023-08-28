package kr.disdong.spring.reflection.test.srt.jackson

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

class AS : JsonSerializer<String>() {
    override fun serialize(value: String?, gen: JsonGenerator?, serializers: SerializerProvider?) {
        gen?.writeString("hello")
    }
}

@SpringBootApplication
class ServerApplication

fun main(args: Array<String>) {
    runApplication<ServerApplication>(*args)
}
