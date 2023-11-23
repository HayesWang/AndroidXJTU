package com.xjtusports.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityAppNavigationBinding
import com.xjtusports.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.xjtusports.app.modules.container.ui.ContainerActivity
import com.xjtusports.app.modules.detail.ui.DetailActivity
import com.xjtusports.app.modules.dhi10.ui.Dhi10Activity
import com.xjtusports.app.modules.dhi12.ui.Dhi12Activity
import com.xjtusports.app.modules.dhi14.ui.Dhi14Activity
import com.xjtusports.app.modules.dhi15.ui.Dhi15Activity
import com.xjtusports.app.modules.dhi16.ui.Dhi16Activity
import com.xjtusports.app.modules.dhi2.ui.Dhi2Activity
import com.xjtusports.app.modules.dhi4.ui.Dhi4Activity
import com.xjtusports.app.modules.dhi6.ui.Dhi6Activity
import com.xjtusports.app.modules.dhi8.ui.Dhi8Activity
import com.xjtusports.app.modules.freeexercise.ui.FreeExerciseActivity
import com.xjtusports.app.modules.info.ui.InfoActivity
import com.xjtusports.app.modules.peclasses.ui.PeClassesActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linear8.setOnClickListener {
      val destIntent = Dhi16Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear4.setOnClickListener {
      val destIntent = Dhi4Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear5.setOnClickListener {
      val destIntent = Dhi10Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear.setOnClickListener {
      val destIntent = Dhi2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear3.setOnClickListener {
      val destIntent = Dhi6Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear6.setOnClickListener {
      val destIntent = Dhi12Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear1.setOnClickListener {
      val destIntent = Dhi14Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPEClasses.setOnClickListener {
      val destIntent = PeClassesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetail.setOnClickListener {
      val destIntent = DetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear7.setOnClickListener {
      val destIntent = Dhi15Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear2.setOnClickListener {
      val destIntent = Dhi8Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearContainer.setOnClickListener {
      val destIntent = ContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFreeExercise.setOnClickListener {
      val destIntent = FreeExerciseActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
