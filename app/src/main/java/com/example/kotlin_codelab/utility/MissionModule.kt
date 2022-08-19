package com.example.kotlin_codelab.utility

import com.example.kotlin_codelab.repository.MissionRepository
import com.example.kotlin_codelab.viewmodel.MyViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class MissionModule {
    @Provides
    fun provideRepository() : MissionRepository {
        return MissionRepository()
    }
}