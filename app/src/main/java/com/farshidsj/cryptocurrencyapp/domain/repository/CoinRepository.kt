package com.farshidsj.cryptocurrencyapp.domain.repository

import com.farshidsj.cryptocurrencyapp.data.dto.CoinDetailDto
import com.farshidsj.cryptocurrencyapp.data.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}