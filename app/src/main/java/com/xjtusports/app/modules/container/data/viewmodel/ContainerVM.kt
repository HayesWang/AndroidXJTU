package com.xjtusports.app.modules.container.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.container.`data`.model.ContainerModel
import org.koin.core.KoinComponent

class ContainerVM : ViewModel(), KoinComponent {
  val containerModel: MutableLiveData<ContainerModel> = MutableLiveData(ContainerModel())

  var navArguments: Bundle? = null
}
