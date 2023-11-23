package com.xjtusports.app.modules.explore.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeexercise: String? = MyApp.getInstance().resources.getString(R.string.lbl_free_exercise)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdvice: String? = MyApp.getInstance().resources.getString(R.string.lbl_advice)

)
