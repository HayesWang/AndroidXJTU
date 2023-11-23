package com.xjtusports.app.modules.detail.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class DetailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYoursemesterp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_semester_p2)

)
