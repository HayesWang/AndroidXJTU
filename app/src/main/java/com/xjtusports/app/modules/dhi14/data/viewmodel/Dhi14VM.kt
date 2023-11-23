package com.xjtusports.app.modules.dhi14.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.dhi14.`data`.model.Dhi0RowModel
import com.xjtusports.app.modules.dhi14.`data`.model.Dhi14Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Dhi14VM : ViewModel(), KoinComponent {
  val dhi14Model: MutableLiveData<Dhi14Model> = MutableLiveData(Dhi14Model())

  var navArguments: Bundle? = null

  val List: MutableLiveData<MutableList<Dhi0RowModel>> = MutableLiveData(mutableListOf())
}
