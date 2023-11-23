package com.xjtusports.app.modules.appnavigation.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4: String? = MyApp.getInstance().resources.getString(R.string.lbl_42)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2: String? = MyApp.getInstance().resources.getString(R.string.lbl_210)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5: String? = MyApp.getInstance().resources.getString(R.string.lbl_211)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6: String? = MyApp.getInstance().resources.getString(R.string.lbl_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetail: String? = MyApp.getInstance().resources.getString(R.string.lbl_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeExercise: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_free_exercise3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPEClasses: String? = MyApp.getInstance().resources.getString(R.string.lbl_pe_classes2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt8: String? = MyApp.getInstance().resources.getString(R.string.lbl4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContainer: String? = MyApp.getInstance().resources.getString(R.string.lbl_container)

)
