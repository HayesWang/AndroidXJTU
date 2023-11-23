package com.xjtusports.app.modules.dhi8.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityDhi8Binding
import com.xjtusports.app.modules.container.ui.ContainerActivity
import com.xjtusports.app.modules.dhi10.ui.Dhi10Activity
import com.xjtusports.app.modules.dhi8.`data`.viewmodel.Dhi8VM
import com.xjtusports.app.modules.info.ui.InfoActivity
import kotlin.String
import kotlin.Unit

class Dhi8Activity : BaseActivity<ActivityDhi8Binding>(R.layout.activity_dhi_8) {
  private val viewModel: Dhi8VM by viewModels<Dhi8VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dhi8VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLoginWithStudentId.setOnClickListener {
      val destIntent = ContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSliderSliderstart.setOnClickListener {
      val destIntent = Dhi10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DHI8ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Dhi8Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
