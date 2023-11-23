package com.xjtusports.app.modules.dhi0.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.dhi0.`data`.model.Dhi0Model
import org.koin.core.KoinComponent

class Dhi0VM : ViewModel(), KoinComponent {
  val dhi0Model: MutableLiveData<Dhi0Model> = MutableLiveData(Dhi0Model())

  var navArguments: Bundle? = null
}
