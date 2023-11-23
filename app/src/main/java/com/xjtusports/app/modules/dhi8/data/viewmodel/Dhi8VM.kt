package com.xjtusports.app.modules.dhi8.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.dhi8.`data`.model.Dhi8Model
import org.koin.core.KoinComponent

class Dhi8VM : ViewModel(), KoinComponent {
  val dhi8Model: MutableLiveData<Dhi8Model> = MutableLiveData(Dhi8Model())

  var navArguments: Bundle? = null
}
