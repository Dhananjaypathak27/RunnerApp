package com.inxparticle.runnerapp.ui.viewModels

import androidx.lifecycle.ViewModel
import com.inxparticle.runnerapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}