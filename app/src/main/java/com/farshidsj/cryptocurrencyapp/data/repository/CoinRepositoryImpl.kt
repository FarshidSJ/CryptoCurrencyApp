package com.farshidsj.cryptocurrencyapp.data.repository

import com.farshidsj.cryptocurrencyapp.data.dto.CoinDetailDto
import com.farshidsj.cryptocurrencyapp.data.dto.CoinDto
import com.farshidsj.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.farshidsj.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}