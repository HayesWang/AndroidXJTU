package com.xjtusports.app.modules.dhi12.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.dhi12.`data`.model.Dhi12Model
import org.koin.core.KoinComponent

class Dhi12VM : ViewModel(), KoinComponent {
  val dhi12Model: MutableLiveData<Dhi12Model> = MutableLiveData(Dhi12Model())

  var navArguments: Bundle? = null
}
