package com.xjtusports.app.modules.info.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityInfoBinding
import com.xjtusports.app.modules.container.ui.ContainerActivity
import com.xjtusports.app.modules.info.`data`.viewmodel.InfoVM
import kotlin.String
import kotlin.Unit

class InfoActivity : BaseActivity<ActivityInfoBinding>(R.layout.activity_info) {
  private val viewModel: InfoVM by viewModels<InfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.infoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageHome.setOnClickListener {
      val destIntent = ContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INFO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InfoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
