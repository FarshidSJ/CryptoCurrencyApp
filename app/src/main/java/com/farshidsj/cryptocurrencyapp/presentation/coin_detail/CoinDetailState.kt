package com.farshidsj.cryptocurrencyapp.presentation.coin_detail

import com.farshidsj.cryptocurrencyapp.domain.model.Coin
import com.farshidsj.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
