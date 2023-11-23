package com.xjtusports.app.modules.freeexercise.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class FreeExerciseModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourSemesterP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_semester_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPresetRoute: String? = MyApp.getInstance().resources.getString(R.string.lbl_preset_route)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.msg_follow_certain)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeExercise: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_free_exercise2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_exercise_freely)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewExercise: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_exercise)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAgenda: String? = MyApp.getInstance().resources.getString(R.string.lbl_agenda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPEClasses: String? = MyApp.getInstance().resources.getString(R.string.lbl_pe_classes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAgendaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_agenda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPEClassesOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_pe_classes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHomeValue: String? = null
)
