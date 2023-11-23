package com.xjtusports.app.modules.peclasses.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.xjtusports.app.R
import com.xjtusports.app.databinding.RowPeClassesBinding
import com.xjtusports.app.modules.peclasses.`data`.model.PeClassesRowModel
import kotlin.Int
import kotlin.collections.List

class PeClassesAdapter(
  var list: List<PeClassesRowModel>
) : RecyclerView.Adapter<PeClassesAdapter.RowPeClassesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPeClassesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pe_classes,parent,false)
    return RowPeClassesVH(view)
  }

  override fun onBindViewHolder(holder: RowPeClassesVH, position: Int) {
    val peClassesRowModel = PeClassesRowModel()
    // TODO uncomment following line after integration with data source
    // val peClassesRowModel = list[position]
    holder.binding.peClassesRowModel = peClassesRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PeClassesRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: PeClassesRowModel
    ) {
    }
  }

  inner class RowPeClassesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPeClassesBinding = RowPeClassesBinding.bind(itemView)
    init {
      binding.btnThree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeClassesRowModel())
      }
      binding.btnSeven.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeClassesRowModel())
      }
      binding.btnTen.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeClassesRowModel())
      }
      binding.btnFourteen.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeClassesRowModel())
      }
      binding.btnSeventeen.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeClassesRowModel())
      }
      binding.btnTwentyOne.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeClassesRowModel())
      }
      binding.btnTwentyNine.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeClassesRowModel())
      }
      binding.btnThirty.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeClassesRowModel())
      }
    }
  }
}
