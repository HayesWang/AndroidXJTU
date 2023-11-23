package com.xjtusports.app.modules.peclasses.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class PeClassesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPEClasses: String? = MyApp.getInstance().resources.getString(R.string.lbl_pe_classes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etHomeValue: String? = null
)
