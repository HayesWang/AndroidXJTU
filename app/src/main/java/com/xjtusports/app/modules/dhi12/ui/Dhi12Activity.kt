package com.xjtusports.app.modules.dhi12.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityDhi12Binding
import com.xjtusports.app.modules.detail.ui.DetailActivity
import com.xjtusports.app.modules.dhi10.ui.Dhi10Activity
import com.xjtusports.app.modules.dhi12.`data`.viewmodel.Dhi12VM
import com.xjtusports.app.modules.dhi14.ui.Dhi14Activity
import com.xjtusports.app.modules.freeexercise.ui.FreeExerciseActivity
import com.xjtusports.app.modules.info.ui.InfoActivity
import kotlin.String
import kotlin.Unit

class Dhi12Activity : BaseActivity<ActivityDhi12Binding>(R.layout.activity_dhi_12) {
  private val viewModel: Dhi12VM by viewModels<Dhi12VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dhi12VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowyoursemesterp.setOnClickListener {
      val destIntent = DetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSliderSlideronholdraces.setOnClickListener {
      val destIntent = Dhi10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewSigninOne.setOnClickListener {
      val destIntent = Dhi14Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewFreeexerciseOne.setOnClickListener {
      val destIntent = FreeExerciseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DHI12ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi12Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
