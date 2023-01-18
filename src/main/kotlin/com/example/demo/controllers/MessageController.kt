package com.example.demo.controllers

import com.example.demo.models.Message
import com.example.demo.services.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class MessageController {
    @Autowired
    lateinit var  service : MessageService
    @GetMapping("/")
    fun index(): List<Message> = service.findAll()
/*
    @GetMapping("/{id}")
    fun index(@PathVariable id: String): Message? =
        service.findById(id)

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.save(message)
    }*/
}
