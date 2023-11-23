package com.xjtusports.app.modules.dhi15.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.dhi15.`data`.model.Dhi15Model
import com.xjtusports.app.modules.dhi15.`data`.model.Dhi1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Dhi15VM : ViewModel(), KoinComponent {
  val dhi15Model: MutableLiveData<Dhi15Model> = MutableLiveData(Dhi15Model())

  var navArguments: Bundle? = null

  val List: MutableLiveData<MutableList<Dhi1RowModel>> = MutableLiveData(mutableListOf())
}
