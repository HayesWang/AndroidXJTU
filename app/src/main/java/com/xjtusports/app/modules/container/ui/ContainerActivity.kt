package com.xjtusports.app.modules.container.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityContainerBinding
import com.xjtusports.app.extensions.loadFragment
import com.xjtusports.app.modules.container.`data`.viewmodel.ContainerVM
import com.xjtusports.app.modules.dhi0.ui.Dhi0Fragment
import com.xjtusports.app.modules.explore.ui.ExploreFragment
import com.xjtusports.app.modules.info.ui.InfoActivity
import kotlin.String
import kotlin.Unit

class ContainerActivity : BaseActivity<ActivityContainerBinding>(R.layout.activity_container) {
  private val viewModel: ContainerVM by viewModels<ContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.containerVM = viewModel
    val destFragment = Dhi0Fragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = Dhi0Fragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearHome.setOnClickListener {
      val destFragment = Dhi0Fragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = Dhi0Fragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageExploreOne.setOnClickListener {
      val destFragment = ExploreFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ExploreFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
