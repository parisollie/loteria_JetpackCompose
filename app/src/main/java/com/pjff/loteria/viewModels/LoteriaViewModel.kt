package com.pjff.loteria.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoteriaViewModel: ViewModel() {

    //Vid 73,ponemos una lista vacía.
    private val _lottoNumbers = mutableStateOf(emptyList<Int>())
    //ponemos el tipo de dato.
    val lottoNumbers: State<List<Int>> = _lottoNumbers

    //Hacemos nuesra funcióm.
    fun generateLottoNumbers(){
        //Ponemos el rango de la loteria
        _lottoNumbers.value = (1..60).shuffled().take(6).sorted()
    }

}