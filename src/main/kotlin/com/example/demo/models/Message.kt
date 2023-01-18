package com.example.demo.models


import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
data class Message(@Id var id : String?, val text : String)
