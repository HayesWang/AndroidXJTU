package com.xjtusports.app.modules.dhi6.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityDhi6Binding
import com.xjtusports.app.modules.container.ui.ContainerActivity
import com.xjtusports.app.modules.dhi10.ui.Dhi10Activity
import com.xjtusports.app.modules.dhi6.`data`.viewmodel.Dhi6VM
import com.xjtusports.app.modules.info.ui.InfoActivity
import kotlin.String
import kotlin.Unit

class Dhi6Activity : BaseActivity<ActivityDhi6Binding>(R.layout.activity_dhi_6) {
  private val viewModel: Dhi6VM by viewModels<Dhi6VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dhi6VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSliderSliderstart.setOnClickListener {
      val destIntent = Dhi10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLoginWithStudentId.setOnClickListener {
      val destIntent = ContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DHI6ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi6Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
