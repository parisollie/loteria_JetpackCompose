package com.pjff.loteria.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ContadorViewModel: ViewModel() {

    //Vid 71
    //Las variables deben ser privadas en ViewModel , el contador inicia en 0
    private val _contador = mutableStateOf(0)
    //diferenciamos del guion bajo para saber quien es la privada , en state ponemos el tipo de dato.
    //La private es la que vamos a manipular en el ViewModel , el contador publico solo trae el resultadp
    val contador : State<Int> = _contador

    //Declaramos nuestra función.
    fun add(){
        _contador.value = _contador.value + 1
    }

    //Vid 72, no es recomendable usar esto
   // var contador = mutableStateOf(0)


}