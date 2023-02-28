package com.example.fristapp.di

import com.example.data.remote.ApiService
import com.example.data.repositery.MealsRepoImepl
import com.example.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService):MealsRepo{

        return MealsRepoImepl(apiService)

    }
}