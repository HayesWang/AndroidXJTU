package com.xjtusports.app.modules.dhi12.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class Dhi12Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeterHanson: String? = MyApp.getInstance().resources.getString(R.string.lbl_peter_hanson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourSemesterP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_semester_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortcut: String? = MyApp.getInstance().resources.getString(R.string.lbl_shortcut)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContent: String? = MyApp.getInstance().resources.getString(R.string.lbl_content)
  ,
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
