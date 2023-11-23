package com.xjtusports.app.modules.explore.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseFragment
import com.xjtusports.app.databinding.FragmentExploreBinding
import com.xjtusports.app.modules.explore.`data`.viewmodel.ExploreVM
import com.xjtusports.app.modules.freeexercise.ui.FreeExerciseActivity
import kotlin.String
import kotlin.Unit

class ExploreFragment : BaseFragment<FragmentExploreBinding>(R.layout.fragment_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.exploreVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFreeexerciseOne.setOnClickListener {
      val destIntent = FreeExerciseActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "EXPLORE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ExploreFragment {
      val fragment = ExploreFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
