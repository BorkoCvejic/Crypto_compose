package com.easycruise.crypto_compose_practice.domain.repository

import com.easycruise.crypto_compose_practice.data.remote.dto.CoinDetailDto
import com.easycruise.crypto_compose_practice.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}