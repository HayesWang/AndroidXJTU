package com.xjtusports.app.modules.detail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.detail.`data`.model.DetailModel
import com.xjtusports.app.modules.detail.`data`.model.DetailRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DetailVM : ViewModel(), KoinComponent {
  val detailModel: MutableLiveData<DetailModel> = MutableLiveData(DetailModel())

  var navArguments: Bundle? = null

  val detailList: MutableLiveData<MutableList<DetailRowModel>> = MutableLiveData(mutableListOf())
}
