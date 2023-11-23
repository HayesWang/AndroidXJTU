package com.xjtusports.app.modules.dhi0.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.xjtusports.app.databinding.SlideritemDhi1Binding
import com.xjtusports.app.modules.dhi0.`data`.model.ImageSliderSliderstartModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderstartAdapter(
  val dataList: ArrayList<ImageSliderSliderstartModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderstartModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemDhi1Binding) {
      binding.imageSliderSliderstartModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemDhi1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
