package com.example.dataform

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.dataform.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel (){
    var namaUSR: String by mutableStateOf("") //revised
     private set
    var noTlp: String by mutableStateOf("")
        private set
    var Alamatt: String by mutableStateOf("") //revised
        private set
    var Email: String by mutableStateOf("") //revised
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String,alm: String,mail:String, jk: String) {
        namaUSR=nm;
        noTlp=tlp;
        Alamatt=alm;
        Email=mail;
        jenisKl=jk;

    }
    fun setJenisK(pilihJK:String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK)
        }
    }
}