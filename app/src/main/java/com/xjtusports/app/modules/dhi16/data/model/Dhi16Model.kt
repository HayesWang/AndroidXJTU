package com.xjtusports.app.modules.dhi16.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class Dhi16Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtYogaWorkout: String? = MyApp.getInstance().resources.getString(R.string.lbl_yoga_workout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuilding36th: String? =
      MyApp.getInstance().resources.getString(R.string.msg_building_3_6th)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninforTod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_for_tod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHomeValue: String? = null
)
