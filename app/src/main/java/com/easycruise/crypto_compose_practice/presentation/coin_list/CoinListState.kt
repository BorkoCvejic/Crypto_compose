package com.easycruise.crypto_compose_practice.presentation.coin_list

import com.easycruise.crypto_compose_practice.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
