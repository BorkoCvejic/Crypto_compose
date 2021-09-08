package com.easycruise.crypto_compose_practice.data.repository

import com.easycruise.crypto_compose_practice.data.remote.CoinPaprikaApi
import com.easycruise.crypto_compose_practice.data.remote.dto.CoinDetailDto
import com.easycruise.crypto_compose_practice.data.remote.dto.CoinDto
import com.easycruise.crypto_compose_practice.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}