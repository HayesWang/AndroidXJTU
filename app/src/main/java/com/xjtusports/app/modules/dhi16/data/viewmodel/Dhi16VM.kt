package com.xjtusports.app.modules.dhi16.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.dhi16.`data`.model.Dhi16Model
import com.xjtusports.app.modules.dhi16.`data`.model.Dhi2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Dhi16VM : ViewModel(), KoinComponent {
  val dhi16Model: MutableLiveData<Dhi16Model> = MutableLiveData(Dhi16Model())

  var navArguments: Bundle? = null

  val List: MutableLiveData<MutableList<Dhi2RowModel>> = MutableLiveData(mutableListOf())
}
