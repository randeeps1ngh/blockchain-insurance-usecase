package com.blockchain.insurance.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface QuoteRepository  : CrudRepository<QuoteEntity, Long> {

}