package com.easycruise.crypto_compose_practice.presentation.coin_detail

import com.easycruise.crypto_compose_practice.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
