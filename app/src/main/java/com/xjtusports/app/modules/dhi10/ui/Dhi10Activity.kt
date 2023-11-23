package com.xjtusports.app.modules.dhi10.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityDhi10Binding
import com.xjtusports.app.modules.container.ui.ContainerActivity
import com.xjtusports.app.modules.detail.ui.DetailActivity
import com.xjtusports.app.modules.dhi10.`data`.viewmodel.Dhi10VM
import com.xjtusports.app.modules.dhi14.ui.Dhi14Activity
import com.xjtusports.app.modules.freeexercise.ui.FreeExerciseActivity
import com.xjtusports.app.modules.info.ui.InfoActivity
import kotlin.String
import kotlin.Unit

class Dhi10Activity : BaseActivity<ActivityDhi10Binding>(R.layout.activity_dhi_10) {
  private val viewModel: Dhi10VM by viewModels<Dhi10VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dhi10VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewSigninOne.setOnClickListener {
      val destIntent = Dhi14Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSliderSliderexaminegrade.setOnClickListener {
      val destIntent = ContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowyoursemesterp.setOnClickListener {
      val destIntent = DetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewFreeexerciseOne.setOnClickListener {
      val destIntent = FreeExerciseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DHI10ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi10Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
