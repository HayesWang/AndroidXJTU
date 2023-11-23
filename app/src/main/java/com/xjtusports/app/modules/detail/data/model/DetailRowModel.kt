package com.xjtusports.app.modules.detail.`data`.model

import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.di.MyApp
import kotlin.String

data class DetailRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCatagoryA: String? = MyApp.getInstance().resources.getString(R.string.lbl_catagory_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1020: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_20)

)
