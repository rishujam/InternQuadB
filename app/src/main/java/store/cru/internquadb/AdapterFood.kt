package store.cru.internquadb

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import store.cru.internquadb.databinding.ItemFoodBinding

class AdapterFood(
    var items:List<Food>
):RecyclerView.Adapter<AdapterFood.FoodViewHolder>() {
    inner class FoodViewHolder(val binding:ItemFoodBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder(ItemFoodBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.binding.apply {
            tvFoodName.text = items[position].name
            textView2.text =items[position].style
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
