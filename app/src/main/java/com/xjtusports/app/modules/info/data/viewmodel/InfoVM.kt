package com.xjtusports.app.modules.info.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.info.`data`.model.InfoModel
import org.koin.core.KoinComponent

class InfoVM : ViewModel(), KoinComponent {
  val infoModel: MutableLiveData<InfoModel> = MutableLiveData(InfoModel())

  var navArguments: Bundle? = null
}
