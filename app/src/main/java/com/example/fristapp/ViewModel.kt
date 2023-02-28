package com.example.fristapp

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.CategoryResponse
import com.example.domain.usecase.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ViewModel @Inject constructor(private val GetMealsUseCase: GetMeals) :
    androidx.lifecycle.ViewModel() {

    private val _Categories : MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
    val Categories : StateFlow<CategoryResponse?> = _Categories



    fun getMeals() {

        viewModelScope.launch {
            try {
                _Categories.value = GetMealsUseCase()

            } catch (e:Exception) {
                Log.d("MealsViewModel", e.message.toString())
            }


        }


    }


}