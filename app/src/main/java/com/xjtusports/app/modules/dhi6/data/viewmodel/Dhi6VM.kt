package com.xjtusports.app.modules.dhi6.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.dhi6.`data`.model.Dhi6Model
import org.koin.core.KoinComponent

class Dhi6VM : ViewModel(), KoinComponent {
  val dhi6Model: MutableLiveData<Dhi6Model> = MutableLiveData(Dhi6Model())

  var navArguments: Bundle? = null
}
