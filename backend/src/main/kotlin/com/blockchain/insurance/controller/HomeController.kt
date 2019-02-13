package com.blockchain.insurance.controller

import com.blockchain.insurance.dto.QuoteDto
import com.blockchain.insurance.repository.QuoteEntity
import com.blockchain.insurance.repository.QuoteRepository
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController()
class HomeController (val repository: QuoteRepository){

    @PutMapping("/quote")
    fun saveQuote(@RequestParam quoteDto: QuoteDto) {
        repository.save(QuoteEntity(quoteDto.firstName, quoteDto.lastName))
    }
}