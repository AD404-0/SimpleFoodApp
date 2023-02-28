package com.example.data.repositery

import com.example.data.remote.ApiService
import com.example.domain.entity.CategoryResponse
import com.example.domain.repo.MealsRepo

class MealsRepoImepl(private val apiService: ApiService):MealsRepo {
    override suspend fun getMealFromRemote(): CategoryResponse = apiService.getMeals()

}