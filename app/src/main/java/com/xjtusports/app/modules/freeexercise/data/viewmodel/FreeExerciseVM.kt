package com.xjtusports.app.modules.freeexercise.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.xjtusports.app.modules.freeexercise.`data`.model.FreeExerciseModel
import org.koin.core.KoinComponent

class FreeExerciseVM : ViewModel(), KoinComponent {
  val freeExerciseModel: MutableLiveData<FreeExerciseModel> = MutableLiveData(FreeExerciseModel())

  var navArguments: Bundle? = null
}
