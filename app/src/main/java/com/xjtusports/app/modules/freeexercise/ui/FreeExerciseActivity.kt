package com.xjtusports.app.modules.freeexercise.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseActivity
import com.xjtusports.app.databinding.ActivityFreeExerciseBinding
import com.xjtusports.app.modules.detail.ui.DetailActivity
import com.xjtusports.app.modules.freeexercise.`data`.viewmodel.FreeExerciseVM
import com.xjtusports.app.modules.info.ui.InfoActivity
import com.xjtusports.app.modules.peclasses.ui.PeClassesActivity
import kotlin.String
import kotlin.Unit

class FreeExerciseActivity :
    BaseActivity<ActivityFreeExerciseBinding>(R.layout.activity_free_exercise) {
  private val viewModel: FreeExerciseVM by viewModels<FreeExerciseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.freeExerciseVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackagenda.setOnClickListener {
      val destIntent = PeClassesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSemesterprogre.setOnClickListener {
      val destIntent = DetailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageInfo.setOnClickListener {
      val destIntent = InfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FREE_EXERCISE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FreeExerciseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
