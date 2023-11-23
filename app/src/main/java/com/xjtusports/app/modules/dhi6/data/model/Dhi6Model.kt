package com.xjtusports.app.modules.dhi6.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class Dhi6Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoXJTU: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_to_xjtu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHomeValue: String? = null
)
