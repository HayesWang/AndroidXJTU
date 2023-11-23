package com.xjtusports.app.modules.peclasses.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.peclasses.`data`.model.PeClassesModel
import com.xjtusports.app.modules.peclasses.`data`.model.PeClassesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PeClassesVM : ViewModel(), KoinComponent {
  val peClassesModel: MutableLiveData<PeClassesModel> = MutableLiveData(PeClassesModel())

  var navArguments: Bundle? = null

  val peClassesList: MutableLiveData<MutableList<PeClassesRowModel>> =
      MutableLiveData(mutableListOf())
}
