package com.xjtusports.app.modules.dhi0.ui

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.xjtusports.app.R
import com.xjtusports.app.appcomponents.base.BaseFragment
import com.xjtusports.app.databinding.FragmentDhi0Binding
import com.xjtusports.app.modules.dhi0.`data`.model.ImageSliderSliderstartModel
import com.xjtusports.app.modules.dhi0.`data`.viewmodel.Dhi0VM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class Dhi0Fragment : BaseFragment<FragmentDhi0Binding>(R.layout.fragment_dhi_0) {
  private val imageUri: Uri = Uri.parse("android.resource://com.xjtusports.app/drawable/img_33878")


  private val imageSliderSliderstartItems: ArrayList<ImageSliderSliderstartModel> =
      arrayListOf(ImageSliderSliderstartModel(image33878 =
  imageUri.toString()),ImageSliderSliderstartModel(image33878 = imageUri.toString()))


  private val viewModel: Dhi0VM by viewModels<Dhi0VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val sliderstartAdapter = SliderstartAdapter(imageSliderSliderstartItems,true)
    binding.imageSliderSliderstart.adapter = sliderstartAdapter
    binding.dhi0VM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderstart.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderstart.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DHI0FRAGMENT"


    fun getInstance(bundle: Bundle?): Dhi0Fragment {
      val fragment = Dhi0Fragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
